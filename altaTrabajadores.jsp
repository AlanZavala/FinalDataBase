<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">        
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">     
        <link rel="stylesheet" href="css/all.css">
        <link href="css/formulario.css" rel="stylesheet">

        <title>Registro entrenador</title>
    </head>
    <style>
        #name, #cuenta, #pestana, #nombre{
            display: none;
        }
        body{
            background-color: #e6a400;
        }
        
    </style>

    <body>

        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 

            <input class="proyecto_buton fas fa-arrow-circle-left" type="submit"  value="Atrás" id="boton_pro">
        </form> 

        <h4 class="text-center mt-2 font-weight-bold" style="color: black">Nuevo entrenador</h4>
        <br>
        <br>

        <h4 class="text-center mt-2 font-weight-bold"> 
            <c:out  value = "${requestScope.mensaje}"/> 
        </h4>

        

        <form action="./registro" method="post" class="mt-5">

            <div id="registro" class="row justify-content-center mx-0">
                <div class="section d-flex flex-column">
                    <input type="text" id="id" name="id" class="input" required>            
                    <span class="user_label">ID(Número)</span>
                </div>
    
                <div class="section d-flex flex-column">
                    <input type="text" id="nombres" name="nombres" class="input" required>            
                    <span class="user_label">Nombre</span>
                </div>
    
                <div class="section d-flex flex-column">
                    <input type="text" id="apellido" name="apellido" class="input" required>            
                    <span class="user_label">Apellido</span> 
                </div>
    
                <div class="section d-flex flex-column">
                    <input type="text" id="username" name="username" class="input" required>            
                    <span class="user_label">Username (Número empezando con 1 o 2)</span>
                </div>
    
                <div class="section d-flex flex-column">
                    <input type="password" id="password" name="password" class="input" required>            
                    <span class="user_label">Contraseña</span>
                </div>
    
                <div class="section d-flex flex-column">
                    <input type="text" id="edad" name="edad" class="input" required>            
                    <span class="user_label">Edad</span> 
                </div>
                
                <div class="section d-flex flex-column">
                    <input type="email" id="correo" name="correo" class="input" required>            
                    <span class="user_label">Correo</span> 
                </div>
    
                <div class="section d-flex flex-column">
                    <input type="text" id="telefono" name="telefono" class="input" required>            
                    <span class="user_label">Teléfono (Máximo 8 dígitos)</span>
                </div>
    
                <div class="section d-flex flex-column">
                    <input type="text" id="direccion" name="direccion" class="input" required>            
                    <span class="user_label">Dirección</span>
                </div>
    
                <!--<div class="section d-flex flex-column">
                    <input type="text" id="puesto" name="puesto" class="input" required>            
                    <span class="user_label">Puesto</span>
                </div> -->   

            </div>
            
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.mensaje}"> 
            
            <input class="login_button" type="submit"  value="GUARDAR">
        
        </form>
         

    </body>
</html>