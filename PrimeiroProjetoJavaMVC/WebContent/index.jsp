<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Home</title>
</head>
<body>
<h3>Post</h3>
<form action="PessoaController" method="post">
	<label for="nome">Name:</label>
	<input type = "text" name = "nome" id = "nome">
	<br>
	<label for="email">Email:</label>
	<input type = "text" name = "email" id = "email">
	<br>
	<br>
	<button type="submit">Adicionar Pessoa</button>
	</form>
	<br>
	<br>
	<form action="PessoaController" method="get">
	<button type="submit">listar Pessoa</button>
</form>
</body>
</html>