<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
 <%-- <%
 request.setAttribute("id", "hong");
 session.setAttribute("id2", "hong2");
 application.setAttribute("id3", "hong3");
 
 %> --%>
 
 
 
<%--   <%
request.setAttribute("id", "hong");
/* request.setAttribute("id", "hong2");
request.setAttribute("id", "hong3"); */
session.setAttribute("id", "hong2");
application.setAttribute("id", "hong3");
 
 %>   --%>   
 
 
 
  
  <%
request.setAttribute("id", "hong");
session.setAttribute("id2", "hong2");
application.setAttribute("id3", "hong3");
 
 %>  
 
 
  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="member4.jsp"></jsp:forward>

</body>
</html>