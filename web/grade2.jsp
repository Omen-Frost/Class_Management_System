
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
        Select student and store grade<br>

        <%
            String cid = (String)session.getAttribute("crs");
        %>

        Chosen course = <%=cid%>

        <form method="post" action="FacultyServlet">  
            
            <label>Student's Roll No.</label><br /><input type="text" name="roll"/> <br/><br/>
            <label>Select Grade</label><br />
            <select name="a">
                <option>Ex</option>
                <option>A</option>
                <option>B</option>
                <option>C</option>
                <option>D</option>
                <option>P</option>
                <option>F</option>
            </select>
            <br/><br/>
            <input type="hidden" name="page" value="grade2.jsp">
            <input type="submit" value="Submit" />
        </form>



      </div>
    </body>
</html>
