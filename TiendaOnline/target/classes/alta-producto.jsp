<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Alta</title>
  </head>
<body>

<h1>Tienda Online</h1>
<h4>Alta de un producto Nuevo</h4>



<form action="AltaServlet" method="post">

   Nombre Producto: <input type="text" name="descripcion" value="" />
   
   <button type="submit" class="btn btn-primary">Enviar</button>
 

</form>



</body>
</html>