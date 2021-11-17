<%--
  Created by IntelliJ IDEA.
  User: doria
  Date: 12/11/2021
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>solution</title>
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
<div class="central"><h1><c:out value="${ score }" /></h1></div>
</body>
<html/>
