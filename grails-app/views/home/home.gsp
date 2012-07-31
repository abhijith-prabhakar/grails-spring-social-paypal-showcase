<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Home</title>
	</head>
	<body>
	<sec:ifLoggedIn>
		<ul>
			<li><a href="<c:url value="/home/signout" />">Sign Out</a></li>
		</ul>
	</sec:ifLoggedIn>
	<h3>Your PayPal Profile</h3>
	<ul>
        <li>User ID: <c:out value="${profile.user_id}"/></li>
        <li>Full Name (including middle name): <c:out value="${profile.name}"/></li>
        <li>First Name: <c:out value="${profile.given_name}"/></li>
        <li>Last Name: <c:out value="${profile.family_name}"/></li>
        <li>Locale: <c:out value="${profile.locale}"/></li>
        <li>Verified Status: <c:out value="${profile.verified}"/></li>
        <li>Email: <c:out value="${profile.email}"/></li>
        <li>
            Address
            <ul>
                <li>Street 1: <c:out value="${profile.address.street_address}"/></li>
                <li>City: <c:out value="${profile.address.locality}"/></li>
                <li>State: <c:out value="${profile.address.region}"/></li>
                <li>Country: <c:out value="${profile.address.country}"/></li>
                <li>Zip: <c:out value="${profile.address.postal_code}"/></li>
            </ul>
        </li>        
	</ul>	
	</body>
</html>