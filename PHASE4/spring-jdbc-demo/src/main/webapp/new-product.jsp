<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Product</title>
</head>
<body>

<%@ include file="header.jsp" %>

<h2>Add New Product</h2>
<form action="${contextPath}/products/add" method="POST">
NAME : <input type="text" name="name"> <br><br>
PRICE : <input type="text" name="price"> <br><br>
CATEGORY : <input type="text" name="category"> <br><br>

<input type="submit" value="Add Product">
</form>

</body>
</html>