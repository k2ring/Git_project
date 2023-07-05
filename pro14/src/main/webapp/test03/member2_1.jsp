<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="sec01.ex01.*, java.util.*" %>
    
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   



<jsp:useBean id="list" class="java.util.ArrayList"></jsp:useBean>
<jsp:useBean id="map" class="java.util.HashMap"></jsp:useBean>

<%

MemberBean member=new MemberBean("son444", "1234","손흥민","dd@d.com");
list.add(member);

MemberBean member2=new MemberBean("ki", "1234","기성용","dddd@d.com");

list.add(member2);

// 리스트 두명 만듦

// 맵 객체에 키 밸류로 저장
map.put("memberList", list);
%>


<c:set var="memberListefwafw" value="${list}"></c:set>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${ memberListefwafw }<br> 
<hr>

${ memberListefwafw[0].id }<br>
${ memberListefwafw[1].id }<br>

<hr>

${map.memberList }<br>
${map.memberList[0].name }<br>
${map.memberList[1].name }<br>
</body>
</html>