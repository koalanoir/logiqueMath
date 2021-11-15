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
    <link rel="stylesheet" type="text/css" href="css" />
    <meta charset="utf-8" />
    <style>
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
    <title> acceuil</title>
</head>
<body>
<p>Bienvenu <c:out value="${ pseudo }" /> </p><br/><br/>
<div class="central"><form action="evaluation" method="post">
    <button type="submit">commencer une serie</button>
</form></div>
</body>
</html>
