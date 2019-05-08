<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*"%>
<html>
    <head>
        <title>Proyectos</title>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link href="css/show2.css" rel="stylesheet">          
    </head>
    
    <style>
        #test3, #test4, #name, #cuenta, #pestana{
            display: none;
        }
        td{
            text-align: center;
        }
    </style>
    <body>

        <br> <br>
        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 

            <input class="proyecto_buton btn btn-success" type="submit"  value="Menu" id="boton_pro">
        </form>    
        <br>

        <form action ="./buscarProyecto" method="post" id="above">
            <select id="optBusq" name= "optBusq">
              <option value="All">All</option>
              <option value="Nombre">Nombre</option>
              <option value="Id">Id</option>
            </select>


            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="1"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
            <input type="text" id="valueBusca" name="valueBusca" class="input" required> 
            <input class="proyecto_buton btn btn-success" type="submit"  value="Buscar" id="boton_pro">
       </form>

       <table border="1" id="main_t">
            <tr class="visible">
                <th>ID</th>
                <th>Nombre</th>
                <th>Fecha de inicio</th> 
                <th>Fecha de término</th>
                <th>Duración</th>
                <th>Descripción</th> 
                <th>idCliente</th> 
                <th>Cantidad</th> 
                <th>PrecioTotal</th> 
                <th>Asignar</th>
                <th>Eliminar</th>
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
                        <td>
                            <form action ="./AsignarTrabajador" method="post">
                                <select name= "asign" id="asign">
                                    <option>Seleccionar tarabajador</option>
                                    <c:forEach items="${requestScope.ids_nombres}" var="id_nombre">
                                        <option value="${id_nombre.id}"><c:out value="${id_nombre.nombre}"/>-<c:out value="${id_nombre.id}"/></option>
                                    </c:forEach>
                                </select>
                                    <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                                    <input type="text" id="pestana" name="pestana" class="input" value="1"> 
                                    <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
                                    <input type="text" id="test4" name="test4" class="input" value="${proyecto.id}">
                                    <input class="proyecto_buton btn btn-success" type="submit"  value="Asignar" id="boton_pro2">

                            </form> 

                            <br />
                        </td>
                        <td>
                            <form action ="./borrarProyect" method="post"> 
                                <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                                <input type="text" id="pestana" name="pestana" class="input" value="11"> 
                                <input type="text" id="name" name="name" class="input" value="${requestScope.response}">
                                <input type="text" id="test3" name="test3" class="input" value="${proyecto.id}">  
                                <input class="proyecto_buton btn btn-success" type="submit"  value="Borrar" id="boton_pro3">
                                
                            </form> 
 
                            <br/>
                        </td>
                    </tr>
            </c:forEach>
        </table>
        <br>
        <br>
        <br>
        
    </body>
</html>