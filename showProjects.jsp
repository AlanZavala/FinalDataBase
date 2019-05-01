<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Products</title>
        <link href="css/show.css" rel="stylesheet">   
    </head>
    <style>
        #test3, #test4{
            display: none;
        }
        td{
            text-align: center;
        }
    </style>
    <body>

        <br> <br>
        <a href="./adminPass.jsp">
            <p>Menu</p>
        </a>
        <br>
        <form action ="./buscarProyecto" method="post">
            <select id="optBusq" name= "optBusq">
              <option value="All">All</option>
              <option value="Nombre">Nombre</option>
              <option value="Id">Id</option>
              
            </select>

            <input type="text" id="valueBusca" name="valueBusca" class="input" required> 
            <input class="proyecto_buton btn btn-success" type="submit"  value="Buscar">
                        </div>

       </form>
       <table border="1">
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Fecha de inicio</th> 
                <th>Fecha de termino</th>
                <th>Duracion</th>
                <th>Descripcion</th> 
                <th>Añadir</th>
                <th>Eliminar</th>

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
                            <form action ="./AsignarTrabajador" method="post">
                                <input type="text" id="asign" name="asign" class="input" > 
                                <input type="text" id="test4" name="test4" class="input" value="${proyecto.id}"> 
                                <input class="proyecto_buton btn btn-success" type="submit"  value="Asignar" >
                                
                            </form> 

                            <br />
                        </td>
                        <td>
                            <form action ="./BorrarProyect" method="post">
                                <input type="text" id="test3" name="test3" class="input" value="${proyecto.id}"> 
                                <input class="proyecto_buton btn btn-success" type="submit"  value="Borrar" >
                                
                            </form> 

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