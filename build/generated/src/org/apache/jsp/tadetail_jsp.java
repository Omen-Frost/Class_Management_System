package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class tadetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");

            String cid = (String) session.getAttribute("crs");
        
      out.write("\n");
      out.write("\n");
      out.write("        Chosen course = ");
      out.print(cid);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");

                PreparedStatement pst = conn.prepareStatement("select * from " + cid + " where ta IS NOT NULL");

                ResultSet rs = pst.executeQuery();                
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <h2> TA Details</h2>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <TABLE BORDER=\"1\">\n");
      out.write("            <TR>\n");
      out.write("                <TH>Employee ID</TH>\n");
      out.write("                <TH>Name</TH>\n");
      out.write("            </TR>\n");
      out.write("            ");
 while(rs.next()){
                
            pst = conn.prepareStatement("select * from  registered where id=?");
            pst.setString(1, rs.getString("ta"));
            ResultSet rs2 = pst.executeQuery();  
            rs2.next();
            
            
      out.write("\n");
      out.write("            <TR>\n");
      out.write("                <TD> ");
      out.print( rs.getString("ta") );
      out.write("</td>\n");
      out.write("                <TD> ");
      out.print( rs2.getString("name") );
      out.write("</TD>\n");
      out.write("                \n");
      out.write("            </TR>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </TABLE>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
     } catch (Exception e) {
                out.println("some error occurred");
            }
        
      out.write("\n");
      out.write("\n");
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
