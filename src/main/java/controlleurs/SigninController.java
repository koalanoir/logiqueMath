package controlleurs;

import classused.util.CreateCookie;
import sql.connexionBD;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
        connexionBD user=new connexionBD();

        try {
            if(user.isUser(login,pwd)){
                CreateCookie.CreateCookie(req,resp,"pseudo",user.getPseudo(login,pwd));
                System.out.print(user.getPseudo(login,pwd));
                System.out.print("   cookie  :  ");
                System.out.print(CreateCookie.getCookieValue(req,"pseudo"));
                req.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(req, resp);
            }
            else
                req.getSession().setAttribute("log","identifiants invalides");
                req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req,resp);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
