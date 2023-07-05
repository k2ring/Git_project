<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 	<c:if test="true">
		nice
	</c:if>
	
	<hr>
	<c:if test="false">
		nicejskdl
	</c:if>
	 --%>
	<%-- 	<c:if test="true">참</c:if> --%>
	<%-- <c:otherwise>거짓</c:otherwise> --%>

	<hr>

	<%-- <c:choose>
		<c:when test="false">참임</c:when>
		<c:otherwise>거짓임</c:otherwise>
	</c:choose> --%>




	<c:forEach begin="1" end="10" var="i">
		${i}<br>
	</c:forEach>

	<hr>


	<c:forEach begin="1" end="10" var="i" step="2">
		${i}<br>
	</c:forEach>

	<hr>


	<c:forEach begin="10" end="20" var="i" varStatus="dsfaf">
		${i} : ${dsfaf.index} <br>
	</c:forEach>


	<hr>

	<c:forEach begin="10" end="20" var="i" varStatus="dsfaf">
		${i} : ${dsfaf.count} <br>
	</c:forEach>


	<hr>
	<c:forEach begin="10" end="20" var="i" varStatus="dsfaf">
		${i} : ${dsfaf.first} <br>
	</c:forEach>




	<hr>
	<c:forEach begin="10" end="20" var="i" varStatus="dsfaf">
		${i} : ${dsfaf.last} <br>
	</c:forEach>



	<hr>

	<c:set var="tot" value="0"></c:set>

	<c:forEach begin="1" end="10" var="i">
		${ tot=tot+i}<br>
	</c:forEach>
	<hr>
	최종값 : ${tot}



	<hr>
	<c:forEach begin="2" end="9" var="i">
		<c:forEach begin="1" end="9" var="j">
		${i}*${j}=${i * j} &nbsp;&nbsp;&nbsp;&nbsp;
		</c:forEach>
		<br>
	</c:forEach>


	













</body>
</html>