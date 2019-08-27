
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<style type="text/css">
		     label{
			      margin:10px 390px;
			 }
		     body{
				 background-color:#E1D7C3;
				 }
				  div {
            border-radius: 4px;
            background-color: #FDFFD0;
            padding: 20px;
             }
			 .center{
		   margin:auto;
		   width:60%;
		   
		 }
			 
		     input[type=text],select {
                  width: 25%;
                  padding: 12px 20px;
                  margin: 10px 400px;
                  display: inline-block;
                  border: 1px solid #ccc;
                  border-radius: 4px;
                  
               }   
			  input[type=submit] {
                  width: 25%;
                  background-color: #4CAF50;
                  color: white;
                  padding: 14px 20px;
                  margin: 10px 400px;
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
	<div class="center">
        Select assignment & student and store grade<br>

        <%
            String cid = (String)session.getAttribute("crs");
        %>

        Chosen course = <%=cid%>

        <form method="post" action="FacultyServlet">  
            <select name="a">

                <option>Assignment 1</option>
                <option>Assignment 2</option>
                <option>Assignment 3</option>

            </select>
            <label>Student's Roll No.</label><br /><input type="text" name="roll"/> <br/><br/>
            
            <label>Enter marks</label><br /> <input type="text" name="grade"/> <br/><br/>
            <input type="hidden" name="page" value="grade.jsp">
            <input type="submit" value="Submit" />
        </form>



      </div>
    </body>
</html>
