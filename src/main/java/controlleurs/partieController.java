package controlleurs;

import classused.GenererExpression;
import classused.Utilisateur;
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
        String p=CreateCookie.getCookieValue(req,"pseudo");
        System.out.print(p);
        for(int i=0;i<10;i++){

            String ex=GenererExpression.getExpression();
            session.setAttribute("expression"+i, ex);
            String s=GenererExpression.getEvaluation(ex);
            session.setAttribute("solution"+i, s);

        }


        req.getRequestDispatcher("/WEB-INF/view/evaluation.jsp").forward(req, resp);
    }
}