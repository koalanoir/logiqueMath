<!Doctype html>
<head>
    <meta charset="utf-8" />
    <style>
        body{
            background-color: slategrey;
            backface-visibility: initial;
            border: 2px;
        }

        .central {
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
<form action="home" method="post">
    nom d'utilisateur : <input type="text" name="user_name"><br/><br/>
    mot de passe :      <input type="password" name="user_pwd"><br/><br/>
    <button type="submit">se connecter</button>
</form><a href="inscription">s'inscrire</a></div>

</body>
</html>
