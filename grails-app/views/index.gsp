<!doctype html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
	</head>
	<body>
		<g:set var="connectionFactories" value="${springsocial.registeredProviderIds()}"/>
		<script type="text/javascript">
		    function paypal_access_popup() {
		        connectWindow = window.open (
		                "", 
		        		"_PPIdentityWindow_",
	                	"location=1,status=0,scrollbars=0,width=400,height=550");
		        
	            return false;
            }
		</script>
		

	<form action="${c.url(value: '/sssignin/paypal' )}" method="POST" target="_PPIdentityWindow_">
		    <input class="connectButton" type="image" src="https://www.paypalobjects.com/en_US/Marketing/i/btn/login-with-paypal-button.png" 
                onclick="paypal_access_popup()" />
		</form>
	
	</body>
</html>
