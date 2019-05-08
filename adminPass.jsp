<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/admin.css">                
        <style>
            body{
                font-family: 'Raleway';
                margin: 0;
                background-color: #222222;                           
            }
            h1{
                color: white;
                margin-left: 50px;
                margin-top: 50px;
            }
            section{
                min-height: 100%;
                margin-top: 80px;
            }
            #nombre, #cuenta, #pestana, #name, #mensaje{
                display: none;
            }
            .card{
                min-height: 235px !important;
                margin-bottom: 30px !important;
                position: relative;
                border-color: white;
            }
            .card-body{
                background-color: rgba(255,255,255, 0.91);
            }
            .card-title{
                text-align: center;
                background-color: #323232;
            }
            .card-header{
                border-bottom: 1px solid rgb(255,255,255) !important;
            }
            .card-text{
                color: black !important;
            }
            .bg-secondary{
                background-color: black !important;
            }
            div.card div.card-body input.btn{
                position: absolute;
                bottom: 10px;
            }
            .card-text{
                text-align: justify;
            }
            button.btn-danger{
                position: absolute;
                right: 30px;
                top: 30px;
            }
        </style>

        <title>Entrada user</title>
        
    </head>

    <body>
            
        <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModalCenter">
            Log out
        </button>

        <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                <div class="modal-header">
                <h5 class="modal-title" id="exampleModalCenterTitle">Confirmar cierre de sesión</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                </div>
                
                <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancelar</button>
                <a href="index.jsp">
                    <button type="button" class="btn btn-primary">Log out</button>
                </a>
                
                </div>
            </div>
            </div>
        </div>


        <br> <br>
        <h1> 
            ¡ Bienvenido <c:out value = "${requestScope.response}"/> !
        </h1>
  

        <section class="row justify-content-center align-items-center mx-0">

            <form action="./Session" method="post">
                <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                    <h5 class="card-header card-title">Proyecto/Venta</h5>
                    <div class="card-body">
                        <p class="card-text"> Agrega un nuevo proyecto/venta a la tienda.</p>
                            <input class="proyecto_buton btn btn-success" type="submit"  value="Agregar">
                            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                            <input type="text" id="pestana" name="pestana" class="input" value="7">
                        
                    </div>
                </div>
            </form>

            <form action="./ShowProjects" method="post">
                <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                    <h5 class="card-header card-title">Ver proyectos</h5>
                    <div class="card-body">
                        <p class="card-text">Revisa los proyectos en los que estás envuelto y haz las modificaciones necesarias.</p>
                        <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
                        <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                        <input type="text" id="pestana" name="pestana" class="input" value="1"> 
                        <input class="proyecto_buton btn btn-success" type="submit"  value="Proyectos">
                    </div>
                </div>
            </form>

            <form action="./Session" method="post">
                <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                    <h5 class="card-header card-title">Nuevo diseño</h5>
                    <div class="card-body">
                        <p class="card-text">Agrega un nuevo diseño a la tienda y pónlo a la venta.</p>
                            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                            <input type="text" id="pestana" name="pestana" class="input" value="4"> 
                            <input class="proyecto_buton btn btn-success" type="submit"  value="Agregar">
                        
                    </div>
                </div>
            </form>

            <form action="./ShowProducts" method="post">
                    <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                        <h5 class="card-header card-title">Ver diseños</h5>
                        <div class="card-body">
                            <p class="card-text">Observa todos los diseños que están en la tienda y la descripcion de cada uno.</p>
                            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
                            <input class="proyecto_buton btn btn-success" type="submit"  value="Ver">
                        </div>
                    </div>
            </form>

            <form action="./Session" method="post">
                <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                    <h5 class="card-header card-title">Dar de alta trabajadores</h5>
                    <div class="card-body">
                        <p class="card-text"> Agrega a un nuevo empleado e ingresa los datos necesarios para darlo de alta en la empresa.</p>
                            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                            <input type="text" id="pestana" name="pestana" class="input" value="3"> 
                            <input type="text" id="mensaje" name="mensaje" class="input" value=" "> 
                            <input class="proyecto_buton btn btn-success" type="submit"  value="Agregar">
                        
                    </div>
                </div>
            </form>
 
            <form action="./ShowWorkers" method="post">
                    <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                        <h5 class="card-header card-title">Ver trabajadores</h5>
                        <div class="card-body">
                            <p class="card-text"> Observa a todos los trabajadores de la empresa y sus detalles. </p>
                            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
                            <input class="proyecto_buton btn btn-success" type="submit"  value="Ver">
                        </div>
                    </div>
            </form>

            <form action="./Session" method="post">
                <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                    <h5 class="card-header card-title">Dar de alta clientes</h5>
                    <div class="card-body">
                        <p class="card-text"> Agrega a un nuevo cliente e ingresa los datos necesarios para darlo de alta en la empresa.</p>
                            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                            <input type="text" id="pestana" name="pestana" class="input" value="6"> 
                            <input class="proyecto_buton btn btn-success" type="submit"  value="Agregar">
                        
                    </div>
                </div>
            </form>
 
            <form action="./ShowClients" method="post">
                    <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                        <h5 class="card-header card-title">Ver clientes</h5>
                        <div class="card-body">
                            <p class="card-text"> Observa a todos los clientes de la empresa y sus detalles. </p>
                            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
                            <input class="proyecto_buton btn btn-success" type="submit"  value="Ver">   
                        </div>
                    </div>
            </form>

            <form action="./ShowPeticion" method="post">
                <div class="card text-white bg-secondary my-0 ml-5" style="max-width: 18rem;">
                    <h5 class="card-header card-title">Ver peticiones</h5>
                    <div class="card-body">
                            <p class="card-text">Observa todas las peticiones de proyectos que los clientes han realizado.</p>
                            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
                            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}">
                            <input type="text" id="pestana" name="pestana" class="input" value="1">  
                        <input class="proyecto_buton btn btn-success" type="submit"  value="Ver">
                    </div>
                </div>
            </form>

             

        </section>
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
