<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<html>
    <head>
        <title>Products</title>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link href="css/show2.css" rel="stylesheet">   
    </head>
    <style>
        #test3, #test4, #cuenta, #name, #pestana{
            display: none;
        }
        td{
            text-align: center;
        }
    </style>
    <body>

        <br> <br>
        <!-- <a href="./adminPass.jsp">
            <p>Menu</p>
        </a> -->
        <form action ="./Session" method= "post">
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}"> 
        
            <input class="proyecto_buton btn btn-success" type="submit"  value="Menu" id="boton_pro">
        </form> 
        <br>

        <form action ="./buscarWorker" method="post" id="above">
            <select id="optBusq" name= "optBusq">
              <option value="All">All</option>
              <option value="Nombre">Nombre</option>
              <option value="Id">Id</option>
              
            </select>
            <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
            <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}">
            <input type="text" id="valueBusca" name="valueBusca" class="input" required> 
            <input class="proyecto_buton btn btn-success" type="submit"  value="Buscar" id="boton_pro">
                        <!-- </div> -->
       </form>

       <table border="1" id="main_t">
            <tr class="visible">
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
                <th>Proyectos</th>
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
                                <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                                <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
                                <input type="text" id="name" name="name" class="input" value="${requestScope.response}">
                                <input class="proyecto_buton btn btn-success" type="submit"  value="Borrar" id="boton_pro3">
                                
                            </form> 

                            <br />
                        </td>
                        <td>
                            <form action ="./VerProyectos" method="post">
                                <input type="text" id="test4" name="test4" class="input" value="${worker.id}"> 
                                <input type="text" id="cuenta" name="cuenta" class="input" value="${requestScope.response2}"> 
                                <input type="text" id="pestana" name="pestana" class="input" value="${requestScope.response3}"> 
                                <input type="text" id="name" name="name" class="input" value="${requestScope.response}">
                                <input class="proyecto_buton btn btn-success" type="submit"  value="VerProyectos" id="boton_pro2" >
                                
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