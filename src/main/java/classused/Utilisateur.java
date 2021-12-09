package classused;

import sql.connexionBD;

import java.sql.SQLException;
import java.util.List;


public class Utilisateur {
    static connexionBD user=new connexionBD();
    public static boolean isUser(String login,String password) throws SQLException {
        return user.isUser(login,password);
    }
    //ajoute un nouvel utilisateur
    public static void addUser(String login,String password,String pseudo)
    {

       user.addUser(login,password,pseudo);
    }
    //supprime un utilisateur
    public static void delUser(int id)
    {
        //todo
    }

    //deconnecte un utilisateur
    public static List getBestScores()
    {
        return user.getBestScores();
    }
    //renvoi le meilleur score de l'utilisateur
    public static int getScore(String pseudo){
        int s=user.getScore(pseudo);
        return s;
    }
    //met à jour le meilleur score
    public static void addScore(String pseudo,int score){
        user.addScore(pseudo,score);
    }
    //verifie si l'utilisateur à un pseudo
    public static String getPseudo(String login,String password)
    {
        return user.getPseudo(login,password);
    }
}
