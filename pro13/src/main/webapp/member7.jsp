<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>

<jsp:useBean id="memberbean" class="sec01.ex01.MemberBean"></jsp:useBean>
<jsp:setProperty property="*" name="memberbean"/>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<table align="center" width="100%">
		<tr align="center" bgcolor="#99ccff">
			<td width="7%">아이디</td>
			<td width="7%">비밀번호</td>
			<td width="5%">이름</td>
			<td width="11%">이메일</td>
			<td width="5%">가입일</td>
		</tr>
		<tr align="center">
		
			<td><jsp:getProperty property="id" name="memberbean"/> </td>
			<td><jsp:getProperty property="pwd" name="memberbean"/> </td>
			<td><jsp:getProperty property="name" name="memberbean"/> </td>
			<td><jsp:getProperty property="email" name="memberbean"/> </td>
		</tr>	
	
	</table>
</body>

</html>