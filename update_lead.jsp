<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update here</title>
</head>
<body>
<h2>
update lead
</h2>

<form action="updateLead" method="post">
<input type="hidden" name="id" value="${lead.id}"/>
<br>
First Name <input type="text" name="firstName" value="${lead.firstName}"/>
<br>
Last Name <input type="text" name="lastName" value="${lead.lastName}"/>
<br>
Email <input type="text" name="email"value="${lead.email}"/>
<br>
Mobile <input type="text" name="mobile"value="${lead.mobile}"/>
<br>
<input type="submit" value="update"/>

</form>
${msg }

</body>
</html>