<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP TP3</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  
</head>
<body>

	<div class="container">
		
		<h3>${nome}</h3>
		<h4>${email}</h4>
		<h4><a href="${git}">GIT</a></h4>
		
		<form action="/usuario" method="get">
		    
			<button type="submit">Novo Usu�rio</button>
		
		</form>	
	  
	</div>
		
</body>
</html>