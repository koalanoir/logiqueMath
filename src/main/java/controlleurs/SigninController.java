package controlleurs;

import classused.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

/***
 * controle l'acces à la page d'acceuil
 */
@WebServlet(urlPatterns = "/home")
public class SigninController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req,resp);
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("user_name");
        String pwd = req.getParameter("user_pwd");
        HttpSession session=req.getSession();

        try {
            if(Utilisateur.isUser(login,pwd)|session.getAttribute("pseudo")!=null){ // verifie si l'utilisateur existe dans la base donnée ou s'il est déja connecté
                session.setAttribute("bscores",Utilisateur.getBestScores());
                session.setAttribute("pseudo",Utilisateur.getPseudo(login,pwd));
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
