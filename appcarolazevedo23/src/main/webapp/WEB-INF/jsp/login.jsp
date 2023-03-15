<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>

  <title>Telemedicina: Login</title>
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
</div>

  <div class="card" style="width:200px">
    <img class="card-img-top" src="img/logo_infnet.png" alt="Logo Infnet" style="width:100%">
    <div class="card-body">
    <h4 class="card-title"> Carolina Alvares de Azevedo Gomes</h4>
    <p class="card-text">Engenharia de Software</p>
    <p class="card-text">Assessment - Projeto de Bloco: Desenvolvimento Java [20E2_5]</p>
      <a href="https://github.com/caroladeazevedo/ATTelemedicina.git" class="btn btn-primary btn-sm">GIT</a>
      

    </div>
  </div>
   
   
    <h1>Telemedicina</h1>
    <p>Sistema para cadastramento de Pacientes e Médicos</p>
  
  <c:if test="${not empty mensagem}">
	  <div class="alert alert-warning">
	    <strong>Ops!</strong> ${mensagem}
	  </div>
  </c:if>
  
  
  <form action="/login" class="was-validated" method="post">
    <div class="form-group">
      <label for="uname">* Usuário:</label>
      <input type="text" class="form-control" id="uname" placeholder="Coloque o seu usuario" name="login" required>
      <div class="valid-feedback">Válido.</div>
      <div class="invalid-feedback">Os campos marcados com * precisam ser preenchidos</div>
    </div>
    
    <div class="form-group">
      <label for="pwd">* Senha:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Coloque a sua senha" name="senha" required>
      <div class="valid-feedback">Válido.</div>
      <div class="invalid-feedback">Os campos marcados com * precisam ser preenchidos</div>
    </div>

    <button type="submit" class="btn btn-primary">Enviar</button>
    <p>
  </form>
</div>


</body>
</html>