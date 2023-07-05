<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Test Servlet JSP</title>
</head>
<body>
    <ul>
    <% 
        for (int i = 1; i <= 10; i++) {
            out.println("<li>" + i + "</li>");
        }
    %>
    </ul>
</body>
</html>