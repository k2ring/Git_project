
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


${5+7-3} <br>

${hi} <br>

${"hi"} <br>
${'hi2'} <br>
${"'hi3'"} <br>
<%-- ${'"hi4"'} <br> --%>

<%-- 
${"hi" + "nice"} <br> 	<!-- 문자열끼리는 더할 수 없다 -->
--%>	

<%-- ${null + 10} <br> --%>		<!-- null이 0으로 처리되어 연산됨 -->

<%-- 
${"good" + 4} <br>		<%-- 문자열+숫자 오류처리 -->
--%>
 
 ${10 + "1"} <br>		<!-- 숫자가 먼저 나온경우 뒤의 숫자형 문자열은 숫자로 형변환 -->
 

<hr>
${true && true} <br>
${true && false} <br>
${true || true} <br>
${false || false} <br>

<hr>
${true and true} <br>
${true and false} <br>
${true or true} <br>
${false or false} <br>
${not false} <br>

<hr>
${1 == 1} <br>
${1 != 1} <br>
${2 > 1} <br>
${2 < 1} <br>

<hr>
${1 eq 1} <br>
<%-- ${1 ne 1} <br>
${"he" ne "he"} <br> --%>
${2 gt 1} <br>
${2 lt 1} <br>

<hr>
${empty null} <br>
<hr>
${empty ''} <br>
<hr>
${empty ""} <br>
<hr>
${empty 0} <br>


<hr>
${ true ? "hi" : "bye" }
${ false ? "hi" : "bye" }



</body>
</html>