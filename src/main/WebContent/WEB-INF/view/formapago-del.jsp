<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Eliminar Forma de Pago</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css" integrity="sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    
    <!-- Añadir CSS personalizado para diseño dinámico -->
    <style>
        body {
            background-color: #f8f9fa;
            font-family: 'Arial', sans-serif;
        }
        .container {
            margin-top: 50px;
        }
        .card {
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0,0,0,0.1);
            transition: transform 0.2s;
        }
        .card:hover {
            transform: scale(1.02);
        }
        .btn {
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }
        .btn-success:hover {
            background-color: #28a745;
        }
        .btn-danger:hover {
            background-color: #dc3545;
        }
        h1 {
            font-size: 2.5rem;
            margin-bottom: 20px;
        }
        .btn-lg {
            padding: 10px 20px;
            font-size: 1.25rem;
        }
        .lead {
            font-size: 1.25rem;
        }
    </style>
</head>
<body>

    <section class="py-5">
        <div class="container text-center">
            <div class="card p-4">
                <h1 class="display-4">Eliminar Registro</h1>
                <p class="lead">¿Estás seguro de que deseas eliminar el siguiente registro??</p>
                <form action="del" method="get">
                    <input type="hidden" id="id_forma_pago" name="id_forma_pago" value="${formapago.id_forma_pago}"/>
                    <div class="mt-4">
                        <button class="btn btn-success btn-lg" type="submit">
                            Guardar <i class="fa-solid fa-check"></i>
                        </button>
                        <button class="btn btn-danger btn-lg" type="button" onclick="window.location.href='/rrrhh-web/formapago/findAll';return false;">
                            Cancelar <i class="fa-solid fa-x"></i>
                        </button>
                    </div>
                </form>
            </div>
        </div>
    </section>
 
</body>
</html>
