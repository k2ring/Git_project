<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%! String name="홍길동"; 
	int age=33;

%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	hi
	<br> 이름 :
	<%=name%><br> 나이 :
	<%=age %>
	<br>


	<%
for(int i=1;i<=10;i++){
	if(i%2 !=0 ) {
%>

	<%=i%><br>


	<% }else { %>
	짝
	<br>
	<% }
}%>
</body>
</html>