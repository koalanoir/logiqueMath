<%--
  Created by IntelliJ IDEA.
  User: doria
  Date: 11/11/2021
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>evaluation</title>
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
<h1>Calculez chacune des operations ecrit sous forme d'expression en notation polonaise</h1><br/><br/>
<p> chaque mauvaise reponse ou reponse non renseignée vous fera perdre un point</p>
<form action="verification" method="post">
 <c:out value="${ sessionScope.expression0 }" /> : <input type="text" name="rep0"><c:out value="${ sessionScope.solution0 }" /><br/>
   <c:out value="${ sessionScope.expression1 }" /> : <input type="text" name="rep1"> <c:out value="${ sessionScope.solution1 }" /><br/>
   <c:out value="${ sessionScope.expression2 }" /> : <input type="text" name="rep2"> <c:out value="${ sessionScope.solution2 }" /><br/>
   <c:out value="${ sessionScope.expression3 }" /> : <input type="text" name="rep3"><c:out value="${ sessionScope.solution3 }" /><br/>
   <c:out value="${ sessionScope.expression4 }" /> : <input type="text" name="rep4"> <c:out value="${ sessionScope.solution4 }" /><br/>
    <c:out value="${ sessionScope.expression5 }" /> : <input type="text" name="rep5"> <c:out value="${ sessionScope.solution5 }" /><br/>
    <c:out value="${ sessionScope.expression6 }" /> : <input type="text" name="rep6"><c:out value="${ sessionScope.solution6 }" /><br/>
    <c:out value="${ sessionScope.expression7 }" /> : <input type="text" name="rep7"> <c:out value="${ sessionScope.solution7 }" /><br/>
    <c:out value="${ sessionScope.expression8 }" /> : <input type="text" name="rep8"><c:out value="${ sessionScope.solution8 }" /><br/>
    <c:out value="${ sessionScope.expression9 }" /> : <input type="text" name="rep9"><c:out value="${ sessionScope.solution9 }" /><br/>
    <button type="submit">valider</button>
</form><br/><br/><c:out value="${ score }" />
</body>
<html/>
