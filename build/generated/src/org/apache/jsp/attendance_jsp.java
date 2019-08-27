package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class attendance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t.container {\n");
      out.write("  display: block;\n");
      out.write("  position: relative;\n");
      out.write("  padding-left: 35px;\n");
      out.write("  margin-bottom: 12px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  font-size: 22px;\n");
      out.write("  -webkit-user-select: none;\n");
      out.write("  -moz-user-select: none;\n");
      out.write("  -ms-user-select: none;\n");
      out.write("  user-select: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Hide the browser's default checkbox */\n");
      out.write(".container input {\n");
      out.write("  position: absolute;\n");
      out.write("  opacity: 0;\n");
      out.write("  cursor: pointer;\n");
      out.write("  height: 0;\n");
      out.write("  width: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create a custom checkbox */\n");
      out.write(".checkmark {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  left: 0;\n");
      out.write("  height: 25px;\n");
      out.write("  width: 25px;\n");
      out.write("  background-color: #eee;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* On mouse-over, add a grey background color */\n");
      out.write(".container:hover input ~ .checkmark {\n");
      out.write("  background-color: #ccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* When the checkbox is checked, add a blue background */\n");
      out.write(".container input:checked ~ .checkmark {\n");
      out.write("  background-color: #2196F3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Create the checkmark/indicator (hidden when not checked) */\n");
      out.write(".checkmark:after {\n");
      out.write("  content: \"\";\n");
      out.write("  position: absolute;\n");
      out.write("  display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Show the checkmark when checked */\n");
      out.write(".container input:checked ~ .checkmark:after {\n");
      out.write("  display: block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Style the checkmark/indicator */\n");
      out.write(".container .checkmark:after {\n");
      out.write("  left: 9px;\n");
      out.write("  top: 5px;\n");
      out.write("  width: 5px;\n");
      out.write("  height: 10px;\n");
      out.write("  border: solid white;\n");
      out.write("  border-width: 0 3px 3px 0;\n");
      out.write("  -webkit-transform: rotate(45deg);\n");
      out.write("  -ms-transform: rotate(45deg);\n");
      out.write("  transform: rotate(45deg);\n");
      out.write("}\n");
      out.write("\t\t    body{\n");
      out.write("\t\t\t\t background-color:#E1D7C3;\n");
      out.write("\t\t\t\t }\n");
      out.write("\t\t    input[type=checkbox]{\n");
      out.write("                  width: 25%;\n");
      out.write("                  padding: 12px 20px;\n");
      out.write("                  margin: 10px 550px;\n");
      out.write("                  display: inline-block;\n");
      out.write("                  border: 1px solid #ccc;\n");
      out.write("                  border-radius: 4px;\n");
      out.write("                  \n");
      out.write("               }   \n");
      out.write("             div {\n");
      out.write("            border-radius: 4px;\n");
      out.write("            background-color: #FDFFD0;\n");
      out.write("            padding: 20px;\n");
      out.write("             }\n");
      out.write("\t\t    input[type=submit] {\n");
      out.write("\t\t\t      margin:20px 10px;\n");
      out.write("                  width: 25%;\n");
      out.write("                  background-color: #4CAF50;\n");
      out.write("                  color: white;\n");
      out.write("                  padding: 14px 20px;\n");
      out.write("                  \n");
      out.write("                  border: none;\n");
      out.write("                  border-radius: 4px;\n");
      out.write("                  cursor: pointer;\n");
      out.write("               }\n");
      out.write("\t\t      input[type=submit]:hover {\n");
      out.write("                   background-color:#45a049;\n");
      out.write("               }\n");
      out.write("\t\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <div>\n");
      out.write("        ");

            String cid = (String) session.getAttribute("crs");
        
      out.write("\n");
      out.write("\n");
      out.write("        <h4>Chosen course =  ");
      out.print(cid);
      out.write("</h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");
      
                PreparedStatement pst = conn.prepareStatement("select * from "+cid+" where student IS NOT NULL");
                

                ResultSet rs = pst.executeQuery();

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"FacultyServlet\">  \n");
      out.write("            \n");
      out.write("            ");
  while (rs.next()) {
            String roll=rs.getString("student");
            
      out.write("\n");
      out.write("\t\t\t<label class=\"container\">\n");
      out.write("            <input type=\"checkbox\" checked=\"checked\" name=\"a\" value= ");
      out.print(roll);
      out.write(' ');
      out.write(' ');
      out.print(roll);
      out.write(" \n");
      out.write("\t\t\t  <span class=\"checkmark\"></span>\n");
      out.write("\t\t\t  </label><br />\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("             \n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"page\" value=\"attendance.jsp\"/>\n");
      out.write("            <input type=\"submit\" value=\"Update\" />\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");
     } catch (Exception e) {
                out.println("some error occurred");
            }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("      </div>\n");
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
