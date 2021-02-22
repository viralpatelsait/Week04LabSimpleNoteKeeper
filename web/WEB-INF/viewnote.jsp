<%-- 
    Document   : viewnote
    Created on : Feb 21, 2021, 2:01:33 AM
    Author     : 834171
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <div>
            <p>Title:</p>${note.title}<br>
            <p>Contents:</p>${note.contents}<br>
            <p><a href="note?edit">Edit</a></p>
        </div>
        </form>
    </body>
</html>
