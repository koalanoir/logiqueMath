package controlleurs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/inscription")
public class inscriptionController extends HttpServlet{
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
                ServletException, IOException {
            req.getRequestDispatcher("/WEB-INF/view/inscription.jsp").forward(req,resp);
        }
}

