<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>

<!-- Declaration tag demo -->
<%!  int x=10; %>
<%!  int y=99; %>

<%!  
String greeting="Hi"; 

String world="World";
%>

<%!  
public int add(int x, int y){
	return x+y;
}
%>

<%!
int[] numberArray = {3,4,5,6,7,8};
%>! 


<!-- JSP expressions tag demo -->
	Today's date is <%=new java.util.Date()%> <br>
	
	Value of x is <%=x%> <br>
	
	Value of x+y is <%=x+y%>
	
	<br><br>
	<%= greeting + " " + world %>
	
	<br><br>
	55+45 = <%= add(55,45) %>
	
<br>
<!--  Scriptlet tag demo -->	
<% 
	for (int i=0; i<numberArray.length;i++ )
		out.println("numberArray["+i+"] " + numberArray[i] +"<br>");

%>

<br><br>
	<%	for (int i = 0; i < numberArray.length; i++){	%>

	<%= numberArray[i]%> <br>

	<% }	%>


<br><br><p> TASK-1 </p>
<%! String[] fruits = { "Apple", "Banana", "Gauva", "Mango", "Pear" }; %>

	<%	
	int i = 0;
	while (i < fruits.length) {
	%>
	<li><%=fruits[i]%></li>
	<%
	i++;
	}
	%>

	<br><br> 
<a href="index.jsp"> Home page </a>

</body>


</html>