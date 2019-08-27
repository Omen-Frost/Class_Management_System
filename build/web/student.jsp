

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<html>
    <head>
        <title>Welcome..</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<style type="text/css">
		         body{
			     display: inline-block;
				 background-color:#E1D7C3;
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
			 margin: 10px 650px;
             }
			 
			 a.three:link, a.three:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 630px;
             }
			 a.four:link, a.four:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 675px;
             }
             
              a.five:link, a.five:visited {
             background-color: #4CAF50;
             color: white;
             padding: 14px 20px;
             text-align: center;
             text-decoration: none;
             display: inline-block;
			 margin: 10px 675px;
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

                session.setAttribute("roll", fid);

            } catch (Exception e) {
                out.println("some error occurred");
            }
        %>

        <a class="one" href="sc.jsp" class="button">View enrolled Courses Information</a>  
        <br>
        <a class="two" href="upsub.jsp">Upload submission</a>  
        <br>
        <a class="three" href="viewmarks.jsp">View assignment marks</a>  
        <br>
        <a class="five" href="down.jsp">View assignments</a>  
        <br>
        
        

        <br><br>
        <a class="four" href="logout.jsp" >Logout</a>
    </body>
</html>

