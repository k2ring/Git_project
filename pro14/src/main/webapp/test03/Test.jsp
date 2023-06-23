<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
        font-family: "굴림체";
    }
</style>
</head>
<body>

	<c:set var="String" value="Hello world"/>
	
	<c:if test="${fn:contains(String, 'world'}">
		<p>Found world<p>	
	</c:if>
	
	<c:if test="${fn:contains(String, 'Hello')}">
		<p>Found Hello<p>	
	</c:if>
	


	<c:forEach begin="2" end="9" var="i">
		<c:forEach begin="1" end="9" var="j">
		
			<c:if test="${i*j >= 10 }">
				${i} * ${j} = ${i * j} &nbsp;&nbsp;
			</c:if>
			
			<c:if test="${i*j < 10 }">
				${i} * ${j} = &nbsp;${i * j} &nbsp;&nbsp;
			</c:if>
			
		</c:forEach>
		<br>
	</c:forEach>
		<hr>
</body>
</html>