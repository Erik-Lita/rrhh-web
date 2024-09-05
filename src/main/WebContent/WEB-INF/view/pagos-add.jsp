<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Registro de Pagos</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
</head>
<body>

<nav></nav>

<section class="py-5 px-5">
    <div class="container">
        <h1>Registro de Pagos</h1>
        
        <form action="add" method="post" class="needs-validation" novalidate>
            <input type="hidden" id="id_pago" name="id_pago" value="${pago.id_pago}">
            
            <div class="form-group">
                <label for="id_empleado" class="form-label">Id Empleado</label>
                <input class="form-control" type="text" id="id_empleado" name="id_empleado" value="${pago.id_empleado}" required/>
            </div>
            
            <div class="form-group">
                <label for="id_forma_pago" class="form-label">Id Forma de Pago</label>
                <input class="form-control" type="text" id="id_forma_pago" name="id_forma_pago" value="${pago.id_forma_pago}" required/>
            </div>
            
            <div class="form-group">
                <label for="aplica_iva" class="form-label">Aplica IVA</label>
                <input class="form-control" type="text" id="aplica_iva" name="aplica_iva" value="${pago.aplica_iva}" />
            </div>
            
            <div class="form-group">
                <label for="monto_pago" class="form-label">Monto Pago</label>
                <input class="form-control" type="number" id="monto_pago" name="monto_pago" value="${pago.monto_pago}" required/>
            </div>
            
            <div class="form-group">
                <label for="monto_iva" class="form-label">Monto IVA</label>
                <input class="form-control" type="number" id="monto_iva" name="monto_iva" value="${pago.monto_iva}" />
            </div>
            
            <div class="form-group">
                <label for="monto_descuento" class="form-label">Monto Descuento</label>
                <input class="form-control" type="number" id="monto_descuento" name="monto_descuento" value="${pago.monto_descuento}" />
            </div>
            
            <div class="form-group">
                <label for="monto_extras" class="form-label">Monto Extras</label>
                <input class="form-control" type="number" id="monto_extras" name="monto_extras" value="${pago.monto_extras}" />
            </div>
            
            <div class="form-group">
                <label for="monto_pago_total" class="form-label">Monto Pago Total</label>
                <input class="form-control" type="number" id="monto_pago_total" name="monto_pago_total" value="${pago.monto_pago_total}" required/>
            </div>
            
            <button class="btn btn-success" type="submit">Guardar</button>
            <button class="btn btn-danger" type="button" onclick="window.location.href='/rrrhh-web/pagos/findAll'; return false;">Cancelar</button>
        </form>
    </div>
</section>

<footer></footer>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

<script>
    //Example starter JavaScript for disabling form submissions if there are invalid fields
    (() => {
      'use strict'
  
      // Fetch all the forms we want to apply custom Bootstrap validation styles to
      const forms = document.querySelectorAll('.needs-validation')
  
      // Loop over them and prevent submission
      Array.from(forms).forEach(form => {
        form.addEventListener('submit', event => {
          if (!form.checkValidity()) {
            event.preventDefault()
            event.stopPropagation()
          }
  
          form.classList.add('was-validated')
        }, false)
      })
    })()
</script>

</body>
</html>
