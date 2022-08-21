<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>
Create new lead
</h2>

<form action="saveLead" method="post">
First Name <input type="text" name="firstName">
<br>
Last Name <input type="text" name="lastName">
<br>
Email <input type="text" name="email">
<br>
Mobile <input type="text" name="mobile">
<br>
<input type="submit" value="save"/>

</form>
${msg }

</body>
</html>