<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link href="css/show2.css" rel="stylesheet">  
        <title>Diseños</title>
    </head>
    <style>
        #pestana, #name, #cuenta, #nombre{
            display: none;
        }
        td{ 
            text-align: center;
        }

        table{
            border-collapse: separate !important;
        }
        
    </style>
    <body>

        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 

            <input class="proyecto_buton btn btn-success ml-5 mt-3" type="submit"  value="Menu" id="boton_pro">
        </form>  

        <h4 class="text-center mt-2 font-weight-bold">Diseño Registrado</h4>

        <table border="1" id="main_t">
            <tr class="visible">
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
                <th></th>
            </tr>
            <c:forEach items="${requestScope.productos}" var="product">
                <tr>
                        <td>
                            <c:out value="${product.id}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${product.nombre}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${product.uso}" />
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
                    </tr>
            </c:forEach>
        </table>

        <br>
        <br>
        <br>
    </body>
</html>
