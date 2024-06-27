<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Uranai" %>
<%
Uranai u = (Uranai)request.getAttribute("uranai");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>今日の運勢</h1>
	<p><%= u.getToday() %>の運勢は <%= u.getLuck() %>です</p>
</body>
</html>