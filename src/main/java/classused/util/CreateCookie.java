package classused.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CreateCookie {
    public static void CreateCookie(HttpServletRequest request, HttpServletResponse response,String name, String value) throws UnsupportedEncodingException {
        Cookie cookie = new Cookie(name,URLEncoder.encode( value, "UTF-8" ));
        response.addCookie(cookie);
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals(name)) {
                    request.setAttribute(name, URLDecoder.decode(cookie.getValue() , "UTF-8" ));
                }
            }
        }
    }
    public static String getCookieValue(HttpServletRequest request,String name) throws UnsupportedEncodingException {
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.equals(name)) {
                    return c.getValue();
                }
            }
            return "";
        }
        return "cookies null";
    }
}
