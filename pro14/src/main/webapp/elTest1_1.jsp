<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

<hr>
${ true and true}<br>
${ true and false}<br>
${ true or false}<br>
${ false or false}<br>
${ not false}<br>



<hr>

${ 1 == 1}<br>
${ 1 != 1}<br>
${ 2 > 1}<br>
${ 2 < 1}<br>

${empty null}

<hr>
${empty ''}


<hr>
${empty ""}



</body>
</html>