<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Human" %>
<%
Human human = (Human) session.getAttribute("human");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= human.getName() %>: <%= human.getAge() %>歳</h1>
	<p><a href="delete">削除</a></p>
</body>
</html>