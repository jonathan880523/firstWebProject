<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.*, java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
	<%-- <%@ include file="header.jsp"%> --%>
	<c:import url="header.jsp"/>
	<h2>Index Page입니다.</h2>
	<%-- <%@ include file="footer.html"%> --%>
	<c:import url="footer.html"/>
</body>
</html>