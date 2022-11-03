<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pedidos</title>
</head>
<body>


<h2> Lista de pedidos  del cliente ${usuario.nombre}</h2>

<ul>

<c:forEach items="${listaPedidos}" var="pedido">

   <li>${pedido.id} - ${pedido.desc} -
   
     <a href="/pedido?idPedido=${pedido.id}"> Ver detalle</a>
    
    </li>

</c:forEach>
</ul>
</body>
</html>