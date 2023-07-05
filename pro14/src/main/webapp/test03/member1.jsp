<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    


<%-- <c:set var="id" value="hong" ></c:set>

<c:set var="num" value="${8}" ></c:set>

<c:set var="str" value="${'hi'}" ></c:set>
<c:set var="str2" value='${"hi2"}' ></c:set>
<c:set var="fsdf" value='${num}' ></c:set>
 --%>
 
<%-- <c:set var="memberForm" value="http://localhost:8090/pro14/test03/memberForm.html"></c:set> --%>

<c:set var="contextPath" value="${pageContext.request.contextPath}"></c:set> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- ${id}<br>
${num}<br>
${str}<br>
${str2}<br>
${fsdf}<br> --%>

${pageContext.request.contextPath}

<a href="${contextPath}/test03/memberForm.html"> 회원가입하기3 </a><br>
<a href="${contextPath}/test03/memberForm.jsp"> 회원가입하기 JSP </a>
</body>
</html>
