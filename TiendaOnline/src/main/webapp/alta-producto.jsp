<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Alta</title>
  </head>
<body>

<h1>Tienda Online</h1>
<h4>Alta de un producto Nuevo</h4>
<div> usuario: ${sessionScope.usuario.nombre }</div>


<form action="altaProducto" method="post">

   Nombre Producto: <input type="text" name="descripcion" value="" />
   
   <br>
   Precio Producto:<input type="text" name="precioUnidad" value="10.0" />
   
   <button type="submit" class="btn btn-primary">Grabar</button>
 

</form>

<div class="border border-warning"> 
<!--  
<%@ page isELIgnored="false" %>   
-->
   ${requestScope.errorBego}  

</div>




</body>
</html>