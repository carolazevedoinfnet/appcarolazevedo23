<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Telemedicina:Cadastrar Paciente</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">

	<c:import url="/WEB-INF/jsp/header.jsp" />


  <h2>Cadastro de Pacientes</h2>

  <form action="/paciente" method="post">
  
    <div class="form-group">
      <label for="nome">Nome:</label>
      <input type="text" class="form-control" name="nome">
    </div>

      <div class="form-group">
          <label for="sobrenome">Sobrenome:</label>
          <input type="text" class="form-control" name="sobrenome">
      </div>

      <div class="form-group">
          <label for="nascimento">Nascimento:</label>
          <input type="text" name="nascimento" class="form-control" placeholder="dd/mm/yyyy" required>

      </div>


      <div class="form-group">
          <label for="mae">Mãe:</label>
          <input type="text" class="form-control" name="mae">
      </div>

    <div class="form-group">
      <label for="pai">Pai:</label>
      <input type="text" class="form-control" name="pai">
    </div>

      <div class="form-group">
          <label for="sexo">Sexo:</label>
          <div class="form-check">
              <label class="form-check-label">
                  <input type="radio" class="form-check-input" name="sexo" value="true"> Feminino
              </label>
          </div>
          <div class="form-check">
              <label class="form-check-label">
                  <input type="radio" class="form-check-input" name="sexo" value="false" > Masculino
              </label>
          </div>
      </div>

      <div class="form-group">
          <label for="cpf">CPF:</label>
          <input type="text" class="form-control" name="cpf">
      </div>

      <div class="form-group">
          <label for="email">Email:</label>
          <input type="text" class="form-control" name="email">
      </div>

      <div class="form-group">
          <label for="telefone">Telefone:</label>
          <input type="text" class="form-control" name="telefone">
      </div>



      <button type="submit" class="btn btn-primary">Cadastrar</button>
  </form>
  <br>
  
  	<c:import url="/WEB-INF/jsp/footer.jsp"/>	

</div>

</body>
</html>
    