
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="com.model.*"%>
<%@ page import="java.util.ArrayList"%>
<%
	@ SuppressWarnings ("unchecked")
	ArrayList<Complaint> lista = (ArrayList<Complaint>) request.getAttribute("Queixas");
%>
<!DOCTYPE html>
<html lang= "pt-br">
<head>
<meta charset="utf-8">
<title>SDR</title>
<link rel = "icon" href="imagem/megafone.png">
<link rel = "Stylesheet" href="style.css">
</head>
<body>
	<img src="imagens/imegafone.png">
	<h1>Sistema de Registro de Reclamações</h1>
	<a href = "main0" class = "Botao1">Fazer Reclamação Animal</a>
	<a href = "main1" class = "Botao1">Fazer Reclamação Comida</a>
	<a href = "main2" class = "Botao1">Fazer Outro tipo de Reclamação</a>
	
</body>
</html>