<%--
  Created by IntelliJ IDEA.
  User: doria
  Date: 06/11/2021
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="verif" method="post">
    nom d'utilisateur : <input type="text" name="user_name"><br/>
    saisir un mot de passe : <input type="password" name="user_pwd"><br/>
    confirmation du mot de passe : <input type="password" name="user_pwd_bi"><br/>

    <button type="submit">valider</button>
    <a href="/">déja inscrit?</a>
</form>
</body>
</html>
