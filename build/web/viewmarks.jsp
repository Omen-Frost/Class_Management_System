

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
		<style>
		
		   body{
				 background-color:#E1D7C3;
				 }
		
        table {
        border-collapse: collapse;
        width: 100%;
        }

th, td {
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {background-color: #f2f2f2;}
</style>
    </head>
    <body>

        <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");

                String roll = (String) session.getAttribute("roll");

                PreparedStatement pst = conn.prepareStatement("select * from A1 where student=?");
                pst.setString(1, roll);
                ResultSet rs1 = pst.executeQuery();
                pst = conn.prepareStatement("select * from A2 where student=?");
                pst.setString(1, roll);
                ResultSet rs2 = pst.executeQuery();
                pst = conn.prepareStatement("select * from A3 where student=?");
                pst.setString(1, roll);
                ResultSet rs3 = pst.executeQuery();


        %>


        <h4> Assignment 1</h4>


        <TABLE BORDER="1">
            <TR>
                <TH>Course ID</TH>
                <TH>Marks</TH>
            </TR>
            <% while (rs1.next()) {
%>
            <TR>
                <TD> <%= rs1.getString("course")%></TD>
                <TD> <%= rs1.getString("grade")%></TD>
            </TR>
            <%
                } %>
        </TABLE>
        
        <h4> Assignment 2</h4>


        <TABLE BORDER="1">
            <TR>
                <TH>Course ID</TH>
                <TH>Marks</TH>
            </TR>
            <% while (rs2.next()) {
%>
            <TR>
                <TD> <%= rs2.getString("course")%></TD>
                <TD> <%= rs2.getString("grade")%></TD>
            </TR>
            <%
                } %>
        </TABLE>
        
        <h4> Assignment 3</h4>


        <TABLE BORDER="1">
            <TR>
                <TH>Course ID</TH>
                <TH>Marks</TH>
            </TR>
            <% while (rs3.next()) {
%>
            <TR>
                <TD> <%= rs3.getString("course")%></TD>
                <TD> <%= rs3.getString("grade")%></TD>
            </TR>
            <%
                } %>
        </TABLE>

        <%
            } catch (Exception e) {
                out.println("some error occurred");
            }
        %>

    </body>
</html>
