package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class grade_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t     label{\n");
      out.write("\t\t\t      margin:10px 390px;\n");
      out.write("\t\t\t }\n");
      out.write("\t\t     body{\n");
      out.write("\t\t\t\t background-color:#E1D7C3;\n");
      out.write("\t\t\t\t }\n");
      out.write("\t\t\t\t  div {\n");
      out.write("            border-radius: 4px;\n");
      out.write("            background-color: #FDFFD0;\n");
      out.write("            padding: 20px;\n");
      out.write("             }\n");
      out.write("\t\t\t .center{\n");
      out.write("\t\t   margin:auto;\n");
      out.write("\t\t   width:60%;\n");
      out.write("\t\t   \n");
      out.write("\t\t }\n");
      out.write("\t\t\t \n");
      out.write("\t\t     input[type=text],select {\n");
      out.write("                  width: 25%;\n");
      out.write("                  padding: 12px 20px;\n");
      out.write("                  margin: 10px 400px;\n");
      out.write("                  display: inline-block;\n");
      out.write("                  border: 1px solid #ccc;\n");
      out.write("                  border-radius: 4px;\n");
      out.write("                  \n");
      out.write("               }   \n");
      out.write("\t\t\t  input[type=submit] {\n");
      out.write("                  width: 25%;\n");
      out.write("                  background-color: #4CAF50;\n");
      out.write("                  color: white;\n");
      out.write("                  padding: 14px 20px;\n");
      out.write("                  margin: 10px 400px;\n");
      out.write("                  border: none;\n");
      out.write("                  border-radius: 4px;\n");
      out.write("                  cursor: pointer;\n");
      out.write("               }\n");
      out.write("\t\t      input[type=submit]:hover {\n");
      out.write("                   background-color:#45a049;\n");
      out.write("               }\n");
      out.write("             \n");
      out.write("\t\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t<div class=\"center\">\n");
      out.write("        Select assignment & student and store grade<br>\n");
      out.write("\n");
      out.write("        ");

            String cid = (String)session.getAttribute("crs");
        
      out.write("\n");
      out.write("\n");
      out.write("        Chosen course = ");
      out.print(cid);
      out.write("\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"FacultyServlet\">  \n");
      out.write("            <select name=\"a\">\n");
      out.write("\n");
      out.write("                <option>Assignment 1</option>\n");
      out.write("                <option>Assignment 2</option>\n");
      out.write("                <option>Assignment 3</option>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <label>Student's Roll No.</label><br /><input type=\"text\" name=\"roll\"/> <br/><br/>\n");
      out.write("            \n");
      out.write("            <label>Enter marks</label><br /> <input type=\"text\" name=\"grade\"/> <br/><br/>\n");
      out.write("            <input type=\"hidden\" name=\"page\" value=\"grade.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Submit\" />\n");
      out.write("        </form>\n");
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
