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
        .contener{
            margin-top: 10%;
            margin-left:10%;
            display: flex;
        }
        .gauche{
            float: left;
            padding-right: 5em;
            padding-left: 5em;
        }

        .gauche:hover{
            background-color: darkseagreen;
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
<h1 style="text-align: center">Calculez chacune des operations ecrit sous forme d'expression en notation polonaise</h1><br/><br/>
<p style="text-align: center"> chaque mauvaise reponse ou reponse non renseignée vous fera perdre un point</p>
<div class="contener">
    <div class="gauche">
        <form action="verification" method="post">
        <c:out value="${ sessionScope.serie.get(0) }" /> : <input type="text" name="rep0" <c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(0) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(1)  }" /> : <input type="text" name="rep1"> <c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(1) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(2)  }" /> : <input type="text" name="rep2"><c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(2) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(3)  }" /> : <input type="text" name="rep3"><c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(3) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(4)  }" /> : <input type="text" name="rep4"> <c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(4) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(5)  }" /> : <input type="text" name="rep5"><c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(5) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(6)  }" /> : <input type="text" name="rep6"><c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(6) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(7)  }" /> : <input type="text" name="rep7"> <c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(7) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(8)  }" /> : <input type="text" name="rep8"><c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(8) }" /></c:if><br/><br/>
        <c:out value="${ sessionScope.serie.get(9)  }" /> : <input type="text" name="rep9"><c:if test="${sessionScope.fait==true}>"><c:out value="${ sessionScope.solutions.get(9) }" /></c:if><br/><br/>
        <button type="submit">valider</button>
        </form><br/><br/></div>
<div><h1><c:out value="${ score }" /></h1>
</div></div>
</body>
<html/>