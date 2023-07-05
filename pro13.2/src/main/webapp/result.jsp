<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


	<%
	String msg = "<h1>아이디를 입력해주세요. </h1>";
	String userID = request.getParameter("userID");

	if (userID == null || userID.length() == 0) {
	%>

	<jsp:forward page="result2.jsp">
		<jsp:param value="<%=msg %>" name="msg" />
	</jsp:forward>

<%
}
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=userID%> ㅎㅇ
</body>
</html>