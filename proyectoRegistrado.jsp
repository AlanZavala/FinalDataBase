<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/all.css">     
        <link rel="stylesheet" href="css/bootstrap.min.css">   
        <link href="css/show2.css" rel="stylesheet"> 
        <title>Proyectos</title>
    </head>
    <body>

        <a href="pass.jsp">
            <i class="fas fa-arrow-circle-left"></i>
        </a>

        <h4 class="text-center mt-2 font-weight-bold">Proyecto Registrado</h4>

        <table border="1" id="main_t">
            <tr class="visible">
                <th>ID</th>
                <th>Nombre</th>
                <th>Fecha de inicio</th> 
                <th>Fecha de termino</th>
                <th>Duracion</th>
                <th>Descripcion</th> 
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
                    </tr>
            </c:forEach>
        </table>

        <br>
        <br>
        <br>
        <a href="./adminPass.jsp">Menu</a>
    </body>
</html>
