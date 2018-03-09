import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * Created by Weicheng on 3/9/2018.
 */
@WebServlet(urlPatterns = "/first")
public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        //Read Http headers
        String strHost = request.getHeader("Host");

        //Content-Type
        String strContentType = request.getContentType();

        //url parameters, http://localhost/hello?username=weicheng
        String strName = request.getParameter("username");

        //Access request body, for images, files
        BufferedReader reader = request.getReader();

        response.getWriter().write("First Servlet Response.");
    }
}
