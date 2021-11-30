package classused.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebFilter("/*")
public class logFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;

        String servletPath = req.getServletPath();

        System.out.println("#INFO " + new Date() + " - ServletPath :" + servletPath //
                + ", URL =" + req.getRequestURL());

        // Passez à l'élément suivant (filtre ou cible) en chaîne.
        chain.doFilter(request, response);
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