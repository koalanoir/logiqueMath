<%--
  Created by IntelliJ IDEA.
  User: doria
  Date: 06/11/2021
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<head>
    <meta charset="utf-8" />
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
    <title> acceuil</title>
    <link rel="stylesheet" href="css/global.css">
</head>
<body>

<div class="contener"><p>Bienvenu <c:out value="${ pseudo }" /> </p><br/><br/><form action="evaluation" method="post">
    <button type="submit">commencer une serie</button>
</form></div>
<a class="bas" href='https://pngtree.com/free-backgrounds'>free background photos from pngtree.com/</a>
</body>
</html>
