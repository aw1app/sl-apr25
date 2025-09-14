<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"  errorPage="../error-pages/arithmetic-error-message.jsp"%>
<!DOCTYPE html>
<html>

<body>

<!-- Include Directive demo -->
<%@  include file="header.html" %>

<h1> Page Directive demo</h1>

Today's date is <%=new Date()%> <br>


<!-- Include Directive demo another approach -->
<jsp:include page="footer.html"></jsp:include>


<!-- error Page directive -->
<%! int x=100; int y=0; %>

x/y is <%= x/y %>

</body>
</html>