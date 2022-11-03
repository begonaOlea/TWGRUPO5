<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login</title>
</head>
<body>


<h2> Login</h2>

<form:form action="login" method="post" 
           modelAttribute="usuarioForm" >
   <form:label path="nombre">Nombre usuario:</form:label>
   <form:input path="nombre" /> 
   <form:errors path="nombre"></form:errors>
   <br/>
   <form:label path="clave">Clave:</form:label>
   <form:password  path="clave" /> 
   <form:errors path="clave"></form:errors>
   <br/>
   <form:button>Login</form:button>
</form:form>


</body>
</html>