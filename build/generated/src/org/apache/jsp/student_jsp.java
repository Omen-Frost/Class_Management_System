package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Welcome..</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t\t<style type=\"text/css\">\n");
      out.write("\t\t         body{\n");
      out.write("\t\t\t     display: inline-block;\n");
      out.write("\t\t\t\t background-color:#E1D7C3;\n");
      out.write("\t\t\t\t }\n");
      out.write("\t\t\t\t  a.one:link, a.one:visited {\n");
      out.write("             background-color: #4CAF50;\n");
      out.write("             color: white;\n");
      out.write("             padding: 14px 20px;\n");
      out.write("             text-align: center;\n");
      out.write("             text-decoration: none;\n");
      out.write("             display: inline-block;\n");
      out.write("\t\t\t margin: 10px 600px;\n");
      out.write("             }\n");
      out.write("\t\t\t a.two:link, a.two:visited {\n");
      out.write("             background-color: #4CAF50;\n");
      out.write("             color: white;\n");
      out.write("             padding: 14px 20px;\n");
      out.write("             text-align: center;\n");
      out.write("             text-decoration: none;\n");
      out.write("             display: inline-block;\n");
      out.write("\t\t\t margin: 10px 650px;\n");
      out.write("             }\n");
      out.write("\t\t\t \n");
      out.write("\t\t\t a.three:link, a.three:visited {\n");
      out.write("             background-color: #4CAF50;\n");
      out.write("             color: white;\n");
      out.write("             padding: 14px 20px;\n");
      out.write("             text-align: center;\n");
      out.write("             text-decoration: none;\n");
      out.write("             display: inline-block;\n");
      out.write("\t\t\t margin: 10px 630px;\n");
      out.write("             }\n");
      out.write("\t\t\t a.four:link, a.four:visited {\n");
      out.write("             background-color: #4CAF50;\n");
      out.write("             color: white;\n");
      out.write("             padding: 14px 20px;\n");
      out.write("             text-align: center;\n");
      out.write("             text-decoration: none;\n");
      out.write("             display: inline-block;\n");
      out.write("\t\t\t margin: 10px 675px;\n");
      out.write("             }\n");
      out.write("             \n");
      out.write("              a.five:link, a.five:visited {\n");
      out.write("             background-color: #4CAF50;\n");
      out.write("             color: white;\n");
      out.write("             padding: 14px 20px;\n");
      out.write("             text-align: center;\n");
      out.write("             text-decoration: none;\n");
      out.write("             display: inline-block;\n");
      out.write("\t\t\t margin: 10px 675px;\n");
      out.write("             }\n");
      out.write("\t\t\t a:hover,a:active {\n");
      out.write("              background-color:#45a049;\n");
      out.write("             }\n");
      out.write("\t\t\t\t \n");
      out.write("\t\t</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("\n");
      out.write("        <a class=\"one\" href=\"sc.jsp\" class=\"button\">View enrolled Courses Information</a>  \n");
      out.write("        <br>\n");
      out.write("        <a class=\"two\" href=\"upsub.jsp\">Upload submission</a>  \n");
      out.write("        <br>\n");
      out.write("        <a class=\"three\" href=\"viewmarks.jsp\">View assignment marks</a>  \n");
      out.write("        <br>\n");
      out.write("        <a class=\"five\" href=\"assign2.jsp\">View assignments</a>  \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <a class=\"four\" href=\"logout.jsp\" >Logout</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
