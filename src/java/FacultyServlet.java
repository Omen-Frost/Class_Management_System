import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

public class FacultyServlet extends HttpServlet {

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

            case "create_course.html": {
                String course = request.getParameter("course");
                String info = request.getParameter("info");
                String id = request.getParameter("id");
                String uname = null, fid = null;
                try {
                    Statement st = conn.createStatement();
                    st.executeUpdate("create table " + id + " ( student varchar(80), faculty varchar(80),ta varchar(80),grade varchar(80), course varchar(80),info varchar(80), attendance int DEFAULT 0 )");
                    PreparedStatement pst = conn.prepareStatement("insert into " + id + "(faculty,course,info) values(?,?,?)");

                    HttpSession session = request.getSession(false);
                    if (session != null) {
                        uname = (String) session.getAttribute("id");
                    }

                    PreparedStatement pst2 = conn.prepareStatement("Select * from registered where username = ?");
                    pst2.setString(1, uname);
                    ResultSet rs = pst2.executeQuery();
                    if (rs.next()) {
                        fid = rs.getString(5);
                    }
                    pst.setString(1, fid);
                    pst.setString(2, course);
                    pst.setString(3, info);

                    pst.executeUpdate();
                    pst2 = conn.prepareStatement("insert into " + fid + " values(?)");
                    pst2.setString(1, id);
                    pst2.executeUpdate();
                    
                    pst=conn.prepareStatement(" insert into course (cid) values(?)");
                    pst.setString(1, id);
                    pst.executeUpdate();
                    
                    out.println("Course creation Successful...");
                    out.print("<br>");
                    RequestDispatcher rd = request.getRequestDispatcher("/create_course.html");
                    rd.include(request, response);

                } catch (Exception e) {

                    out.print("Some Error Occurred !!");
                    System.out.println(e);

                }
                break;
            }
            case "enroll.html": {
                String cid = request.getParameter("cid");
                String sid = request.getParameter("sid");

                try {
                    PreparedStatement pst = conn.prepareStatement("insert into " + sid + " values(?)");
                    pst.setString(1, cid);

                    pst.executeUpdate();

                    pst = conn.prepareStatement("insert into " + cid + "(student) values(?)");
                    pst.setString(1, sid);

                    pst.executeUpdate();

                    out.println("Student Enrolled Successfully...");
                    out.print("<br>");
                    RequestDispatcher rd = request.getRequestDispatcher("/enroll.html");
                    rd.include(request, response);

                } catch (Exception e) {
                    out.print("Some Error Occurred !!");
                    System.out.println(e);
                }
                break;
            }
            case "add_ta.html": {
                String cid = request.getParameter("cid");
                String sid = request.getParameter("sid");

                try {
                    PreparedStatement pst = conn.prepareStatement("insert into " + sid + " values(?)");
                    pst.setString(1, cid);

                    pst.executeUpdate();

                    pst = conn.prepareStatement("insert into " + cid + "(ta) values(?)");
                    pst.setString(1, sid);

                    pst.executeUpdate();

                    out.println("Operation Successful...");
                    out.print("<br>");
                    RequestDispatcher rd = request.getRequestDispatcher("/add_ta.html");
                    rd.include(request, response);

                } catch (Exception e) {
                    out.print("Some Error Occurred !!");
                    System.out.println(e);
                }
                break;
            }
            case "grade.jsp": {

                HttpSession session = request.getSession(false);
                String cid = (String) session.getAttribute("crs");

                String a = request.getParameter("a");
                String roll = request.getParameter("roll");
                String grade = request.getParameter("grade");
                PreparedStatement pst = null;
                try {
                    switch (a) {
                        case "Assignment 1": {
                            pst = conn.prepareStatement("insert into A1 values(?,?,?)");
                            break;
                        }
                        case "Assignment 2": {
                            pst = conn.prepareStatement("insert into A2 values(?,?,?)");
                            break;
                        }
                        case "Assignment 3": {
                            pst = conn.prepareStatement("insert into A3 values(?,?,?)");
                            break;
                        }

                    }

                    pst.setString(1, cid);
                    pst.setString(2, roll);
                    pst.setString(3, grade);

                    pst.executeUpdate();

                    out.println("Operation Successful...");
                    out.print("<br>");
                    RequestDispatcher rd = request.getRequestDispatcher("/grade.jsp");
                    rd.include(request, response);

                } catch (Exception e) {
                    out.print("Some Error Occurred !!");
                    System.out.println(e);
                }
                break;
            }
            case "grade2.jsp": {

                HttpSession session = request.getSession(false);
                String cid = (String) session.getAttribute("crs");

                String a = request.getParameter("a");
                String roll = request.getParameter("roll");

                PreparedStatement pst = null;
                try {
                    pst = conn.prepareStatement("update " + cid + " set grade=? where student=?");

                    pst.setString(1, a);
                    pst.setString(2, roll);

                    pst.executeUpdate();

                    out.println("Operation Successful...");
                    out.print("<br>");
                    RequestDispatcher rd = request.getRequestDispatcher("/grade2.jsp");
                    rd.include(request, response);

                } catch (Exception e) {
                    out.print("Some Error Occurred !!");
                    System.out.println(e);
                }
                break;
            }
            case "attendance.jsp": {

                HttpSession session = request.getSession(false);
                String cid = (String) session.getAttribute("crs");

                String[] stu = request.getParameterValues("a");

                PreparedStatement pst = null;

                for (String s : stu) {
                    try {
                        pst = conn.prepareStatement("update " + cid + " set attendance=attendance+1 where student=?");

                        pst.setString(1, s);

                        pst.executeUpdate();

                    } catch (Exception e) {
                        out.print("Some Error Occurred !!");
                        System.out.println(e);
                    }
                }

                out.println("Operation Successful...");
                out.print("<br>");
                RequestDispatcher rd = request.getRequestDispatcher("/courses.jsp");
                rd.include(request, response);

                break;
            }

        }
    }
}
