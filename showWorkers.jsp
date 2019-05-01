<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Products</title>
        <link href="css/show.css" rel="stylesheet">   
    </head>
    <style>
        #test3{
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
        <form action ="./buscarWorker" method="post">
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
                <th>Apellido</th> 
                <th>Cuenta</th>
                <th>Edad</th>
                <th>Correo</th>
                <th>Telefono</th>  
                <th>Dirrecion</th> 
                <th>Puesto</th>  
                <th></th> 

            </tr>
            <c:forEach items="${requestScope.trabajadores}" var="worker">
                <tr>
                        <td>
                            <c:out value="${worker.id}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.nombre}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.apellido}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.cuenta}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.edad}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.correo}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.telefono}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.direccion}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${worker.puesto}" />
                            <br />
                        </td>
                        <td>
                            <form action ="./BorrarWorker" method="post">
                                <input type="text" id="test3" name="test3" class="input" value="${worker.id}"> 
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