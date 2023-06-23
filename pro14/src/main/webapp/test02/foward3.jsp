<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*"%>

<%

List<MemberBean> mlist = new ArrayList<MemberBean>();

MemberBean member1 = new MemberBean("lee", " 1234", "이순신", "lee@test.com");
MemberBean member2 = new MemberBean("son", " 1234", "손흥민", "son@test.com");

mlist.add(member1);
mlist.add(member2);


request.setAttribute("mlist", mlist);

%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%-- <%= mlist %> <br> --%>


	<%= mlist.get(0) %> <br>
	<%= mlist.get(0).getName() %> <br>
	
	
	<%-- ${mlist} <br> --%>
	
<jsp:forward page="member3.jsp"></jsp:forward>






</body>
</html>