<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>alta</title>
</head>
<body>

	<h2>Alta nuevo pedido</h2>
	<form:form action="alta-pedido" method="post" modelAttribute="pedidoForm">
		<form:label path="desc">Descripción:</form:label>
		<form:input path="desc"/>
		<form:errors path="desc"/> <br/>
		<form:label path="entregado">Entregado:</form:label>
		<form:checkbox path="entregado" />
		<form:button>Crear pedido</form:button>
	</form:form>
</body>
</html>