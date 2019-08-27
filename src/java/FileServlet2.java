import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class FileServlet2 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        Connection conn = null;
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "13414790");
        } catch (Exception e) {
            e.printStackTrace();
        }

     

                if (ServletFileUpload.isMultipartContent(request)) {
                    try {
                        List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                        for (FileItem item : multiparts) {
                            if (!item.isFormField()) {
                                String name = new File(item.getName()).getName();
                                item.write(new File("/home/praagy/Downloads/upload2" + File.separator + name));
                            }
                        }

                        out.println("File Uploaded Successfully");

                    } catch (Exception e) {
                        out.print("Some Error Occurred !!");
                    }
                }
                RequestDispatcher rd = request.getRequestDispatcher("/upsub.jsp");
                rd.include(request, response);
        
    }
}
