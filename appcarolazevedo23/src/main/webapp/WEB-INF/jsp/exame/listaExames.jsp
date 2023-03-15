<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Telemedicina: Lista Exames</title>
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
        <th>Descrição</th>
        
   
      </tr>
		    </thead>

    <tbody>
		<c:forEach var="e" items="${listaExames}">

		
		 <tr>
			        <td>${e.id}</td>
			        <td>${e.descricao}</td>
		
			        <td><a href="/exame/excluir/${e.id}">excluir</a></td>
			      </tr>
			
			
			
		</c:forEach>
			    </tbody>


			  </table>
			<c:import url="/WEB-INF/jsp/footer.jsp"/>	
	</div>
</body>

</body>
</html>