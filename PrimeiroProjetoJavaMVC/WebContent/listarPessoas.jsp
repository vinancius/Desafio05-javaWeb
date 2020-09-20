<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de pessoas</title>
</head>
<body>
<c:forEach items="${lista}" var = "pessoa">
<p>Nome: ${pessoa.nome}</p>
<p>Email: ${pessoa.email}</p>
<p>====================</p>
</c:forEach>
<p><a href="index.jsp">Voltar</a>
</body>
</html>