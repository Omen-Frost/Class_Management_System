

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<style type="text/css">
		     body{
			     display: inline-block;
				 background-color:#E1D7C3;
				 }
				 label.one{
		         margin: 10px 600px;
		          }
				  label.two{
		         margin: 10px 600px;
		          }
				  label.three{
		         margin: 10px 600px;
		          }
				select {
                  width: 25%;
                  background-color: #4CAF50;
                  color: white;
                  padding: 14px 20px;
                  margin: 10px 550px;
                  border: none;
                  border-radius: 4px;
                  cursor: pointer;
               }
			 a.one:link, a.one:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a.two:link, a.two:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a:hover,a:active {
              background-color:#45a049;
             }
			 a.three:link, a.three:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a.four:link, a.four:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a.five:link, a.five:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a.six:link, a.six:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a.seven:link, a.seven:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a.eight:link, a.eight:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a.nine:link, a.nine:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 600px;
             }
			 a:hover,a:active {
              background-color:#45a049;
             }
		</style>
    </head>
    <body>

        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");

                String uname = (String) session.getAttribute("id");
                PreparedStatement pst = conn.prepareStatement("select * from registered where username=?");
                pst.setString(1, uname);

                ResultSet rs = pst.executeQuery();
                String fid = null;
                if (rs.next()) {
                    fid = rs.getString(5);
                }

                pst = conn.prepareStatement("select * from " + fid);
                rs = pst.executeQuery();

        %>

    <center>
       <label> <strong>Select one of your courses:-</strong></label>
        <form method="post">  
            <select name="crs">
                <%  while (rs.next()) {%>
                <option><%= rs.getString(1)%></option>
                <% } %>
            </select>
            <input type="submit" value="Select" />
        </form>
    </center>

    <%
        session.setAttribute("crs", (String)request.getParameter("crs"));
    %>


    <a class="one" href="assign.jsp" class="button" >Upload Assignments</a>  
    <br>
    <a class="two" href="down2.jsp">View Submissions</a>  
    <br>
    <p><a class="three" href="grade.jsp">Store evaluation scores</a><br><label class="one"><em>(for Assignments)</em></label></p>
    <br>
    <a class="four" href="grade2.jsp">Store Course Grade</a>
    <br>
    <p><a class="five"  href="attendance.jsp">Attendance Records</a> <label class="two"><em>Update attendance.</em></label></p>
    <br>
    <p><a class="six" href="eligible.jsp">Check eligibility of Students</a> <label class="three"><em>On the basis of attendance</em></label></p>
    <br>
    <br>
    <a class="seven" href="sdetail.jsp"> View Student Details</a> 
    <br>
    <a class="eight" href="tadetail.jsp"> View TA Details</a> 
    <br>
    <a class="nine" href="Faculty.html" >Go Back</a>
    
    <%
        } catch (Exception e) {
            out.print(e);
        }
    %>

</body>
</html>
