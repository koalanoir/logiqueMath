package controlleurs;

import classused.Utilisateur;
import classused.partie;
import classused.util.CreateCookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
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
        partie part=new partie();
        String p=session.getAttribute("pseudo").toString();

        List<String> s= (List<String>) session.getAttribute("serie");
        List<String> e= (List<String>) session.getAttribute("solutions");
        for(int i=0;i<10;i++){
            String rep=req.getParameter("rep"+i);
            int solution=Integer.parseInt(e.get(i));
            part.setProposition(rep);
            if(rep.equals("")) ;
            else if (!rep.equals("")&Integer.parseInt(rep) == solution) {score++ ;}
        }
        session.setAttribute("solution",e);
        session.setAttribute("series",s);
        session.setAttribute("rep",part.getPropositions());
        if(score<0){score=0;}
        System.out.print(p);
        System.out.print("    best score ");
        System.out.print(Utilisateur.getScore(p));
        if(Utilisateur.getScore(p)<score){
            System.out.print(p);
            Utilisateur.addScore(p,score);
        }
        String res="votre score est de : "+score+"/10";
        CreateCookie.CreateCookie(req,resp,"score",res);
        req.getSession().setAttribute("fait",true);
        req.getRequestDispatcher("/WEB-INF/view/evaluation.jsp").forward(req, resp);
    }
}
