<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<% 
request.setAttribute("asdfaf", "nice");
session.setAttribute("sess", "nice55555");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
<%
application.setAttribute("app", "인클루드 가가가가가가가?");
%>
<jsp:include page="member2.jsp"></jsp:include>
<%
application.setAttribute("app2", "인클루드 되나나나나나나?");
%>
<%-- <jsp:forward page="member2.jsp"></jsp:forward> --%>
</body>
</html>
