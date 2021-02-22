<%-- 
    Document   : editnote
    Created on : Feb 21, 2021, 2:02:10 AM
    Author     : 834171
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Simple Note Keeper</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action="note" method="post">
            <p>Title:<input type="text" name="title" value="${title}"></p><br>
            <p>Contents:<textarea name="contents">${content}</textarea></p><br>
            <input type="submit" value="save">
        </form>
    </body>
</html>
