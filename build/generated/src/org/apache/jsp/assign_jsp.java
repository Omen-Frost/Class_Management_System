package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class assign_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <title>File Uploading Form</title>\n");
      out.write("\t  <style type=\"text/css\">\n");
      out.write("\t          body{\n");
      out.write("\t\t\t     display: inline-block;\n");
      out.write("\t\t\t\t background-color:#E1D7C3;\n");
      out.write("\t\t\t\t }\n");
      out.write("\t\t\t\t div {\n");
      out.write("            border-radius: 4px;\n");
      out.write("            background-color: #FDFFD0;\n");
      out.write("            padding: 20px;\n");
      out.write("             }\n");
      out.write("\t         .custom-file-upload {\n");
      out.write("              border: 1px solid #ccc;\n");
      out.write("              display: inline-block;\n");
      out.write("              padding: 6px 12px;\n");
      out.write("              cursor: pointer;\n");
      out.write("              }\n");
      out.write("\t         input[type=submit] {\n");
      out.write("                  width: 50%;\n");
      out.write("\t\t\t\t  text-align:center;\n");
      out.write("                  background-color: #4CAF50;\n");
      out.write("                  color: white;\n");
      out.write("                  padding: 10px 10px;\n");
      out.write("                  margin: 10px 10px;\n");
      out.write("                  border: none;\n");
      out.write("                  border-radius: 4px;\n");
      out.write("                  cursor: pointer;\n");
      out.write("               }\n");
      out.write("\t\t      input[type=submit]:hover {\n");
      out.write("                   background-color:#45a049;\n");
      out.write("               }\t\n");
      out.write("\t  </style>\n");
      out.write("   </head>\n");
      out.write("   \n");
      out.write("   <body>\n");
      out.write("   <div>\n");
      out.write("      <h3>File Upload:</h3>\n");
      out.write("      <label class=\"custom-file-upload\">Select a file to upload: <br />\n");
      out.write("      <form action = \"FileServlet\" method = \"post\"\n");
      out.write("         enctype = \"multipart/form-data\">\n");
      out.write("         <input type = \"file\" name = \"file\" size = \"50\" /></label>\n");
      out.write("         <br />\n");
      out.write("         <input type=\"hidden\" name=\"page\" value=\"assign.jsp\">\n");
      out.write("         <input type = \"submit\" value = \"Upload File\" margin=10px auto />\n");
      out.write("      </form>\n");
      out.write("\t </div>\n");
      out.write("   </body>\n");
      out.write("   \n");
      out.write("</html>");
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
