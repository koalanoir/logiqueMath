<%--
  Created by IntelliJ IDEA.
  User: doria
  Date: 06/11/2021
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<!Doctype html>
<head>
    <link rel="stylesheet" href="../css/global.css">
    <style>
        body{
            background-color: slategrey;
            backface-visibility: initial;
            border: 2px;
        }

        .central{
            margin-top: 10%;
            margin-left:30%;
        }
        a{
            text-decoration: none;
        }
        a:hover{
            background-color: bisque;
        }
        button:hover{
            background-color: coral;
            border: none;
        }
    </style>
</head>
<body>
<div class="central">
<form action="verif" method="post">
    nom d'utilisateur : <input type="text" name="user_name"><br/><br/>
    saisir un mot de passe : <input type="password" name="user_pwd"><br/><br/>
    confirmation du mot de passe : <input type="password" name="user_pwd_bi"><br/><br/>
    entrer un Pseudo :<input type="text" name="user_pseudo"><br/><br/>

    <button type="submit">valider</button>
</form>
</div>
</body>
</html>
