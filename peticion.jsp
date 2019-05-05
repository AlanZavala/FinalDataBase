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

        <title>Peticion</title>
    </head>
    
    <body>
<!--         
        <a href="clientPass.jsp">
            <i class="fas fa-arrow-circle-left"></i>
        </a> -->

        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}">         
            <input class="proyecto_buton btn btn-success" type="submit"  value="Menu" id="boton_pro">
        </form>  

        <h4 class="text-center mt-2 font-weight-bold">Nuevo petición</h4>

        <form action="./NewPeticion" method="post" class="mt-5">

            <!-- <img src="img/product.jpg" alt=""> -->
            <div id="registro" class="row justify-content-center mx-0">

                <div class="section d-flex flex-column">
                    <input type="text" id="id" name="id" class="input" required>            
                    <span class="user_label">ID Peticion</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" id="idCliente" name="idCliente" class="input" required>            
                    <span class="user_label">ID Cliente</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" id="nombre" name="nombre" class="input" required>            
                    <span class="user_label">Nombre del proyecto</span> 
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
                    <span class="user_label">Teléfono</span> 
                </div>                            
    
            </div>            
                   
            <input class="login_button" type="submit"  value="GUARDAR">            

            <!-- <a href="pass.jsp">
                <p>Atrás</p>
            </a> -->
            
        
        </form>
    </body>
</html>