<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<!DOCTYPE html>

<jsp:useBean id="product1" class="com.sl.Product" ></jsp:useBean> 

<jsp:setProperty name="product1" property="name" />
<jsp:setProperty name="product1" property="price" />

<br> <br> Name:  <%=product1.getName() %>
<br> <br> Price:  <%=product1.getPrice() %>



