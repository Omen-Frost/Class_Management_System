

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
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");

                String roll = (String) session.getAttribute("roll");
                
                PreparedStatement pst = conn.prepareStatement("select * from course");

                ResultSet rs = pst.executeQuery();
                

        %>

  
            <h2> Your Courses</h2>
        
        
        <TABLE BORDER="1">
            <TR>
                <TH>Course ID</TH>
                <TH>Course Name</TH>
                <TH>Attendance</TH>
                <TH>Grade</TH>
                <TH>Course info</TH>
                <TH>Faculty</TH>
            </TR>
            <% while(rs.next()){
                
            pst = conn.prepareStatement("select * from "+rs.getString("cid")+" where student=?");
            pst.setString(1, roll);
            ResultSet rs2 = pst.executeQuery();  
            pst = conn.prepareStatement("select * from "+rs.getString("cid")+" where faculty IS NOT NULL");
            ResultSet rs3 = pst.executeQuery();  
            rs3.next();
            if(rs2.next()){
            
            %>
            <TR>
                <TD> <%= rs.getString("cid") %></td>
                <TD> <%= rs3.getString("course") %></TD>
                <TD> <%= rs2.getString("attendance") %></TD>
                <TD> <%= rs2.getString("grade") %></TD>
                <TD> <%= rs3.getString("info") %></TD>
                <TD> <%= rs3.getString("faculty") %></TD>
            </TR>
            <%} } %>
        </TABLE>
        
    <%
        } catch (Exception e) {
            out.println("some error occurred");
        }
    %>

</body>
</html>
