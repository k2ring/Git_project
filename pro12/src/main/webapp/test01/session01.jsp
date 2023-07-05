<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"    %>
    
<%

/* String str=(String)session.getAttribute("name"); */

/* session.setAttribute("address", "미금역"); */

/* application.setAttribute("menu", "닭갈비"); */

request.setAttribute("nightMenu", "족발");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hi


<%-- <%=str %> <br>

<% out.print(str); %><hr> --%>

<!-- <a href='/pro12/test01/session02.jsp'>또 이동</a> -->




<%

RequestDispatcher dispatcher= request.getRequestDispatcher("session02.jsp");

dispatcher.forward(request, response);
%>




</body>
</html>