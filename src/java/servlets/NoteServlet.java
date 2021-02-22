/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 834171
 */
public class NoteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");

        BufferedReader br = new BufferedReader(new FileReader(new File(path)));
        
        String titleView = br.readLine();
        String contentsView = br.readLine();
        
        Note note = new Note();
        note.setTitle(titleView);
        note.setContents(contentsView);
        request.setAttribute("note", note);
        br.close();
        
        if(request.getParameter("edit")==null){
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        }
        else{
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
         
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path,false)));
         
        String titleEdit = request.getParameter("title");
        String contentsEdit = request.getParameter("contents");
        pw.write(titleEdit);
        pw.write(contentsEdit);
        pw.close();
      
        Note note = new Note();
        note.setTitle(titleEdit);
        note.setContents(contentsEdit);
        request.setAttribute("note", note);
   
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
    }
 
}
