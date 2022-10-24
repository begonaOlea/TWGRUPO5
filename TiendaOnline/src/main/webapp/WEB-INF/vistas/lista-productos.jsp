<%@page import="com.curso.mercado.servicios.ProductosService"%>
<%@page import="com.curso.mercado.entidades.Producto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>lista</title>
</head>
<body>

	<h1>Tienda Online</h1>
	<h4>Lista de un productos</h4>

<!--  EL tratan los null y devuelve es vacio -->

    <div> usuario: ${sessionScope.usuario.nombre }</div>
	
    <div class="border border-warning"> 
    
   
  
  	 ${requestScope.mensaje}  

	</div>

	<table>
		<c:forEach var="producto" items="${requestScope.lista}">
			<tr>
				<td>${producto.idProducto}</td>
				<td>${producto.descripcion}</td>
				<td>${producto.precio}</td>
				<td>${producto.stock}</td>
				<td>
				   <a href="comprar?idProducto=${producto.idProducto}">Comprar 1 unidad</a>
				    
				</td>
				
			</tr>
		</c:forEach>
	</table>


     <hr>
     
     <form action="comprar" method="get">
     
      Producto:  
      <select name="idProducto">
    	  <c:forEach var="producto" items="${requestScope.lista}">
      		<option value="${producto.idProducto}">${producto.descripcion}</option>
     	 </c:forEach>
      </select>
      
      Cantidad: <input type="number" name="cantidad" value="1" />
      
      <button type="submit" class="btn btn-primary">COMPRAR</button>
      
     </form>



</body>
</html>