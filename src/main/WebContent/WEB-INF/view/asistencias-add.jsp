<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro de Asistencias</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-table.min.css"/>
</head>
<body>

<nav></nav>

<section class="py-5 px-5">
    <div class="container">
        <h1>Registro de Asistencias</h1>
    
        <form action="add" method="post" class="needs-validation" novalidate>
            <input type="hidden" id="id_asistencia" name="id_asistencia" value="${asistencia.id_asistencia}" />
            
            <div class="form-group">
                <label for="id_empleado" class="form-label">Id Empleado</label>
                <input class="form-control" type="number" id="id_empleado" name="id_empleado" value="${asistencia.id_empleado}" required/>
            </div>
            
            <div class="form-group">
                <label for="fecha_asistencia" class="form-label">Fecha de Asistencia</label>
                <input class="form-control" type="date" id="fecha_asistencia" name="fecha_asistencia" value="${fn:substring(asistencia.fecha_asistencia, 0, 10)}" required/>
            </div>
            
            <div class="form-group">
                <label for="anio" class="form-label">Año</label>
                <input class="form-control" type="number" id="anio" name="anio" value="${asistencia.anio}" required/>
            </div>
            
            <div class="form-group">
                <label for="mes" class="form-label">Mes</label>
                <input class="form-control" type="number" id="mes" name="mes" value="${asistencia.mes}" required/>
            </div>
            
            <div class="form-group">
                <label for="dia" class="form-label">Día</label>
                <input class="form-control" type="number" id="dia" name="dia" value="${asistencia.dia}" required/>
            </div>
            
            <div class="form-group">
                <label for="hora_entrada_trabajo" class="form-label">Hora Entrada</label>
                <input class="form-control" type="time" id="hora_entrada_trabajo" name="hora_entrada_trabajo" value="${asistencia.hora_entrada_trabajo}" required/>
            </div>
            
            <div class="form-group">
                <label for="hora_salida_trabajo" class="form-label">Hora Salida</label>
                <input class="form-control" type="time" id="hora_salida_trabajo" name="hora_salida_trabajo" value="${asistencia.hora_salida_trabajo}" required/>
            </div>
            
            <div class="form-group">
                <label for="total_horas_trabajo" class="form-label">Total Horas Trabajo</label>
                <input class="form-control" type="number" id="total_horas_trabajo" name="total_horas_trabajo" value="${asistencia.total_horas_trabajo}" required/>
            </div>
            
            <div class="form-group">
                <label for="total_horas_extra" class="form-label">Total Horas Extra</label>
                <input class="form-control" type="number" id="total_horas_extra" name="total_horas_extra" value="${asistencia.total_horas_extra}" required/>
            </div>
            
            <div class="form-group">
                <label for="registro_atraso" class="form-label">Registro Atraso</label>
                <input class="form-control" type="text" id="registro_atraso" name="registro_atraso" value="${asistencia.registro_atraso}" />
            </div>
            
            <div class="form-group">
                <label for="total_horas_atraso" class="form-label">Total Horas Atraso</label>
                <input class="form-control" type="number" id="total_horas_atraso" name="total_horas_atraso" value="${asistencia.total_horas_atraso}" />
            </div>
            
            <div class="form-group">
                <label for="registro_falta" class="form-label">Registro Falta</label>
                <input class="form-control" type="text" id="registro_falta" name="registro_falta" value="${asistencia.registro_falta}" />
            </div>
            
            <div class="form-group">
                <label for="registro_vacacion" class="form-label">Registro Vacación</label>
                <input class="form-control" type="text" id="registro_vacacion" name="registro_vacacion" value="${asistencia.registro_vacacion}" />
            </div>
            
            <div class="form-group">
                <label for="total_horas_trabajo_mes" class="form-label">Total Horas Trabajo Mes</label>
                <input class="form-control" type="number" id="total_horas_trabajo_mes" name="total_horas_trabajo_mes" value="${asistencia.total_horas_trabajo_mes}" />
            </div>
            
            <button class="btn btn-success" type="submit">Guardar</button>
            <button class="btn btn-danger" type="button" onclick="window.location.href='/rrrhh-web/asistencia/findAll'; return false;">Cancelar</button>
        </form>
    </div>
</section>

<footer></footer>

<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

<script>
   // // Example starter JavaScript for disabling form submissions if there are invalid fields
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
