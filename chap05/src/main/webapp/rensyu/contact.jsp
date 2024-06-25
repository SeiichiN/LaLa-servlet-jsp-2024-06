<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/chap05/testenq" method="post">
		名前：<input type="text" name="name"><br>
		お問い合わせの種類：
		  <select name="qtype">
		  	<option value="" selected>選択してください</option>
		  	<option value="company">会社について</option>
		  	<option value="product">製品について</option>
		  	<option value="support">アフターサポートについて</option>
		  </select><br>
		 お問い合わせ内容：<br>
		 <textarea name="body" rows="6" cols="40"></textarea><br>
		 <input type="submit" value="送信">
	</form>
</body>
</html>