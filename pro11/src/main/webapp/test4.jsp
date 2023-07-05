<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%! 
/* String name=null; */

/*
String getName(){
	return name;
} 
*/


/* int age2=0; */
%>

<% 

String name=request.getParameter("fdjksd");
String age=request.getParameter("age");
/* age2=Integer.parseInt(age) +  10; */
%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <%= getName() %> --%>

<%-- <%= name %><br> --%>
<%    out.print(name); %> <br>  


<%-- <%=  age2 %> --%>
<%=  Integer.parseInt(age) +  10 %> 
</body>
</html>