package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style type=\"text/css\">\n");
      out.write("            body{\n");
      out.write("                display: inline-block;\n");
      out.write("                background-color:#E1D7C3;\n");
      out.write("            }\n");
      out.write("            label.one{\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("            label.two{\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            select {\n");
      out.write("                width: 25%;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                margin: 10px 550px;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            a.one:link, a.one:visited {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("            a.two:link, a.two:visited {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("            a.three:link, a.three:visited {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("            a.four:link, a.four:visited {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("            a.five:link, a.five:visited {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("            a.six:link, a.six:visited {\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                text-decoration: none;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 10px 600px;\n");
      out.write("            }\n");
      out.write("            a:hover,a:active {\n");
      out.write("                background-color:#45a049;\n");
      out.write("            }\n");
      out.write("        </style>\n");
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

                pst = conn.prepareStatement("select * from " + fid);
                rs = pst.executeQuery();

        
      out.write("\n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <label><strong>Please select one of your courses:-</strong></label>\n");
      out.write("        <form method=\"post\">  \n");
      out.write("            <select name=\"crs\">\n");
      out.write("                ");
  while (rs.next()) {
      out.write("\n");
      out.write("                <option>");
      out.print( rs.getString(1));
      out.write("</option>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <input type=\"submit\" value=\"Select\" />\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    ");

//                if(request.getParameter("crs")!=null)
//                {
        //session.setAttribute("crs", "C1");
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <a class=\"one\" href=\"assign.jsp\" class=\"button\" >Upload Assignments</a>  \n");
      out.write("    <br>\n");
      out.write("    <a class=\"two\" href=\"view.jsp\">View Submissions</a>  \n");
      out.write("    <br>\n");
      out.write("    <p><a class=\"three\" href=\"grade.jsp\">Store evaluation scores</a><label class=\"one\"><em>(for Assignments)</em></label></p>\n");
      out.write("    <br>\n");
      out.write("    <p><a class=\"four\" href=\"attendance.jsp\">Attendance Records</a> <label class=\"two\"><em>Update attendance.</em></label></p>\n");
      out.write("    <br>\n");
      out.write("    <a class=\"five\" href=\"sdetail.jsp\"> View Student Details</a> \n");
      out.write("    <br> \n");
      out.write("    <br>\n");
      out.write("    <a class=\"six\" href=\"logout.jsp\" >Logout</a>\n");
      out.write("\n");
      out.write("    ");

                 } catch (Exception e) {
            out.print(e);
        }
    
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
