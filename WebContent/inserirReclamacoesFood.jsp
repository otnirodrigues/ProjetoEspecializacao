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
<title>Reclamação Comida</title>
<link rel = "icon" href="imagem/megafone.png">
<link rel = "Stylesheet" href="style.css">
</head>
<body>
	<h1>Food Complaint</h1>

<form method="POST" action="#" name="formQueixaAlimentar">
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
  <h3>Victim information</h3>
  <p>Name: <input type="text" name="nomeVitima" size="44"></p>
  <p>Address: <input type="text" name="ruaVitima" size="36">&nbsp;&nbsp;&nbsp; Complement:
  <input type="text" name="compVitima" size="47">&nbsp;&nbsp;&nbsp; </p>
  <p>Province: <input type="text" name="bairroVitima" size="20"> </p>
  <p>Closest city: <input type="text" name="cidadeVitima" size="20">&nbsp;&nbsp;&nbsp; State:
  &nbsp;&nbsp;&nbsp; <input type="text" name="ufVitima" size="3">
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; ZIP code: <input type="text" name="cepVitima" size="17"></p>
  <p>Telephone&nbsp;&nbsp;&nbsp; <input type="text" name="telefoneVitima" size="18"></p>
  <h3>Event information</h3>
  <p>Amount of people that ate the meal: <input type="text" name="qtdeComensais" size="4">
  &nbsp;&nbsp;&nbsp; Amount of sick people: <input type="text" name="qtdeDoentes" size="4"></p>
  <p>Amount of people checked into a hospital: <input type="text" name="qtdeInternacoes" size="4">
  &nbsp;&nbsp;&nbsp; Amount of death: <input type="text" name="qtdeObitos" size="4"></p>
  <p>Place of medical care: <input type="text" name="localAtendimento" size="9">&nbsp;&nbsp;&nbsp;
  Suspicious meal: <input type="text" name="refeicaoSuspeita" size="20"></p>
  <div align="center"><center><p><input type="button" value="Insert" name="bt1" onclick="javascript:submeterDados();"> <input type="reset" value="Clear" name="bt2"> </p>
  </center></div>
</form>
</body>
</html>