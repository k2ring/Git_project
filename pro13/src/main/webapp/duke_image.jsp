<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
/*  request.setCharacterEncoding("utf-8");  */
String name = request.getParameter("name");
String imgName = request.getParameter("dog");
String imgName2 = request.getParameter("cat");
String imgName3 = request.getParameter("tiger");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>gg<br>
<% out.print(name); %>
<% out.print(imgName); %>
<% out.print(imgName3); %>
<!-- <img src="./image/dog.jpg"> --> 
<img src=".<%=imgName %>"  />  
<hr>
<img src=".<%=imgName2 %>"  />


<hr>
<img src=".<%=imgName3 %>"  />


</body>
</html>