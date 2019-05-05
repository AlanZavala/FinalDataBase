<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/all.css">     
        <link rel="stylesheet" href="css/bootstrap.min.css">   
        <link href="css/show2.css" rel="stylesheet"> 
        <title>Peticion</title>
    </head>
    <style>
        #nombre, #cuenta, #pestana, #name{
                display: none;
        }
    </style>
    <body>

        <!-- <a href="pass.jsp">
            <i class="fas fa-arrow-circle-left"></i>
        </a> -->

        <h4 class="text-center mt-2 font-weight-bold">Proyecto Registrado</h4>

        <table border="1" id="main_t">
            <tr class="visible">
                <th>IDPeticion</th>
                <th>ID cliente</th>
                <th>Nombre del proyecto</th>
                <th>Fecha tentativa</th>
                <th>Descripción</th>
                <th>Cantidad</th>
                <th>Teléfono</th>
 

 


            </tr>

            <tr class="invisible">
                    <th></th>
                    <th></th>
                    <th></th> 
                    <th></th>
                    <th></th>
                    <th></th> 
                    <th></th> 
                </tr>
            <c:forEach items="${requestScope.peticiones}" var="peticion">
                <tr>
                        <td>
                            <c:out value="${peticion.id}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${peticion.idClient}"/>
                            <br />
                        </td>
                        <td>
                            <c:out value="${peticion.nombreProyecto}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${peticion.fechaTentiva}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${peticion.descripcion}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${peticion.cantidad}" />
                            <br />
                        </td>

                        <td>
                            <c:out value="${peticion.telefono}" />
                            <br />
                        </td>
                    </tr>
            </c:forEach>
        </table>

        <br>
        <br>
        <br>
        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 

            <input class="proyecto_buton btn btn-success ml-5 mt-3" type="submit"  value="Menu" id="boton_pro">
        </form>  
        <!-- <a href="./adminPass.jsp">Menu</a> -->
    </body>
</html>


