package classused.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/****
 * filtre qui redirige l'utilisateur vers la page d'authentification à
 * chaque fois qu'il veut acceder à la page de jeu quand il n'est pas connécté
 *
 */
@WebFilter(urlPatterns = {"/evaluation", "/verification"})
public class logFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String servletPath = req.getServletPath();
        HttpSession session = req.getSession(false);


        if (session== null|| session.getAttribute("pseudo")==null) {

            res.sendRedirect("home");

       } else {
            System.out.println("#INFO " + new Date() + " - ServletPath :" + servletPath //
                    + ", URL =" + req.getRequestURL());

            // Passez à l'élément suivant (filtre ou cible) en chaîne.
            chain.doFilter(request, response);
        }

    }

    private List<String> parametersToString(ServletRequest request) {
        List<String> parameters = new ArrayList<>();
        request.getParameterMap().forEach((k, v) -> parameters.add(k + "=" + Arrays.toString(v)));
        return parameters;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }

}