<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String errMsg = (String) request.getAttribute("errMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ハイ・ロー ゲーム</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header>
		<h1 class="center-align">ハイ・ロー ゲーム</h1>
	</header>
	<main class="center-align">
		<section>
			<p>わたしの考えた数字を当ててくださいね。</p>
			<p>1〜99の数字を入力してください</p>
			<form action="play" method="post">
				<input type="text" name="num">
				<input type="submit" value="決定">
			</form>
			<% if (errMsg != null) { %>
				<p style="color:red"><%= errMsg %></p>
			<% } %>
		</section>
	</main>
	<footer>
		<small>&copy; 2024 Seiichi Nukayama</small>
	</footer>
</body>
</html>