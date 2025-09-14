<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

You are seeing content from forward-demo1.jsp

<%! int x=15; %>

<% if(x==5) { %>

	<jsp:forward page="forward-demo2.jsp"></jsp:forward>

<% }else{ %>

	<jsp:forward page="forward-demo3.jsp"></jsp:forward>

<% } %>