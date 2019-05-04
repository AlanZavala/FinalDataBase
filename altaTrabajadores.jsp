<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">        
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">     
        <link href="css/registro.css" rel="stylesheet">

        <title>Registro</title>
    </head>
    <style>
        #name, #cuenta, #pestana{
            display: none;
        }
        
    </style>

    <body>
        <!-- <br> <br>
        <a href="./adminPass.jsp">
            <p>Menu</p>
        </a>
        <br> -->
        <h4 class="text-center mt-5 font-weight-bold">Registro de un nuevo empleado</h4>

        <form action="./registro" method="post" class="mt-5">

            <img src="img/sign.png" alt="">

            <input type="text" id="id" name="id" class="input" required>            
            <span class="user_label">ID</span>
    
            <input type="text" id="nombres" name="nombres" class="input" required>            
            <span class="user_label">Nombre</span>

            <input type="text" id="apellido" name="apellido" class="input" required>            
            <span class="user_label">Apellido</span>  
            
            <input type="text" id="username" name="username" class="input" required>            
            <span class="user_label">Username</span>

            <input type="password" id="password" name="password" class="input" required>            
            <span class="user_label">Contraseña</span>
            
            <input type="text" id="edad" name="edad" class="input" required>            
            <span class="user_label">Edad</span> 

            <input type="email" id="correo" name="correo" class="input" required>            
            <span class="user_label">Correo</span> 

            <input type="text" id="telefono" name="telefono" class="input" required>            
            <span class="user_label">Teléfono</span>

            <input type="text" id="direccion" name="direccion" class="input" required>            
            <span class="user_label">Dirección</span>

            <input type="text" id="puesto" name="puesto" class="input" required>            
            <span class="user_label">Puesto</span>
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
            
            <input class="login_button" type="submit"  value="GUARDAR">

            
            
        
        </form>
        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 

            <input class="proyecto_buton btn btn-success" type="submit"  value="Atras" id="boton_pro">
        </form>  
        <!-- <a href="adminPass.jsp">
                <p>Atrás</p>
            </a> -->

    </body>
</html>