<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="notice.model.vo.Notice, member.model.vo.Member" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%-- <%
	Notice notice = (Notice)request.getAttribute("notice");
	String fileName = null;
	if(notice.getFilePath() != null){
		fileName = notice.getFilePath()
			.substring(notice.getFilePath().lastIndexOf("/") + 1);
	}
	
	Member member = (Member)session.getAttribute("member");
%> --%>
<c:set var="notice" value="${notice}" scope="request"/>
<c:set var="filePath" value="${notice.filePath}" scope="page"/>
<c:set var="member" value="${member}" scope="session"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noticeDetailView</title>
</head>
<body>
<h1 align="center">${notice.noticeNo}<%-- <%= notice.getNoticeNo() %> --%>번글 상세 보기</h1>
<br><br>
<table align="center">
	<tr><td>번호</td><td>${notice.noticeNo}<%-- <%= notice.getNoticeNo() %> --%></td></tr>
	<tr><td>제목</td><td>${notice.noticeTitle}<%-- <%= notice.getNoticeTitle() %> --%></td></tr>
	<tr><td>작성자</td><td>${notice.noticeWriter}<%-- <%= notice.getNoticeWriter() %> --%></td></tr>
	<tr><td>올린날짜</td><td>${notice.noticeDate}<%-- <%= notice.getNoticeDate() %> --%></td></tr>
	<%-- <% if(fileName != null){ %> --%>
	<c:if test="${not empty filepath}">
	<tr><td>첨부파일</td>
		<td>
		<a href="/first/nfdown?path=${filePath}">
		${filePath}</a>
		</td></tr>
	</c:if>
	<%-- <% } %> --%>
	<tr><td>내용</td><td>${notice.noticeContent}<%-- <%= notice.getNoticeContent() %> --%></td></tr>
	<%-- <% if(member.getId().equals(notice.getNoticeWriter()) == true){ %>	 --%>
	<c:if test="${member.id eq notice.noticeWriter}">
	<tr><td colspan="2" align="center"> 
	<a href="/first/nupview?no=${notice.noticeNo}<%-- <%= notice.getNoticeNo() %> --%>">수정페이지로 이동</a> &nbsp; &nbsp;
	<a href="/first/ndelete?no=${notice.noticeNo}<%-- <%= notice.getNoticeNo() %> --%>">삭제하기</a>
	<!-- 
	<button onclick="location.href='/first/ndelete?no=<%-- <%= notice.getNoticeNo() %> --%>'">삭제</button>
	-->
	</td></tr>
	</c:if>
	<%-- <% } %> --%>
</table>
<br><br>
<p align="center">
<a href="/first/index.jsp">시작페이지로 이동</a> &nbsp; &nbsp;
<a href="/first/nlist">목록보기로 이동</a>
</p>
</body>
</html>





