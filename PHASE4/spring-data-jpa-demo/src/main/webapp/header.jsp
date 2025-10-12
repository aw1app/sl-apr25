<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<div style="background-color:#f5f5f5; padding:10px; font-family:sans-serif;">
    <a href="${contextPath}/index.jsp">HOME</a> |
    <a href="${contextPath}/products/list-all">LIST PRODUCTS</a> |
    <a href="${contextPath}/new-product.jsp">ADD PRODUCT</a>
</div>
<hr/>