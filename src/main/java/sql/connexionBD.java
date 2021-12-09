package sql;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class connexionBD {
    private Connection connexion;
    private Statement statement;

    public connexionBD() {
        try {
            System.out.println("Chargement du driver...");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver charg� !");
        } catch (Exception e) {
            System.out.println("Erreur lors du chargement : le driver n'a pas �t� trouv� dans le classpath ! <br/>"
                    + e);
            e.printStackTrace();

        }

        /* Connexion � la base de donn�es */
        String url = "jdbc:mysql://localhost:3306/notation_polonaise";
        String utilisateur = "root";
        String motDePasse = "";

        try {
            System.out.println("Connexion � la base de donn�es...");
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("Connexion r�ussie !");

            /* Cr�ation de l'objet g�rant les requ�tes */
            statement = connexion.createStatement();
            System.out.println("Objet requ�te cr�� !");
        } catch (Exception e) {
            System.out.println("Erreur lors de la connexion : <br/>");
        }
    }

    public Connection getCon() {
        return connexion;
    }

    public Statement getStatement() {
        return statement;
    }
    public void addUser(String log,String pwd,String psd)
    {
        try {
            PreparedStatement pst = connexion.prepareStatement("INSERT INTO user(login,password,pseudo) VALUES (? , ?, ?)");
            pst.setString(1, log);
            pst.setString(2, pwd);
            pst.setString(3,psd);
            pst.executeUpdate();
            System.out.print( "inscrription confirmé");
        }
        catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
    public Boolean isUser(String log, String pwd) throws SQLException {
        ResultSet res=null;
        try {
            PreparedStatement pst = connexion.prepareStatement("SELECT password FROM user WHERE login= ? AND password = ?");
            pst.setString(1, log);
            pst.setString(2, pwd);
            res = pst.executeQuery();
            return  res.next();
        }
        catch (SQLException e)
        {
            System.out.print(e);
            return false;
        }
    }
    public String getPseudo(String log,String pwd)
    {
        ResultSet res=null;
        try {
            PreparedStatement pst = connexion.prepareStatement("SELECT pseudo FROM user WHERE login= ? AND password = ?");
            pst.setString(1, log);
            pst.setString(2, pwd);
            res = pst.executeQuery();
            while (res.next()) {
                return res.getString("pseudo");
            }
            return "";
        }
        catch (SQLException e)
        {
            System.out.print(e);
            return "";
        }
    }
    public int getScore(String psd){
        ResultSet res=null;
        try {
            PreparedStatement pst = connexion.prepareStatement("SELECT score FROM jeu WHERE pseudo= ? ");
            pst.setString(1, psd);
            res = pst.executeQuery();
            while (res.next()) {
                return res.getInt("score");
            }
            return -1;
        }
        catch (SQLException e)
        {
            System.out.print(e);
            return -2;
        }
    }

    public void addScore(String psd,int s){
        try {
            PreparedStatement pst = connexion.prepareStatement("UPDATE jeu SET score=? WHERE pseudo =?");
            pst.setString(2, psd);
            pst.setInt(1, s);
            pst.executeUpdate();
        }
        catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public List getBestScores(){
        ResultSet res=null;
        List scores=new ArrayList();
        String top="";
        try {
            PreparedStatement pst = connexion.prepareStatement("SELECT * FROM jeu ORDER BY score DESC LIMIT 5;");
            res = pst.executeQuery();
            while (res.next()) {
                top=res.getString("pseudo")+ "  :  "+res.getInt("score");
                scores.add(top);
            }
        }
        catch (SQLException e)
        {
            System.out.print(e);
        }
        return scores;
    }
}
