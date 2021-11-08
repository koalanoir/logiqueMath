package controlleurs;

import classused.Utilisateur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import sql.connexionBD;

@WebServlet(urlPatterns = "/verif")
public class SignupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        connexionBD con=new connexionBD();
        con.getCon();
        // recupere les valeurs du formulaire d'inscription
        String login = req.getParameter("user_name");
        String pwd = req.getParameter("user_pwd");
        String pwdbi = req.getParameter("user_pwd_bi");

        //verifie les valeurs rentrées
        if(pwd.equals("")|pwdbi.equals("")|login.equals(""))
        {

        }
        else if(login.equals(pwdbi)){
        }
        //ajoute l'utilisateur à la base donnée et redirige vers la page d'authentification
        else {
            Utilisateur.addUser(login,pwd);
            req.getRequestDispatcher("/WEB-INF/view/inscription.jsp").forward(req,resp);
        }
    }
}