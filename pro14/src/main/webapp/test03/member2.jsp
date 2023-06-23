<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="sec01.ex01.*"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <jsp:useBean id="member" class="sec01.ex01.MemberBean"></jsp:useBean> --%>
<jsp:useBean id="list" class="java.util.ArrayList"></jsp:useBean>
<jsp:useBean id="map" class="java.util.HashMap"></jsp:useBean>

<%
MemberBean member = new MemberBean("son", "1234", "손흥민", "son@korea.com");

list.add(member);

MemberBean member2 = new MemberBean("ki", "1234", "기성용", "ki@korea.com");

list.add(member2);

// 리스트 두명 만듦

// 맵 객체에 키 벨류로 저장
map.put("memberList", list);

%>


<c:set var="memberList" value="${list}"></c:set>

<%-- <c:set var="" value="memberList"></c:set> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${memberList}<Br>
${memberList[0].id}<Br>
${memberList[1].name}<Br>

${map.memberList}<Br>
${map.memberList[0].email}<Br>
${map.memberList[1].id}<Br>
	
</body>
</html>