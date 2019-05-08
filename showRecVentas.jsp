<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Ventas Recientes</title>
        <meta http-equiv="content-type" content="text/html" charset="UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link rel="stylesheet" href="css/bootstrap.min.css">   
        <link href="css/show2.css" rel="stylesheet">   
    </head>
    <style>
        #test3, #cuenta, #pestana, #name{
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
            <input type="text" id="pestana" name="pestana" class="input" value="10"> 
            <input type="text" id="name" name="name" class="input" value="${requestScope.response}">         
            <input class="proyecto_buton btn btn-success" type="submit"  value="Menu" id="boton_pro">
        </form>  
        <br>

        <h4 class="text-center mt-2 font-weight-bold">Compras recientes</h4>

        <table border="1" id="main_t">
            <tr class="visible">
                <th>Folio de tus compras anteriores</th>
                            
            </tr>

            <tr class="invisible">
                <th></th>
                <th></th>
                
            </tr>


            <c:forEach items="${requestScope.ventasRec}" var="rec">
                <tr>
                        <td>
                            <c:out value="${rec.id}" />
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



































