<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                    
        <link href="https://fonts.googleapis.com/css?family=Raleway:300,700" rel="stylesheet">
        <link href="css/estilos.css" rel="stylesheet">

        <script src="js/jquery-3.3.1.min.js"></script>

        <title>Página de inicio</title>
    </head>

    <body>
       
        <form action="./Login" method="post" data-sn="home">
            <img src="img/logo.png" class="logo">
            <div class="register">
                <input type="text" id="username" name="username" class="input">            
                <span class="user_label">Username</span>

                <input type="password" id="password" name="password" class="input">            
                <span class="user_label">Password</span>                    
                
                <input class="login_button" type="submit"  value="LOG IN">
            </div>
        </form>

        <script>
            $("form").hide().fadeIn(1000);
        </script>

    </body>
</html>