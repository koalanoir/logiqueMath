<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="fr">
	<head>
		<meta charset="utf-8" />
		<title>Se connecter</title>
		<link rel="stylesheet" href="css/index.css" type="text/css" />
	</head>
	<body>
		<div class="index_home_container">
			<form action="home" method="post">
				<div class="input_container">
					<span>Nom d'utilisateur</span>
					<input placeholder="Nom d'utilisateur" type="text" name="user_name" />
				</div>
				<div class="input_container">
					<span>Mot de passe</span>
					<input placeholder="Mot de passe" type="password" name="user_pwd" />
				</div>
				<button type="submit">Se connecter</button>
				<a href="inscription">Vous n'avez pas de compte ? Inscrivez-vous</a>
			</form>
		</div>
	</body>
</html>
