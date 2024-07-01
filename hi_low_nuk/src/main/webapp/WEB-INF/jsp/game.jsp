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
<title>ハイ・ローゲーム</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header>
		<h1 class="center-align">ハイ・ローゲーム</h1>
	</header>
	<main class="center-align">
		<section>
			<p>わたしの考えた数字を当ててください</p>
			<p>1～99のどれかです</p>
			<form action="play" method="post">
				<input type="text" name="user">
				<input type="submit" value="これだ!">
			</form>
		</section>
		<section>
			<% if (game.getUser() != 0) { %>
				<p>あなたの数字: <%= game.getUser() %></p>
				<p><%= game.getResult() %></p>
			<% } %>
		</section>
	</main>
	<footer>
		<small>&copy; 2024 Seiichi Nukayama</small>
	</footer>
</body>
</html>