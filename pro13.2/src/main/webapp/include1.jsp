<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
request.setCharacterEncoding("utf-8");
%> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>include1.jsp</title>
</head>
<body>
	안녕하세요. 쇼핑몰 중심 JSP 시작입니다!!!
	<br>--------------------------------------------------
	<br>
	<jsp:include  page="duke_image.jsp"  name="name" >
	   <jsp:param value = "afkjghalfjghalg" name="name" >
	   <jsp:param value = "/image/dog.jpg" name="dog" >
	   <jsp:param value = "/image/cat.jpg" name="cat" >
	   <jsp:param value = "/image/호랑이.jpg" name="tiger" >
	</jsp:include>
	<br>--------------------------------------------------
	<br>안녕하세요. 쇼핑몰 중심 JSP 끝 부분입니다.!!!
</body>
</html>
