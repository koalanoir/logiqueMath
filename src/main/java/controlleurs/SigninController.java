package controlleurs;

import classused.GenererExpression;
import classused.Utilisateur;
import classused.util.CreateCookie;
import com.sun.net.httpserver.HttpServer;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/home")
public class SigninController extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("user_name");
        String pwd = req.getParameter("user_pwd");
        try {
            if(Utilisateur.isUser(login,pwd)){
                CreateCookie.CreateCookie(req,resp,"pseudo",Utilisateur.getPseudo(login,pwd));
                req.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(req, resp);
            }
            else
                req.getRequestDispatcher("/WEB-INF/view/inscription.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
