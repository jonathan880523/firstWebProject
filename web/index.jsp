<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.*, java.util.*"%>
<%
	ArrayList<Board> list = (ArrayList<Board>) request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>first</title>
</head>
<body>
	<script src="/first/views/js/jquery-3.2.1.min.js"></script>
	<%@ include file="header.jsp"%>
	<h2>Index Page입니다.</h2>
	<%@ include file="footer.html"%>
</body>
</html>