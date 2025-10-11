<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of all Products</title>
</head>
<body>
<%@ include file="../../header.jsp" %>

<table border="1">

<c:forEach var="product" items="${products}">
<tr> <td> ${product.id} <td> ${product.name}<td> ${product.price}<td> ${product.category} </tr>
</c:forEach>

</table>


</body>
</html>