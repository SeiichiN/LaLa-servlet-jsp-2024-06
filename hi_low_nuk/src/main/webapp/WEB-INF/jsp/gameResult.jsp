<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.Game" %>
<%
Game game = (Game) session.getAttribute("game");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ハイ・ロー ゲーム</title>
</head>
<body>
	<h1>ハイ・ロー ゲーム結果</h1>
	<p>あなたが入力した数字: <%= game.getUser() %></p>
	<p><%= game.getResult() %></p>
	<% if (game.getCom() == game.getUser()) { %>
		<p><a href="play?retry=new">新しい数字で再チャレンジ</a>
	<% } else { %>
		<p><a href="play?retry=yes">もう一度</a></p>
	<% } %>
	<p><a href="end">終了</a></p>
</body>
</html>