
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

                PreparedStatement pst = conn.prepareStatement("select * from " + cid + " where student IS NOT NULL");

                ResultSet rs = pst.executeQuery();                
        %>


        <h2> Student Details</h2>
        
        
        <TABLE BORDER="1">
            <TR>
                <TH>Roll No</TH>
                <TH>Name</TH>
                <TH>Attendance</TH>
                <TH>Grade</TH>
            </TR>
            <% while(rs.next()){
                
            pst = conn.prepareStatement("select * from  registered where id=?");
            pst.setString(1, rs.getString("student"));
            ResultSet rs2 = pst.executeQuery();  
            rs2.next();
            
            %>
            <TR>
                <TD> <%= rs.getString("student") %></td>
                <TD> <%= rs2.getString("name") %></TD>
                <TD> <%= rs.getString("attendance") %></TD>
                <TD> <%= rs.getString("grade") %></TD>
                
            </TR>
            <% } %>
        </TABLE>




        <%     } catch (Exception e) {
                out.println("some error occurred");
            }
        %>



    </body>
</html>
