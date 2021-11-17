<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="fr">
<head>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/global.css">
</head>
<body>
<div class="contener">
<form action="home" method="post">
    nom d'utilisateur : <input type="text" name="user_name"><br/><br/>
    mot de passe :      <input type="password" name="user_pwd"><br/><br/>
    <button type="submit">se connecter</button>
</form><a href="inscription">s'inscrire</a></div>

</body>
</html>
