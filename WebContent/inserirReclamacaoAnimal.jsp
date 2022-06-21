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
<title>Reclamação Animal</title>
<link rel = "icon" href="imagem/megafone.png">
<link rel = "Stylesheet" href="style.css">
</head>
<body>
 	<h1>Animal Complaint</h1>

<form method="POST" action="#" name="formQueixaAnimal">
  <p>Complaint Description: </p>
  <p><textarea rows="6" name="descricaoQueixa" cols="63"></textarea></p>
  <p>Observations:</p>
  <p><textarea rows="2" name="observacaoQueixa" cols="63"></textarea><br>
  </p>
  <h3>Complainer Data</h3>
  <p>Complainer name: <input type="text" name="nomeSolicitante" size="41"></p>
  <p>Address: <input type="text" name="ruaSolicitante" size="36">&nbsp;&nbsp;&nbsp;
  Complement: <input type="text" name="compSolicitante" size="46">&nbsp;</p>
  <p>Province: <input type="text" name="bairroSolicitante" size="20"> </p>
  <p>City: <input type="text" name="cidadeSolicitante" size="20">&nbsp;&nbsp;&nbsp; State:
  &nbsp;&nbsp;&nbsp; <input type="text" name="ufSolicitante" size="3">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ZIP Code: <input type="text" name="cepSolicitante" size="17"></p>
  <p>Phone number:&nbsp;&nbsp;&nbsp; <input type="text" name="telefoneSolicitante" size="18"></p>
  <p>E-mail: <input type="text" name="emailSolicitante" size="39"></p>
  <h3>Animal Data</h3>
  <p>Animal Race: <input type="text" name="nomeAnimal" size="32">&nbsp;&nbsp;&nbsp; Quantidade: <input type="text" name="qtdeAnimal" size="9">&nbsp; </p>
  <p>Event Date: <input type="text" name="diaIncomodo" size="2"> / <input type="text" name="mesIncomodo" size="2">&nbsp;/&nbsp;<input type="text" name="anoIncomodo" size="4">&nbsp;&nbsp;</p>
  <p>Event Address: <input type="text" name="ruaOcorrencia" size="36">&nbsp;&nbsp;&nbsp;
  Complement: <input type="text" name="compOcorrencia" size="42">&nbsp;&nbsp;&nbsp; </p>
  <p>Province: <input type="text" name="bairroOcorrencia" size="20"> </p>
  <p>City: <input type="text" name="cidadeOcorrencia" size="20">&nbsp;&nbsp;&nbsp; State:
  &nbsp;&nbsp;&nbsp; <input type="text" name="ufOcorrencia" size="3">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ZIP Code: <input type="text" name="cepOcorrencia" size="17"></p>
  <p>Phone number:&nbsp;&nbsp;&nbsp; <input type="text" name="telefoneOcorrencia" size="18"></p>
  <div align="center"><center><p><input type="button" value="Insert" name="bt1" onclick="javascript:submeterDados();"> <input type="reset" value="Clear" name="bt2"> </p>
  </center></div>
</form>
</body>
</html>