<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sec01.ex01.*, java.util.*" %>
    
    
<%

List<MemberBean>  mlistrwrw = new ArrayList<MemberBean>();

MemberBean member1 = new MemberBean("lee", " 1234", "이순신", "lee@test.com");
MemberBean member2 = new MemberBean("son", " 1234", "손흥민", "son@test.com");

mlistrwrw.add(member1);
mlistrwrw.add(member2);


request.setAttribute("mlist4543", mlistrwrw);

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <%= mlist %><br>

<%= mlist.get(0) %> <br>
<%= mlist.get(0).getName() %> <br> --%>

<%-- ${ mlist} --%>

<%-- ${mlist[0].id} --%>

<jsp:forward page="member3.jsp"></jsp:forward> 

</body>
</html>