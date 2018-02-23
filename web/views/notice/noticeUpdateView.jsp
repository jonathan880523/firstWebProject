<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="notice.model.vo.Notice" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%-- <%
	Notice n = (Notice)request.getAttribute("notice");	
%> --%>
	<c:set var="n" value="${notice}" scope="request"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noticeUpdateView</title>
<script type="text/javascript">
	function showFile(){
		
	}
</script>
</head>
<body>
<h1 align="center">${n.noticeNo}<%-- <%= n.getNoticeNo() %> --%>번글 수정 페이지</h1>
<br><br>
<form action="/first/nupdate" method="post" enctype="multipart/form-data">
<input type="hidden" name="no" value="${n.noticeNo}<%-- <%= n.getNoticeNo() %> --%>">
<table align="center" width="600" bgcolor="yellow">	
	<tr><td>제목</td>
	   <td><input type="text" size="50" name="title" value="${n.noticeTitle}<%-- <%= n.getNoticeTitle() %> --%>"></td></tr>
	<tr><td>작성자</td>
	   <td><input type="text" name="writer" readonly value="${n.noticeWriter}<%-- <%= n.getNoticeWriter() %> --%>"></td></tr>
	<tr><td>첨부파일</td>
		<td><%-- <% if(n.getFilePath() == null){ %> --%>			
		<c:if test="${empty n.filePath}">
		<input type="file" name="file">
		<%-- <% }else{ %> --%>
		</c:if>
		<c:if test="${not empty n.filePath}">
		${n.filePath}<%-- <%= n.getFilePath() %> --%> <button onclick="showFile();">변경하기</button><br>
		<div id="addFile">
		<input type="file" name="file">
		</div>
		<%-- <% } %> --%>
		</c:if>
		</td></tr>	
	<tr><td>내용</td>
	   <td><textarea rows="7" cols="50" name="content">
	   	${n.noticeContent}<%-- <%= n.getNoticeContent() %> --%>
	   </textarea></td></tr>
	<tr><td colspan="2" align="center"> 
		<input type="submit" value="수정하기">		
	</td></tr>	
</table>
</form>
<br><br>
<p align="center">
<a href="/first/index.jsp">시작페이지로 이동</a> &nbsp;
<a href="/first/nlist">목록보기로 이동</a>
<a href="javascript:history.go(-1);">이전 페이지로 이동</a>
</p>
</body>
</html>