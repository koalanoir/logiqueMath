package sql;

import java.sql.*;

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
    public String addUser(String log,String pwd,String psd)
    {
        try {

            statement.executeUpdate("INSERT INTO user(login,password,pseudo) VALUES ('"+log+"','"+pwd+"','"+psd+"');");
            return "inscrription confirmé";
        }
        catch(SQLException throwables)
        {
            throwables.printStackTrace();
            return  "erreur pendant l'enregistrement";
        }
    }
    public Boolean isUser(String log, String pwd) throws SQLException {
        ResultSet res=null;
        try {
            res = statement.executeQuery("SELECT password FROM user WHERE login='" + log + "';");
            while (res.next()) {
                if(res.getString("password").equals(pwd)) return true;
                else return false;
            }
            return false;
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
            res = statement.executeQuery("SELECT pseudo FROM user WHERE login='" + log + "' AND password='"+pwd+"';");
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
    public String getScore(String psd){
        ResultSet res=null;
        try {
            res = statement.executeQuery("SELECT meilleur_score FROM jeu WHERE pseudo='" + psd + "' ;");
            while (res.next()) {
                return res.getString("meilleur_score");
            }
            return "";
        }
        catch (SQLException e)
        {
            System.out.print(e);
            return "";
        }
    }

    public void addScore(String psd,int s){
        try {
            statement.executeUpdate("INSERT INTO jeu(pseudo,meilleur_score) VALUES ('"+psd+"','"+s+"');");

        }
        catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }

    public void reinitScore(String psd){
        try{
            statement.executeUpdate("DELETE FROM jeu * WHERE 'pseudo'='"+psd+"';");
        }
        catch(SQLException throwables)
        {
            throwables.printStackTrace();
        }
    }
}
