<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of all Products</title>
</head>
<body>
	<%@ include file="../../header.jsp"%>

	<c:if test="${not empty message}">
		<p style="color: green;">${message}</p>
	</c:if>

	<br />
	<br />

	<table border="1">

		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.name}
				<td>${product.price}
				<td>${product.category}
				<td><a href="${contextPath}/products/delete/${product.id}">DELETE</a>
			</tr>
		</c:forEach>

	</table>


</body>
</html>