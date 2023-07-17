<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-latest.js"></script>

<script>
	$(function() {

		$("#checkJson").click(function() {

			let member = {
				id : "park",
				pwd : "1212",
				name : "박지성",
				email : "jspark@korea.com"
			};

			$.ajax({
				type : "post",
				url : "${contextPath}/member2",
				contentType : "application/json",
				data : JSON.stringify(member),	// JavaScript 값이나 객체를 JSON문자열로 변환
				/* data : member, */
				success : function(data, textStatus) {
				},
				error : function(data, textStatus) {
					alert("에러가 발생했습니다.");
				},
				complete : function(data, textStatus) {
				}
			});	
		});
	});
	
</script>

</head>
<body>
	<!-- dd -->

	<div>
		<input type="button" value="클라이언트에서 서버로 회원 정보 보내기" id="checkJson">
	</div>
	
</body>
</html>