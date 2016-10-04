package net.kiennt.ejbdemo.servlet;

import net.kiennt.ejbdemo.ejb.Kien;
import net.kiennt.ejbdemo.model.Common;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kiennguyen on 10/4/16.
 */
public class KienServlet extends HttpServlet {
    @EJB(name = "KienEJB")
    private Kien ejb;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletOutputStream out = response.getOutputStream();
        out.println("<html><body>");
        out.println("<p>Servlet says hey.</p>");
        Common common = new Common();
        out.println("<p>" + common.sayHello() + "</p>");
        out.println("<p>" + ejb.sayHey() + "</p>");
        out.println("</body></html>");
        out.flush();
    }
}
