package controlleurs;

import classused.GenererExpression;
import classused.Utilisateur;
import classused.partie;
import classused.util.CreateCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(urlPatterns = "/evaluation")
public class partieController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String f="false";
        String p=CreateCookie.getCookieValue(req,"pseudo");
        System.out.print(p);
        partie part=new partie();
        session.setAttribute("serie",part.getSerie());
        session.setAttribute("solutions",part.getSolution());
        CreateCookie.CreateCookie (req,resp,"fait",f);
        req.getRequestDispatcher("/WEB-INF/view/evaluation.jsp").forward(req, resp);
    }
}