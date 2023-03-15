<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Telemedicina: Lista Médicos</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>


	<div class="container">

		<c:import url="/WEB-INF/jsp/header.jsp" />
		
					<table class="table table-striped">
		    <thead>
		   <tr>
		<th>ID</th>
        <th>Nome</th>
        <th>Sobrenome</th>
		<th>Sigla Conselho</th>
		<th>Código Conselho</th>
			   <th>Especialidade</th>
			   <th>Email</th>
			   <th>Data Cadastro</th>
      </tr>
		    </thead>
    <tbody>

		<c:forEach var="m" items="${listaMedicos}">

			 <tr>
			        <td>${m.id}</td>
			        <td>${m.nome}</td>
			     	<td>${m.sobrenome}</td>
					<td>${m.siglaConselho}</td>
					<td>${m.codConselho}</td>
			     	<td>${m.especialidade}</td>
				 	<td>${m.email}</td>
				 	<td>${m.dtCadastro}</td>
			        <td><a href="/medico/excluir/${m.id}">excluir</a></td>
			      </tr>
			
			
		</c:forEach>
 </tbody>

			  </table>
			<c:import url="/WEB-INF/jsp/footer.jsp"/>	
	</div>
</body>
</html>