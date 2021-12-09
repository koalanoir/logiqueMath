package controlleurs;

import classused.Utilisateur;
import sql.connexionBD;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/***
 * verifie les champs saisis dans la page d'inscription
 */
@WebServlet(urlPatterns = "/verif")
public class SignupController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        connexionBD con=new connexionBD();
        con.getCon();
        resp.setContentType("text/html");
        // recupere les valeurs du formulaire d'inscription
        String login = req.getParameter("user_name");
        String pwd = req.getParameter("user_pwd");
        String pwdbi = req.getParameter("user_pwd_bi");
        String psd = req.getParameter("user_pseudo");


        //verifie les valeurs rentrées
        if(pwd.equals("")|pwdbi.equals("")|login.equals(""))
        {
            resp.getWriter().write("veuillez remplir tous les champs");
            req.getRequestDispatcher("/WEB-INF/view/inscription.jsp").forward(req,resp);
        }
        else if(!pwd.equals(pwdbi)){
            resp.getWriter().write("les mots de passent ne concordent pas");
            req.getRequestDispatcher("/WEB-INF/view/inscription.jsp").forward(req,resp);
        }
        //ajoute l'utilisateur à la base donnée et redirige vers la page d'authentification
        else {
            if (pwd.length()<6){

                resp.getWriter().write("le mot de passe ne doit pas avoir moins de 6 caracteres²");
                req.getRequestDispatcher("/WEB-INF/view/inscription.jsp").forward(req,resp);
            }else{
                Utilisateur.addUser(login,pwd,psd);
                req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req,resp);
            }

        }
    }
}