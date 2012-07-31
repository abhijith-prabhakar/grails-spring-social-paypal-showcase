<%@ page session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <script type="text/javascript">
            function sendToParent() {
                if(window.opener) {
                    window.opener.location.replace("<c:url value="/home"/>");
                    window.close();
                }
             }
        </script>
    </head>
    <body onload="javascript:sendToParent()">
    </body>
</html>
