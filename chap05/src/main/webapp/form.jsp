<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録もどき</title>
</head>
<body>
	<h1>ユーザー登録もどき</h1>
	<form action="FormServlet" method="post">
		名前：<input type="text" name="name"><br>
		性別：<input type="radio" name="gender" value="0">男
					<input type="radio" name="gender" value="1">女<br>
					<input type="submit" value="登録">
	</form>
</body>
</html>