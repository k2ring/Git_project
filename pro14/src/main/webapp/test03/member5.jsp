<%@page import="org.apache.jasper.tagplugins.jstl.core.Choose"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="map" class="java.util.HashMap"></jsp:useBean>

<c:set var="id" value="hong" scope="page"></c:set>
<c:set var="pwd" value="1234" scope="page"></c:set>
<%-- <c:set var="name" value="${'홍길동'}" scope="page"></c:set> --%>
<c:set var="age" value="${22}" scope="page"></c:set>
<c:set var="height" value="${177}" scope="page"></c:set>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:choose>
		<%-- <c:when test="name==null"> --%>
		<c:when test="${empty name}">
			<tr align="center">
				<td colspan="5">이름 입력</td>
			</tr>
		</c:when>
		<c:otherwise>
			<tr align="center">
				<td>${id}</td> <br>
				<td>${pwd}</td> <br>
				<td>${name}</td> <br>
				<td>${age}</td> <br>
				<td>${height}</td> <br>
			</tr>
		</c:otherwise>
	</c:choose>

</body>
</html>