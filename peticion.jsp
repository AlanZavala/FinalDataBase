<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">      

        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">    
        <link rel="stylesheet" href="css/all.css">        
        <link href="css/formulario.css" rel="stylesheet">

        <title>Petición</title>
    </head>
    <style>
        #nombre, #cuenta, #pestana, #name{
                display: none;
        }
    </style>
    
    <body>

        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}">         
            <input class="proyecto_buton btn btn-success" type="submit"  value="Menu" id="boton_pro">
        </form>  

        <h4 class="text-center mt-2 font-weight-bold">Nueva petición</h4>

        <form action="./NewPeticion" method="post" class="mt-5">
            <div id="registro" class="row justify-content-center mx-0">

                <div class="section d-flex flex-column">
                    <input type="text" id="id" name="id" class="input" required>            
                    <span class="user_label">ID Petición</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" id="idCliente" name="idCliente" class="input" required>            
                    <span class="user_label">ID Cliente</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" name="nombre" class="input" required>            
                    <span class="user_label">Nombre del Proyecto</span> 
                </div>

                <div class="section d-flex flex-column">
                    <input type="date" id="fechaTentativa" name="fechaTentativa" class="input" required>            
                    <span class="user_label">Fecha tentativa</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" id="descripcion" name="descripcion" class="input" required>            
                    <span class="user_label">Descripción</span>                
                </div>


                <div class="section d-flex flex-column">
                    <input type="text" id="cantidad" name="cantidad" class="input" required>            
                    <span class="user_label">Cantidad</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" id="telefono" name="telefono" class="input" required>            
                    <span class="user_label">Teléfono (Máximo 8 dígitos)</span> 
                </div>                            
    
            </div>           

            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}">   
                   
            <input class="login_button" type="submit"  value="GUARDAR">
            
        
        </form>
    </body>
</html>
