<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Janken" %>
<%
Janken j = (Janken)request.getAttribute("janken");
String[] hands = {"グー", "チョキ", "パー"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>じゃんけん結果</h1>
	<p>あなた：<%= hands[j.getUser()] %> 
		わたし：<%= hands[j.getCom()] %>
	</p>
	<p><%= j.getResult() %></p>
	<p><a href="janken">もう一度する</a></p>
</body>
</html>