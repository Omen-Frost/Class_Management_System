
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<style type="text/css">
		       label{
			      margin:10px 360px;
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
			 
		     input[type=number]{
                  width: 25%;
                  padding: 12px 20px;
                  margin: 10px 360px;
                  display: inline-block;
                  border: 1px solid #ccc;
                  border-radius: 4px;
                 }
              input[type=submit] {
                  width: 25%;
                  background-color: #4CAF50;
                  color: white;
                  padding: 14px 20px;
                  margin: 10px 360px;
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
        <%
            String cid = (String) session.getAttribute("crs");
        %>

        Chosen course = <%=cid%>


        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");

                PreparedStatement pst = conn.prepareStatement("select * from " + cid + " where student IS NOT NULL");

                ResultSet rs = pst.executeQuery();

        %>


        <form method="post">  

            <label><strong>Select eligibility threshold</label></strong><br /><input type='number' name="t"><br/>
            <input type="submit" value="Select" />

        </form>
        Following students are not eligible
        <%           
            if (request.getParameter("t") != null) {

                while (rs.next()) {
                    if (rs.getInt("attendance") < Integer.parseInt(request.getParameter("t"))) {
                        %>
                        <br> <%= rs.getString("student")%><br>
                        <%
                    }
                }
            }
        %>




        <%     } catch (Exception e) {
                out.println("some error occurred");
            }
        %>


      </div>
    </body>
</html>
