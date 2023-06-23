<%@page import="org.apache.jasper.tagplugins.jstl.core.Choose"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="map" class="java.util.HashMap"></jsp:useBean>

<c:set var="id" value="hong" scope="page"></c:set>
<c:set var="pwd" value="1234" scope="page"></c:set>
<c:set var="name" value="${'홍길동'}" scope="page"></c:set>
<c:set var="age" value="${22}" scope="page"></c:set>
<c:set var="height" value="${177}" scope="page"></c:set>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach begin="1" end="10" var="i">
		${i} <br>
	</c:forEach>
		<hr>
		
		
	<c:forEach begin="1" end="10" var="i" step="2">
		${i} <br>
	</c:forEach>
		<hr>
		
		
	<c:forEach begin="10" end="20" var="i" varStatus="asdf">
		${i} : ${asdf.index} <br>
	</c:forEach>
		<hr>
		
		
	<c:forEach begin="10" end="20" var="i" varStatus="asdf">
		${i} : ${asdf.count} <br>
	</c:forEach>
		<hr>
		
		
	<c:forEach begin="10" end="20" var="i" varStatus="asdf">
		${i} : ${asdf.first} <br>
	</c:forEach>
		<hr>
		
		
	<c:forEach begin="10" end="20" var="i" varStatus="asdf">
		${i} : ${asdf.last} <br>
	</c:forEach>
		<hr>
		
		
	<c:set var="tot" value="0"></c:set>
	
	<c:forEach begin="1" end="10" var="i" varStatus="asdf">
		${tot = tot + i} <br>
	</c:forEach>
		<hr>	
		최종값 : ${tot}
		<hr>	
	 
	<c:forEach begin="2" end="9" var="i">
		<c:forEach begin="1" end="9" var="j">
			${i} * ${j} = ${i * j} &nbsp;&nbsp;&nbsp;&nbsp;
		</c:forEach>
		<br>
	</c:forEach>
		<hr>
	
	
	
	
</body>
</html>











