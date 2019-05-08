<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Peticion</title>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link href="css/show2.css" rel="stylesheet">   
    </head>
    <style>
        #test3, #cuenta, #pestana, #name{
            display: none; 
        }
        td{
            text-align: center;
        }
        h4{
            text-align: center;
        }
    </style>
    
    <body>

        <br> <br>
        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}">         
            <input class="proyecto_buton btn btn-success" type="submit"  value="Menu" id="boton_pro">
        </form>  
        <br>

        <h4 class="text-center mt-2 font-weight-bold">Petición</h4>

        <table border="1" id="main_t">
            <tr class="visible">
                <th>ID</th>
                <th>Nombre del proyecto</th>
                
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
            </tr>


            <c:forEach items="${requestScope.peticiones}" var="pet">
                <tr>
                        <td>
                            <c:out value="${pet.id}" />
                            <br />
                        </td>
                        
                        <td>
                            <c:out value="${pet.nombreProyecto}" />
                            <br />
                        </td>
                        
                        <td>
                            <c:out value="${pet.descripcion}" />
                            <br />
                        </td>
                        <td>
                            <c:out value="${pet.cantidad}" />
                            <br />
                        </td>

                        <td>
                            <c:out value="${pet.telefono}" />
                            <br />
                        </td>

                        <td>
                            <form action ="./borrarPeticion" method="post">
                                <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                                <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
                                <input type="text" id="name" name="name" class="input" value="${requestScope.response}">
                                <input type="text" id="test3" name="test3" class="input" value="${pet.id}"> 
                                <input class="proyecto_buton btn btn-success" type="submit"  value="Eliminar/revisado" id="boton_pro3" >
                                
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



































