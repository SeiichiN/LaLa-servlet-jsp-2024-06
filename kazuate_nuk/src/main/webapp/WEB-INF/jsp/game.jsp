<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String result = (String) request.getAttribute("result");
String errMsg = (String) request.getAttribute("errMsg");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>数当てゲーム</title>
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<header>
		<h1 class="center-align">数当てゲーム</h1>
	</header>
	<main class="center-align">
		<section>
			<p>わたしの考えた数字を当ててください</p>
			<p>1～99の数字です</p>
			<form action="play" method="post">
				<input type="text" name="user">
				<input type="submit" value="これだ">
			</form>
		</section>
		<section>
			<% if (result != null) { %>
				<p><%= result %></p>
			<% } %>
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