<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agrohelp</title>
</head>
<body>

	<h1>PÁGINA PRINCIPAL</h1>
	<hr>

	<a href="logout">Logout</a>
	<br>
	<a href="exibeFormCadastroUsuario">Cadastrar novo usuário</a>
	<br>
	<form action="inserirNovoCliente" method="post">
		Nome cliente:<input name="cliente"> 
		cpf cliente: <input	name="cpfCliente"> 
		fazenda: <input name="fazenda"> <input
			type="submit" value="ok">
	</form>
	<br>
</body>
</html>

