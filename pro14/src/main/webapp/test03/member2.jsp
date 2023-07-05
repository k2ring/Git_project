<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="sec01.ex01.*, java.util.*" %>
    
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   


<jsp:useBean id="map" class="java.util.HashMap"></jsp:useBean>

<%
// 맵 객체에 키 밸류로 저장
map.put("id", "kdjsfkls");
map.put("pw", "dfs");
map.put("name", "홍");
map.put("gender", "male");
%>

<%-- 
<c:set var="memberListefwafw" value="${list}"></c:set> --%>

<c:set var="fsdfsdf" value="${map}"></c:set>
<c:remove var="fsdfsdf"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- ${ memberListefwafw }<br> 
<hr>

${ memberListefwafw[0].id }<br>
${ memberListefwafw[1].id }<br>

<hr>

${map.memberList }<br>
${map.memberList[0].name }<br>
${map.memberList[1].name }<br> --%>
${map}<br>
${map.name}<br>
<hr>
${fsdfsdf }<br>
${fsdfsdf.gender }


</body>
</html>
