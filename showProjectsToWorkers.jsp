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
        #test3, #test4, #cuenta, #pestana, #name{
            display: none;
        }
        td{
            text-align: center;
        }
    </style>
    <body>

        <br> <br>
        <!-- <a href="./pass.jsp">
            <p>Menu</p>
        </a> -->
        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="2"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 

            <input class="proyecto_buton btn btn-success" type="submit"  value="Menu" id="boton_pro">
        </form> 
        <br>
        <form action ="./buscarPytWorker" method="post">
            <select id="optBusq" name= "optBusq">
              <option value="All">All</option>
              <option value="Nombre">Nombre</option>
              <option value="Id">Id</option>
              
            </select>

            <input type="text" id="valueBusca" name="valueBusca" class="input" required> 
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="2"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
            <input class="proyecto_buton btn btn-success" type="submit"  value="Buscar">
                        <!-- </div> -->
       </form>
       
       <table border="1" id="main_t">
            <tr class="visible">
                <th>ID</th>
                <th>Nombre</th>
                <th>Fecha de inicio</th> 
                <th>Fecha de termino</th>
                <th>Duracion</th>
                <th>Descripcion</th> 
                <th>idCliente</th> 
                <th>NoProductos</th> 
                <th>PrecioTotal</th> 
                <!-- <th>Añadir</th>
                <th>Eliminar</th> -->
            </tr>
            <tr class="invisible">
                <th></th>
                <th></th>
                <th></th> 
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