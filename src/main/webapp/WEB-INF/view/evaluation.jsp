<%-- Created by IntelliJ IDEA. User: doria Date: 11/11/2021 Time: 23:14 To change this template use File | Settings | File Templates. --%> <%@ page
contentType="text/html;charset=UTF-8" language="java" %> <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>evaluation</title>
		<link rel="stylesheet" href="evaluation.css" type="text/css" />
	</head>
	<body>
		<div class="container">
			<div class="header">
				<h3>Calculez chacune des operations ecrit sous forme d'expression en notation polonaise</h3>
				<p>Chaque mauvaise réponse ou réponse non renseignée vous fera perdre un point</p>
			</div>
			<form class="form" action="verification" method="post">
				<div>
					<span><c:out value="${ sessionScope.serie.get(0)  }" /></span>
					<input type="text" name="rep0" value='<c:out value="${ sessionScope.rep.get(0) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(1)  }" /></span>
					<input type="text" name="rep1" value='<c:out value="${ sessionScope.rep.get(1) }" />"' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(2)  }" /></span>
					<input type="text" name="rep2" value='<c:out value="${ sessionScope.rep.get(2) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(3)  }" /></span>
					<input type="text" name="rep3" value='<c:out value="${ sessionScope.rep.get(3) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(4)  }" /></span>
					<input type="text" name="rep4" value='<c:out value="${ sessionScope.rep.get(4) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(5)  }" /></span>
					<input type="text" name="rep5" value='<c:out value="${ sessionScope.rep.get(5) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(6)  }" /></span>
					<input type="text" name="rep6" value='<c:out value="${ sessionScope.rep.get(6) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(7)  }" /></span>
					<input type="text" name="rep7" value='<c:out value="${ sessionScope.rep.get(7) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(8)  }" /></span>
					<input type="text" name="rep8" value='<c:out value="${ sessionScope.rep.get(8) }" />' />
				</div>
				<div>
					<span><c:out value="${ sessionScope.serie.get(9)  }" /></span>
					<input type="text" name="rep9" value='<c:out value="${ sessionScope.rep.get(9) }" />' />
				</div>
				<button type="submit">Valider</button>
			</form>
			<div class="results">
				<div class="serie">
					<c:forEach items="${ sessionScope.series }" var="titre"><c:out value="${ titre }" /></c:forEach>
				</div>
				<div class="solutions">
					<c:forEach items="${ sessionScope.solution }" var="titre"><c:out value="${ titre }" /></c:forEach>
				</div>
				<div class="score">
					<p><c:out value="${ score }" /></p>
				</div>
			</div>
		</div>
	</body>
</html>
