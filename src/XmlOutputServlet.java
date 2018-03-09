import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Weicheng on 3/9/2018.
 */
@WebServlet(urlPatterns = "/hello")
public class XmlOutputServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        response.sendRedirect("/login");

        resp.setContentType("text/xml");
        resp.setHeader("X-Custom-Header", "my app");
        PrintWriter out = resp.getWriter();

        out.write("<message>Hello World</message>");
    }
}
