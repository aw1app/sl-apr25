<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>

<jsp:useBean id="product1" class="com.sl.Product" scope="request"></jsp:useBean> 

<p> INSIDE add-product-using-javabean-catch-all-save-2-db.jsp </p>
<br> <br> Name:  <%=product1.getName() %>
<br> <br> Price:  <%=product1.getPrice() %>


////////////////////
<br> Got the above product data. Will save to the MySQL DB now.



