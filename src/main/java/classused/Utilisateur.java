package classused;
import sql.connexionBD;

import java.sql.SQLException;

public class Utilisateur {
    static connexionBD user=new connexionBD();
    public static boolean isUser(String login,String password) throws SQLException {
        return user.isUser(login,password);
    }
    //ajoute un nouvel utilisateur
    public static void addUser(String login,String password)
    {

       user.addUser(login,password);
    }
    //supprime un utilisateur
    public static void delUser(int id)
    {
        //todo
    }

}
