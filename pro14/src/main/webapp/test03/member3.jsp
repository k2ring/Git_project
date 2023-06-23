<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sec01.ex01.*"%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:useBean id="map" class="java.util.HashMap"></jsp:useBean>

<%

map.put("id", "qwer");
map.put("pw", "asdf");
map.put("name", "홍");
map.put("gender", "male");

%>

<%-- <c:set var="memberListasdfs" value="${list}"></c:set> --%>

<c:set var="asdfasdf" value = "${map}"></c:set>
<%-- <c:remove var="asdfasdf"/> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	${map} <br>
	${map.id} <br>
	${map.pw} <br>
	${map.name} <br>
	${map.gender} <br>
	<hr>
	${asdfasdf} <br>
	${asdfasdf.id} <br>
	${asdfasdf.pw} <br>
	${asdfasdf.name} <br>
	${asdfasdf.gender} <br>
	
	
	
</body>
</html>