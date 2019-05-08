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

        <title>Nueva Venta/Proyecto</title>        
    </head>
    <style>
        #pestana, #name, #cuenta, #nombre{
            display: none; 
        }
        
    </style>
    <body>

        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 

            <input class="proyecto_buton fas fa-arrow-circle-left" type="submit"  value="Atrás" id="boton_pro">
        </form>  

        <h4 class="text-center mt-2 font-weight-bold">Nueva Venta/Proyecto</h4>

        <form action="./proyectoVenta" method="post" class="mt-5">
            <div id="registro" class="row justify-content-center mx-0">
                <div class="section d-flex flex-column">
                    <input type="text" id="id" name="id" class="input" required>            
                    <span class="user_label">IDProyecto</span>
                </div>
                <div class="section d-flex flex-column">
                    <input type="text" id="nombres" name="nombres" class="input" required>            
                    <span class="user_label">Nombre del Proyecto</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="date" id="fechaInicio" name="fechaInicio" class="input" required>            
                    <span class="user_label">Fecha de Inicio</span>  
                </div>

                <div class="section d-flex flex-column">
                    <input type="date" id="fechaTermino" name="fechaTermino" class="input" required>            
                    <span class="user_label">Fecha de Término</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" id="duracion" name="duracion" class="input" required>            
                    <span class="user_label">Duración (En Semanas)</span>
                </div>

                <div class="section d-flex flex-column">
                    <input type="text" id="descripcion" name="descripcion" class="input" required>            
                    <span class="user_label">Descripción</span>
                </div>

                <div class="section d-flex flex-column">
                    <select name= "cliente" required>
                        <option>Seleccionar Cliente</option>
                        <c:forEach items="${requestScope.clientes}" var="clien">
                            <option value="${clien.id}">Cuenta: <c:out value="${clien.cuenta}"/> - ID: <c:out value="${clien.id}"/></option>
                        </c:forEach>
                    </select>            
                    <span class="user_label">ID Cliente</span>
                </div>
               
                <div class="section d-flex flex-column">
                    <input type="text" id="cantidad" name="cantidad" class="input" required>            
                    <span class="user_label">Cantidad</span> 
                </div>

                <div class="section d-flex flex-column">
                    <c:forEach items="${requestScope.trabajadores}" var="trabaja">
                        <input type="text" id="idTrabajador" name="idTrabajador" class="input" value="${trabaja.id}" required>            
                    </c:forEach>                    
                    <span class="user_label">ID Trabajador que atendió</span> 
                </div>


                <div class="section d-flex flex-column">
                    <input type="text" id="precioTotal" name="precioTotal" class="input" required>            
                    <span class="user_label">Precio Total</span>
                </div>
                <div class="section d-flex flex-column">
                    <input type="text" id="idVenta" name="idVenta" class="input" required>            
                    <span class="user_label">ID de la Venta</span>
                </div>


            </div>
           
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
                   
            <input class="login_button" type="submit"  value="GUARDAR">                       
        
        </form>
        
    </body>
</html>