<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Login</title>
</head>
<body>


	<h1>Tienda Online</h1>
	<h4>Login</h4>



	<form action="login" method="post">


		<label for="nombreUsr">Nombre Usuario</label> 
		<input type="text"
			id="nombreUsr" name="nombre" /> 
			
	   <label for="rolUsr">Role</label> 
	   <select
			id="rolUsr" name="rol">
			<option value="administrador">administrador</option>
			<option value="cliente" selected>cliente</option>
		</select>

        <br>
        <button type="submit" class="btn btn-primary">Enviar</button>
	</form>


</body>
</html>