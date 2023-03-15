<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Assessment Projeto de Bloco Telemedicina</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
<div class="container-fluid" style="margin-top:80px">
<c:import url="/WEB-INF/jsp/header.jsp"/>
</div>


  <div class="row">
  <div class="card" style="width:170px">
    <img class="card-img-top" src="img/paciente_p.png" alt="Paciente" style="width:100%">
    <div class="card-body">
      <a href="/paciente" class="btn btn-primary btn-sm">Cadastrar Pacientes</a>
    </div>
  </div>
  <br>
  

    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/pacientes_p.png" alt="Pacientes" style="width:100%">
    <div class="card-body">
      <a href="/pacientes" class="btn btn-primary btn-sm">Lista Pacientes</a>
    </div>
  </div>
  <br>

    

  <div class="card" style="width:170px">
    <img class="card-img-top" src="img/med_p.png" alt="Medico" style="width:100%">
    <div class="card-body">
      <a href="/medico" class="btn btn-primary btn-sm">Cadastrar Médicos</a>
    </div>
  </div>
  <br>
  
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/medicos_p.png" alt="Medicos" style="width:100%">
    <div class="card-body">
      <a href="/medicos" class="btn btn-primary btn-sm">Lista Médicos</a>
  </div>
  </div>
    <br>
 
   <div class="row">

    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/exames_p.png" alt="Exame" style="width:100%">
    <div class="card-body">
      <a href="/exame" class="btn btn-primary btn-sm">Cadastrar Exames</a>
    </div>
 </div>

 
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/tele2_p.png" alt="Exames" style="width:100%">
    <div class="card-body">
      <a href="/exames" class="btn btn-primary btn-sm">Lista Exames</a>
    </div>
  </div>
  
  
    <div class="column">
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/calendar_p.png" alt="Consulta" style="width:100%">
    <div class="card-body">
      <a href="/consulta" class="btn btn-primary btn-sm">Marcar Consulta</a>
    </div>
  </div>
  </div>
  
 
    <div class="card" style="width:170px">
    <img class="card-img-top" src="img/Tele1_p.png" alt="Consultas" style="width:100%">
    <div class="card-body">
      <a href="/consultas" class="btn btn-primary btn-sm">Lista Consultas</a>
    </div>
  </div>
  
  </div>
     <br>
  </div>
    </div>
    
    
        <br>
            <br>

</body>
</html>