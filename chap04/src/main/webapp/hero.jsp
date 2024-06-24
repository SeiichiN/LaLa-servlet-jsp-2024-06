<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="rpg.Hero" %>
<%
Hero h = new Hero("ミナト", 100);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>ヒーローの名前<%= h.getName() %>は、HPは<%= h.getHp() %>です</p>
</body>
</html>