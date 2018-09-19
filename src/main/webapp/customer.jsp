<%@ page isELIgnored="false"%>
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
	</head>
	<body>
		<h2>Customers</h2>

		<c:out value="${'Welcome to Customer Details Site'}" />

		<table border="1">
			<tr>
				<th>Customer Id</th>
				<th>First Name</th>
				<th>Last Name</th>
			</tr>
			<c:forEach var="customer" items="${requestScope.customers}">
				<tr>
					<td> <c:out value="${customer.getCustomerId()}"/> </td>
					<td> <c:out value="${customer.getfName()}"/> </td>
					<td> <c:out value="${customer.getlName()}"/> </td>
				</tr>
			</c:forEach>
		</table>
		
		
	</body>
</html>