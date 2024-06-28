<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String errMsg = (String) request.getAttribute("errMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>じゃんけんゲーム</h1>
	<form action="janken" method="post">
		<label><input type="radio" name="hand" value="0">グー</label>
		<label><input type="radio" name="hand" value="1">チョキ</label>
		<label><input type="radio" name="hand" value="2">パー</label><br>
		<input type="submit" value="選択">
	</form>
	<% if (errMsg != null) { %>
		<p style="color:red"><%= errMsg %></p>
	<% } %>
</body>
</html>