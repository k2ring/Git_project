<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>

<%

List mlist = (List)request.getAttribute("mlist");

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<%=mlist %> <br>
	
	<%-- <%= mlist.get(0) %> <br> --%>
	<%-- <%= mlist.get(0).getId() %> <br> --%>

	${mlist[0].id } <br>
	${mlist[1].email } <br>
	${mlist[1].name } <br>
	
</body>
</html>
