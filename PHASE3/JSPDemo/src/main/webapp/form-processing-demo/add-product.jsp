<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%

String name = request.getParameter("name");
String priceStr = request.getParameter("price");

float price = Float.parseFloat(priceStr);

out.println("Hey you just submitted " + name + " with price "+ price);

%>
