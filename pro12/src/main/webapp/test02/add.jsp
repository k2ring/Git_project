<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="addException.jsp"%>
    
    

<%

String num=request.getParameter("num");
 int number=Integer.parseInt(num); 

int sum=0;
for(int i=1;i<=number;i++){
	sum=sum + i;
}

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= sum %>


</body>
</html>