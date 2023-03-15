<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<!DOCTYPE html>
<html lang="en">
<head>
<title>Telemedicina:Cadastrar Consulta</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">

		<c:import url="/WEB-INF/jsp/header.jsp" />


		<h2>Marcar Consulta</h2>

		<form action="/consulta/incluir" method="post">




			<div class="form-group">
				<label for="exampleFormControlSelect">Escolha Paciente:</label> <select
					class="form-control" id="exampleFormControlSelect" name="paciente">
					<c:forEach var="p" items="${pacientes}">
						<option value="${p.id}">${p.nome}</option>
					</c:forEach>
				</select>
			</div>


			<div class="form-group">
				<label for="exampleFormControlSelect1">Escolha Médico:</label> <select
					class="form-control" id="exampleFormControlSelect1" name="medico">
					<c:forEach var="m" items="${medicos}">
						<option value="${m.id}">${m.nome}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label for="hora">Dia da consulta:</label> <input type="date"
					name="dataConsulta" required>
			</div>


			<div class="form-group">
				<label for="hora">Horário da consulta:</label> <input type="time"
					name="horaConsulta" value="07:00" required>
			</div>


			<div class="form-group">
				<label for="usr">Exames:</label>
				<c:if test="${not empty exames}">
					<div class="form-check">
						<label class="form-check-label">
							<c:forEach var="e" items="${exames}">
								<input type="checkbox" class="form-check-input" name="exameIds" value="${e.id}">${e.descricao}<br>
							</c:forEach>
						</label>
					</div>
				</c:if>
				<c:if test="${empty exames}">
				<label for="usr">Nenhum exame cadastrado!</label>
				</c:if>
			</div>


			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
		<br>

		<c:import url="/WEB-INF/jsp/footer.jsp" />

	</div>

</body>
</html>
