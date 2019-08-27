import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

public class Controller extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("page");
        Connection conn = null;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");
        } catch (Exception e) {
            e.printStackTrace();
        }

        switch (page) {
            case "index.html": {
                String user = request.getParameter("user");
                String pass = request.getParameter("pass");
                String actor = request.getParameter("actor");
                try {

                    PreparedStatement pst = conn.prepareStatement("Select * from registered where username=?");

                    pst.setString(1, user);

                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        if (rs.getString("password").equals(pass) && rs.getString("actor").equals(actor)) {

                            HttpSession session = request.getSession(true);
                            
                            session.setAttribute("id", user);
                            out.println("WELCOME " + user);
                            out.print("<br>");
                            if (actor.equals("Admin")) {
                                RequestDispatcher rd = request.getRequestDispatcher("/Admin.html");
                                rd.include(request, response);
                            } else if (actor.equals("Faculty")) {
                                RequestDispatcher rd = request.getRequestDispatcher("/Faculty.html");
                                rd.include(request, response);
                            } else if (actor.equals("Student")) {
                                RequestDispatcher rd = request.getRequestDispatcher("/student.jsp");
                                rd.include(request, response);
                            } else if (actor.equals("Teaching Assistant")) {
                                RequestDispatcher rd = request.getRequestDispatcher("/ta.html");
                                rd.include(request, response);
                            }

                        } else {
                            out.println("Incorrect login credentials");
                            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
                            rd.include(request, response);
                        }
                    } else {
                        out.println("Incorrect login credentials");
                        RequestDispatcher rd = request.getRequestDispatcher("/index.html");
                        rd.include(request, response);
                    }

                } catch (Exception e) {
                    e.printStackTrace();

                }
                break;
            }
            case "Register.html": {

                String user = request.getParameter("user");
                String pass = request.getParameter("pass");
                String actor = request.getParameter("actor");
                String name = request.getParameter("name");
                String id = request.getParameter("id");
                try {

                    PreparedStatement pst = conn.prepareStatement("insert into registered values(?,?,?,?,?)");

                    pst.setString(1, user);
                    pst.setString(2, pass);
                    pst.setString(3, actor);
                    pst.setString(4, name);
                    pst.setString(5, id);

                    int i = pst.executeUpdate();
                    if (i > 0) {
                        out.println("Registration Successful...");
                        Statement newtable = conn.createStatement();
                       
                        if(!actor.equals("Admin"))
                        {
                            newtable.executeUpdate("create table "+id+" ( courses varchar(80) )");
                        }
                        
                        
//                        HttpSession session=request.getSession(false);  
//                        if(session!=null)
//                        {
//                            out.println("user:"+(String)session.getAttribute("id"));
//                        }
                        RequestDispatcher rd = request.getRequestDispatcher("/Register.html");
                        rd.include(request, response);
                    } else {
                        out.println("Some Error Occurred !!");
                    }

                } catch (Exception e) {
                    out.print("Some Error Occurred !!");

                }
                break;
            }
        }
    }
}
