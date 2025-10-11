<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of all Products</title>
</head>
<body>

	<c:forEach var="product" items="${products}">
${product.id}, ${product.name}, ${product.price}, ${product.category} <br/>
</c:forEach>


</body>
</html>