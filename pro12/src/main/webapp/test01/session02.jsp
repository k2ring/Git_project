<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%-- <%

/* String name=(String)session.getAttribute("name");
String address=(String)session.getAttribute("address"); */


/* String menu=(String)application.getAttribute("menu"); */

/* String nightMenu= (String)request.getAttribute("nightMenu"); */

%> --%>

<%
String nightMenu= (String)request.getAttribute("nightMenu");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
nice
<%-- <%=name %> <br>
<%=address %> <br> --%>

<%=nightMenu %> 


<%-- <% out.print(nightMenu); %> --%>

</body>
</html>