<%-- Created by IntelliJ IDEA. User: doria Date: 06/11/2021 Time: 15:22 To change this template use File | Settings | File Templates. --%>

<html lang="fr">
	<head>
		<meta charset="utf-8" />
		<title>Inscription</title>
		<link rel="stylesheet" href="css/index.css" type="text/css" />
	</head>
	<body>
		<div class="index_home_container">
			<form action="verif" method="post">
				<div class="input_container">
					<span>Nom d'utilisateur</span>
					<input placeholder="Nom d'utlisateur" type="text" name="user_name" />
				</div>
				<div class="input_container">
					<span>Pseudo</span>
					<input placeholder="Pseudo" type="text" name="user_pseudo" />
				</div>
				<div class="input_container">
					<span>Mot de passe</span>
					<input placeholder="Mot de passe" type="password" name="user_pwd" />
				</div>
				<div class="input_container">
					<span>Confirmation</span>
					<input placeholder="Confirmation mot de passe" type="password" name="user_pwd_bi" />
				</div>
				<button type="submit">S'inscrire</button>
				<a href="/logiqueMath_bin_war_exploded/">Vous avez deja un compte ? Connectez-vous</a>
			</form>
		</div>
	</body>
</html>
