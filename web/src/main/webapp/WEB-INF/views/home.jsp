<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Orar Facultatea de Matematica si Informatica</title>
    <link rel="stylesheet" href="<spring:url value='/resources/style.css' />" />
</head>
<body>
<center>
    <h1>Orar Facultatea de Matematica si Informatica</h1>
    <h1>Anul 2015-2016, Semestrul II</h1>
    <table border="1" cellspacing="0" cellpadding="0">
        <tbody>
            <tr align="center">
                <td>
                    <a href="/orar-studenti"><font size="+1">Orarul studentilor</font></a>
                </td>
            </tr>
            <tr align="center">
                <td>
                    <a href="orar-profesori"><font size="+1">Orarul cadrelor didactice</font></a>
                </td>
            </tr>
            <tr align="center">
                <td>
                    <a href="orar-materii"><font size="+1">Orarul disciplinelor</font></a>
                </td>
            </tr>
            <tr align="center">
                <td>
                    <a href="orar-sali"><font size="+1">Orarul salilor</font></a>
                </td>
            </tr>
            <tr align="center">
                <td>
                    <a href="detalii-sali"><font size="+1">Legenda salilor</font></a>
                </td>
            </tr>
        </tbody>
    </table>
</center>
</body>
</html>