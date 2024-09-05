<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <title>Formas de Pago</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-table.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" 
    integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" 
    crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>

<nav></nav>
<section class="px-5 py-5">
      <div class="container">
        <h1>Formas de Pago</h1>
        <div class="mb-3 text-center">
            <button class="btn btn-primary" onclick="window.location.href='/rrrhh-web/formapago/findOne?opcion=1';return false;">
                Agregar <i class="fa-solid fa-circle-plus"></i>
            </button>
        </div>
        <div class="table-responsive">
            <table id="tablaFormasPago"
                   name="tablaFormasPago"
  
                   data-search="true"
                   data-pagination="true"
                   data-toggle="tablaFormasPago"
                   data-toolbar=".toolbar"
                   class="table table-striped table-sm">
                <thead>
                    <tr>
                        <th data-field="Id Forma Pago" data-sortable="true">Id Forma Pago</th>
                        <th data-field="Forma Pago" data-sortable="true">Forma Pago</th>
                        <th data-field="Descripción" data-sortable="true">Descripción</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="item" items="${formasPago}">
                        <tr>
                            <td>${item.id_forma_pago}</td>
                            <td>${item.forma_pago}</td>
                            <td>${item.descripcion}</td>
                            <td>
                                <button class="btn btn-success" onclick="window.location.href='/rrrhh-web/formapago/findOne?id_forma_pago=${item.id_forma_pago}&opcion=1';return false;">
                                     <i class="fa-solid fa-arrows-rotate"></i>
                                </button>
                                <button class="btn btn-danger" onclick="window.location.href='/rrrhh-web/formapago/findOne?id_forma_pago=${item.id_forma_pago}&opcion=2';return false;">
                                     <i class="fa-solid fa-trash-can"></i>
                                </button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</section>

<footer class="py-2 bg-light">
    <div class="container">
        <p class="m-0 text-center">Instituto tecnologico ISMAC </p>
    </div>
</footer>

<script src="${pageContext.request.contextPath}/resources/js/bootstrap.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery-3.7.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap-table.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap-table-es-MX.min.js"></script>

<script>
    var $tablaFormasPago = $('#tablaFormasPago');
    $(function(){
        $tablaFormasPago.bootstrapTable({
            sortReset: true
        });
    });
</script>

</body>
</html>