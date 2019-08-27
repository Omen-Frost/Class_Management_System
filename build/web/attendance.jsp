
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            String cid = (String) session.getAttribute("crs");
        %>

        Chosen course = <%=cid%>


        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");
      
                PreparedStatement pst = conn.prepareStatement("select * from "+cid+" where student IS NOT NULL");
                

                ResultSet rs = pst.executeQuery();

        %>


        <form method="post" action="FacultyServlet">  
            
            <%  while (rs.next()) {
            String roll=rs.getString("student");
            %>
            <input type='checkbox' name="a" value= <%=roll%>> <%=roll%> <br>
                <% } %>
                
                
            




            <input type="hidden" name="page" value="attendance.jsp">
            <input type="submit" value="Update" />
        </form>

        <%     } catch (Exception e) {
                out.println("some error occurred");
            }
        %>



    </body>
</html>
