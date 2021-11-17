package controlleurs;

import classused.Utilisateur;
import classused.util.CreateCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(urlPatterns = "/verification")
public class repController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {

        String p=CreateCookie.getCookieValue(req,"pseudo");
        System.out.print(p);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int score=0;
        HttpSession session=req.getSession();

        for(int i=0;i<10;i++){
            String rep=req.getParameter("rep"+i);
            List<String> s= (List<String>) session.getAttribute("solutions");
            int solution=Integer.parseInt(s.get(i));
            session.setAttribute("rep"+i,rep);
            if(rep.equals("")) score--;
            else if (!rep.equals("")&Integer.parseInt(rep) == solution) {score++ ;}
        }
        if(score<0){score=0;}
        String p=CreateCookie.getCookieValue(req,"pseudo");
        if(Integer.parseInt(Utilisateur.getScore(p))<score){
            System.out.print(p);
            Utilisateur.addScore(p,score);
        }
        String res="votre score est de : "+score+"/10";
        CreateCookie.CreateCookie(req,resp,"score",res);
        req.getSession().setAttribute("fait",true);
        req.getRequestDispatcher("/WEB-INF/view/evaluation.jsp").forward(req, resp);
    }
}
