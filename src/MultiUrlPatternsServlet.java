import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Weicheng on 3/9/2018.
 */
@WebServlet(urlPatterns = {"/multi", "*.do"})
public class MultiUrlPatternsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        resp.getWriter().printf("Access from /multi and anything.do %s", name);
    }
}
