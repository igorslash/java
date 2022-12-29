package Servlet.URLOtherName;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/FirstServlet")
public class FirstServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        String string = request.getParameter("userName");
        printWriter.println(string);
        printWriter.println("<a href='SecondServlet?uname=" + string + "'>visit</a>");
        printWriter.close();
    }
}
