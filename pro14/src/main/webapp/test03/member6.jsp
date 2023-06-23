<%@page import="org.apache.jasper.tagplugins.jstl.core.Choose"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:useBean id="list" class="java.util.ArrayList"></jsp:useBean>

<%
list.add("hi");
list.add("nice");
list.add("ㅋㅋㅋ");
%>

<c:set var="list" value="${list}" ></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:forEach var="i" items="${list}" >
	${i} <br>
	</c:forEach>
	<hr>
	
	<c:forTokens items="hi,nice,ㅋㅋㅋ2" delims="," var="i">
	${i} <br>
	</c:forTokens>
	

</body>
</html>













