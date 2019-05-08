<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
    <head>
        <title>Proyectos</title>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link href="css/show2.css" rel="stylesheet">   
    </head>
    <style>
        #test3, #test4, #cuenta, #pestana, #nombre{
            display: none;
        }
        td{
            text-align: center;
        }
    </style>
    <body>

        <br> <br>
        <form action ="./ShowWorkers" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="nombre" name="nombre" class="input" value="${requestScope.response}"> 
        
            <input class="proyecto_buton btn btn-success" type="submit"  value="Back" id="boton_pro">
        </form> 
        <br>

       <table border="1" id="main_t">
            <tr class="visible">
                <th>ID</th>
                <th>Nombre</th>
                <th>Fecha de inicio</th> 
                <th>Fecha de termino</th>
                <th>Duracion</th>
                <th>Descripcion</th> 
                <th>idCliente</th> 
                <th>Cantidad</th> 
                <th>PrecioTotal</th> 
            </tr>

            <tr class="invisible">
                <th></th>
                <th></th>
                <th></th> 
                <th></th>
                <th></th>
                <th></th> 
            </tr>

            <c:forEach items="${requestScope.proyectos}" var="proyecto">
                <tr>
                        <td>
                            <c:out value="${proyecto.id}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.nombre}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.fechaInicio}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.fechaFin}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.duracion}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.descripcion}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.cuenta}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.cantidad}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${proyecto.precioTotal}" />
                            <br />
                        </td>
                        
                    </tr>
            </c:forEach>
        </table>

        

        <br>
        <br>
        <br>
        
    </body>
</html>