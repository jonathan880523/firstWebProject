<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="board.model.vo.*" %>
<%
	Board b = (Board)request.getAttribute("board");
    int currentPage = ((Integer)request.getAttribute("currentPage")).intValue();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardUpdateForm</title>
</head>
<body>
<%@ include file="../../header.jsp" %>
<h1 align="center"><%= b.getBoardNum() %>번 글 수정 페이지</h1>
<br>
<% if(b.getBoardLevel() == 0) { %>
<form action="/first/bupdate" method="post" enctype="multipart/form-data">
<% } else { %>
<form action="/first/brupdate" method="post">
<% } %>
<input type="hidden" name="page" value="<%= currentPage %>">
<input type="hidden" name="bnum" value="<%= b.getBoardNum() %>">
<input type="hidden" name="bwriter" value="<%= member.getId() %>">
<table align="center">
	<tr><td>제목</td><td><input type="text" name="btitle" value="<%=b.getBoardTitle()%>"></td></tr>
	<tr><td>내용</td><td><textarea cols="50" rows="7" name="bcontent"><%= b.getBoardContent() %></textarea></td></tr>
	<% if(b.getBoardLevel() == 0) { %>
	<% if(b.getBoardOriginalFileName() != null) { %>
	<tr><td>첨부파일</td><td><a href="/first/bfdown?ofile=<%= b.getBoardOriginalFileName() %>&rfile=<%= b.getBoardRenameFileName() %>"><%= b.getBoardOriginalFileName() %></a></td></tr>
	<% } %>
	<tr><td>첨부파일</td><td><input type="file" name="upfile"></td></tr>
	<% } %>	
	<tr><td colspan="2" align="center">
	<input type="submit" value="수정하기"> &nbsp; 
	<a href="javascript:history.go(-1);">이전 페이지로</a>
		</td></tr>
</table>
</form>
<h4 align="center"><a href="/first/blist?page=<%= currentPage %>">목록</a></h4>
<%@ include file="../../footer.html" %>
</html>