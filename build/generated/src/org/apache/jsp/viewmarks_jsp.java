package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewmarks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\t\t<style>\n");
      out.write("\t\t\n");
      out.write("\t\t   body{\n");
      out.write("\t\t\t\t background-color:#E1D7C3;\n");
      out.write("\t\t\t\t }\n");
      out.write("\t\t\n");
      out.write("        table {\n");
      out.write("        border-collapse: collapse;\n");
      out.write("        width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("th, td {\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {background-color: #f2f2f2;}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

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


        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h4> Assignment 1</h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("                <TH>Course ID</TH>\n");
      out.write("                <TH>Marks</TH>\n");
      out.write("            </TR>\n");
      out.write("            ");
 while (rs1.next()) {

      out.write("\n");
      out.write("            <TR>\n");
      out.write("                <TD> ");
      out.print( rs1.getString("course"));
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs1.getString("grade"));
      out.write("</TD>\n");
      out.write("            </TR>\n");
      out.write("            ");

                } 
      out.write("\n");
      out.write("        </TABLE>\n");
      out.write("        \n");
      out.write("        <h4> Assignment 2</h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("                <TH>Course ID</TH>\n");
      out.write("                <TH>Marks</TH>\n");
      out.write("            </TR>\n");
      out.write("            ");
 while (rs2.next()) {

      out.write("\n");
      out.write("            <TR>\n");
      out.write("                <TD> ");
      out.print( rs2.getString("course"));
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs2.getString("grade"));
      out.write("</TD>\n");
      out.write("            </TR>\n");
      out.write("            ");

                } 
      out.write("\n");
      out.write("        </TABLE>\n");
      out.write("        \n");
      out.write("        <h4> Assignment 3</h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("                <TH>Course ID</TH>\n");
      out.write("                <TH>Marks</TH>\n");
      out.write("            </TR>\n");
      out.write("            ");
 while (rs3.next()) {

      out.write("\n");
      out.write("            <TR>\n");
      out.write("                <TD> ");
      out.print( rs3.getString("course"));
      out.write("</TD>\n");
      out.write("                <TD> ");
      out.print( rs3.getString("grade"));
      out.write("</TD>\n");
      out.write("            </TR>\n");
      out.write("            ");

                } 
      out.write("\n");
      out.write("        </TABLE>\n");
      out.write("\n");
      out.write("        ");

            } catch (Exception e) {
                out.println("some error occurred");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
