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
	<H3>SEARCH BY Name:</H3>
	<form ACTION="${contextPath}/products/list-all-having-name" METHOD="GET">
	<input type="text" name="name">
	<input type="submit" value="Search">
	</form>
	
	<br><br>
	<H3>SEARCH BY Price less than</H3>
	<form ACTION="${contextPath}/products/list-all-having-price-lt" METHOD="GET">
	<input type="text" name="price">
	<input type="submit" value="Search">
	</form>


</body>
</html>