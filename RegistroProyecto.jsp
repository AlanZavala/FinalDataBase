<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                    
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">     
        <link href="css/productos.css" rel="stylesheet">

        <title>Nuevo proyecto</title>
    </head>

    <body>

        <h4 class="text-center mt-5 font-weight-bold">Registro de un nuevo proyecto</h4>

        <form action="./RegistroProyecto" method="post" class="mt-5">

            <img src="img/product.jpg" alt=""> 

            <input type="text" id="id" name="id" class="input" required>            
            <span class="user_label">IDProyecto</span>

            <input type="text" id="nombre" name="nombre" class="input" required>            
            <span class="user_label">Nombre</span> 
            
            <input type="date" id="fechaInicio" name="fechaInicio" class="input" required>            
            <span class="user_label">Fecha de inicio</span>

            <input type="date" id="fechaVenta" name="fechaFin" class="input" required>            
            <span class="user_label">Fecha de termino</span>

            <input type="text" id="duracion" name="duracion" class="input" required>            
            <span class="user_label">Duracion</span>
            
            <input type="text" id="descripcion" name="descripcion" class="input" required>            
            <span class="user_label">Descripcion</span> 

            <input type="text" id="idCliente" name="idCliente" class="input" required>            
            <span class="user_label">idCliente</span> 

            <input type="text" id="cantidad" name="cantidad" class="input" required>            
            <span class="user_label">Cantidad</span> 

            <input type="text" id="precioTotal" name="precioTotal" class="input" required>            
            <span class="user_label">Precio Total</span> 
                   
            <input class="login_button" type="submit"  value="GUARDAR">
            

            <a href="adminPass.jsp">
                <p>Atrás</p>
            </a>
            
        
        </form>
    </body>
</html>
