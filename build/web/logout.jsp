<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bye:(</title>
        <style type="text/css">
            h1{
                text-align:center;
            }

            input[type=submit] {
                margin:20px 550px;
                width: 25%;
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;

                border: none;
                border-radius: 4px;
                cursor: pointer;
            }
            input[type=submit]:hover {
                background-color:#45a049;
            }
        </style>
    </head>
    <body>
        <h1>You have successfully logged out!</h1>
        <%
            session = request.getSession(false);
            session.invalidate();

        %>

        <form method="post" action="index.html"">  
        
        <input type="submit" value="Login" />
        </form>

    </body>
</html>
