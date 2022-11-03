<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pedido</title>
</head>
<body>


<h2> Detalle Pedido</h2>

Id:${pedido.id} 
<br />
Descripcion:${pedido.desc} 
<br />
Fecha: ${pedido.fechaPedido} 
<br />
Entregado: ${pedido.entregado} 
<br />




</body>
</html>