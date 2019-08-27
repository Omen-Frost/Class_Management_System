package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;

public final class down_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("   <style>\n");
      out.write("     div {\n");
      out.write("            border-radius: 4px;\n");
      out.write("            background-color: #FDFFD0;\n");
      out.write("            padding: 20px;\n");
      out.write("             }\n");
      out.write("\t\t\t .center{\n");
      out.write("\t\t   margin:auto;\n");
      out.write("\t\t   width:60%;\n");
      out.write("\t\t   \n");
      out.write("\t\t }\n");
      out.write("\t\t a:link, a:visited {\n");
      out.write("             background-color: #4CAF50;\n");
      out.write("             color: white;\n");
      out.write("             padding: 14px 20px;\n");
      out.write("             text-align: center;\n");
      out.write("             text-decoration: none;\n");
      out.write("             display: inline-block;\n");
      out.write("\t\t\t margin: 10px 300px;\n");
      out.write("             }\n");
      out.write("\t\t\t a:hover,a:active {\n");
      out.write("              background-color:#45a049;\n");
      out.write("             }\n");
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
      out.write("  margin:10px 300px;\n");
      out.write("  padding: 8px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {background-color: #f2f2f2;}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <div class=\"center\">\n");
      out.write("  <table>\n");
      out.write("      <tr><th>File Name</th><th>Download File</th>\n");
      out.write("        ");

            File f = new File("/home/praagy/Downloads/upload");
            File[] files = f.listFiles();
            for(int i=0;i<files.length;i++){
            String name=files[i].getName();
            String path=files[i].getPath();
        
      out.write("\n");
      out.write("      <tr><td>");
      out.print(name);
      out.write("</td><td><a href=\"download.jsp?f=");
      out.print(path);
      out.write("\" class=\"button\">Download File</a></td></tr>\n");
      out.write("        ");

        }
        
      out.write("\n");
      out.write("   </table>\n");
      out.write("  </div>\n");
      out.write("<body>\n");
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
