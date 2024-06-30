<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ハイ・ロー ゲーム</title>
</head>
<body>
	<h1>ハイ・ロー ゲーム</h1>
	<p>わたしの考えた数字を当ててくださいね。</p>
	<p>1〜99の数字を入力してください</p>
	<form action="play" method="post">
		<input type="text" name="num">
		<input type="submit" value="決定">
	</form>
</body>
</html>