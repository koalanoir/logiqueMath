<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="fr">
<head>
    <style>
    body{
    background-color: slategrey;
    backface-visibility: initial;
    border: 2px;
    }
    .contener{
    margin-top: 10%;
    margin-left:10%;
    }

    a{
    text-decoration: none;
    }
    a:hover{
    background-color: bisque;
        width: 5em;
        lengh: 3em;
    }
    button:hover{
    background-color: coral;
    border: none;
    }
    </style>

</head>
<body>
<div class="contener">
    <p style="background-color: darkseagreen ;width: 10em"><c:out value="${log}"/>
        </p><form action="home" method="post">
    nom d'utilisateur : <input type="text" name="user_name"><br/><br/>
    mot de passe :      <input type="password" name="user_pwd"><br/><br/>
    <button type="submit">se connecter</button>
</form><a href="inscription">s'inscrire</a></div>

</body>
</html>
