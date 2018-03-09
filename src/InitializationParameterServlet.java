import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Created by Weicheng on 3/9/2018.
 */
@WebServlet(urlPatterns = {"/initial"},
            initParams =
                    {@WebInitParam(name = "connectionString", value="server=...")})
public class InitializationParameterServlet extends HttpServlet {
    String _connectionString;


    @Override
    public void init() throws ServletException {
        _connectionString = getInitParameter("connectionString");
    }
}
