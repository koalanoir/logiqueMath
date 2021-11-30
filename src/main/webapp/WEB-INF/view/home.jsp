<%-- Created by IntelliJ IDEA. User: doria Date: 06/11/2021 Time: 15:09 To change this template use File | Settings | File Templates. --%> <%@ page
contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title>Accueil</title>
		<link rel="stylesheet" href="css/home.css" type="text/css" />
	</head>
	<body>
		<div class="container">
			<h1>Bienvenue <c:out value="${ pseudo}" /> !</h1>
			<form action="evaluation" method="post">
				<button type="submit">Commencer une serie</button>
			</form>
		</div>
	</body>
</html>
