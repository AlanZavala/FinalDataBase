<!DOCTYPE HTML>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Ventas</title>
        <link href="css/show.css" rel="stylesheet">  
    </head>
    <body>
        <br> <br>        
        <a href="pass.jsp">
            <p>Menu</p>
        </a>

        <table border="1">
            <tr>
                <th>ID</th>
                
             
               
            </tr>
            <c:forEach items="${requestScope.ventas}" var="venta">
                <tr>
                        <td>
                            <c:out value="${venta.id}" />
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



