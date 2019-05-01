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
        <a href="./showProjects.jsp">
            <p>Menu</p>
        </a>
        <br>
        <!-- <form action ="./buscarProducto" method="post">
            <select id="optBusq" name= "optBusq">
              <option value="All">All</option>
              <option value="Nombre">Nombre</option>
              <option value="Id">Id</option>
              <option value="Proveedor">Proveedor</option>
              
            </select> -->

<!--             <input type="text" id="valueBusca" name="valueBusca" class="input" required> 
            <input class="proyecto_buton btn btn-success" type="submit"  value="Buscar">
                        </div> -->

       </form>

        <table border="1">
            <tr>
                <th>ID</th>
                <th>Uso</th>
                <th>Nombre</th>
                <th>Fecha de llegada</th>
                <th>Fecha de venta</th>
                <th>Precio proveedor</th>
                <th>Precio cliente</th>
                <th>Proveedor</th>
                <th>Tabla</th>
                <th>Ganancia</th>
                <th></th>
            </tr>
            <c:forEach items="${requestScope.productos}" var="product">
                <tr>
                        <td>
                            <c:out value="${product.id}" />
                            <br />
                        </td>
                        <td >
                            <c:out value="${product.uso}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${product.nombre}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${product.fechaLlegada}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${product.fechaVenta}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${product.precioProveedor}" />
                            <br />
                        </td>

                        <td>
                            <c:out value="${product.precioCliente}" />
                            <br />
                        </td>

                        <td>
                            <c:out value="${product.proveedor}" />
                            <br />
                        </td>

                        <td>
                            <c:out value="${product.tabla}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${product.ganancia}" />
                            <br />
                        </td>
                        
                        <td>
                            <form action ="./BorrarPro" method="post">
                                <input type="text" id="test3" name="test3" class="input" value="${product.id}"> 
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
