<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,notice.model.vo.Notice,member.model.vo.Member" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%-- <%
	ArrayList<Notice> list = (ArrayList<Notice>)request.getAttribute("list");
	//Member member = (Member)session.getAttribute("member");
%> --%>
	<c:set var="list" value="${list}" scope="request"/>
<!DOCTYPE>
<html>
<head>
<meta charset="UTF-8">
<title>noticeListView</title>
<script type="text/javascript">
	function show(){
		location.href = "/first/views/notice/noticeWriteForm.jsp";
	}
</script>

</head>
<body>
<%-- <%@ include file="../../header.jsp" %> --%>
<c:import url="../../header.jsp"/>
<br style="clear:both;">
<h1 align="center">공지글 목록 보기</h1>
<br><br>
<div align="center" style="background:#99ccff;height:50px;padding-top:15px;clear:both;">
<form action="nsearch" method="post">
검색할 제목을 입력하세요 : 
<input type="search" name="keyword" size="50"> &nbsp; 
<input type="submit" value="제목 검색">
</form>
</div><br>
<%-- <% if(member != null){ %> --%>
<c:if test="${not empty member}">
	<div align="center">
	<button onclick="show();">글쓰기</button> 
	</div>
</c:if>
<%-- <% } %> --%>
<br style="clear:both;">
<table align="center" width="600" border="1" cellspacing="0" style="clear:right;">
<tr bgcolor="#99ccff"><th>번호</th><th>제목</th><th>작성자</th>
<th>올린날짜</th><th>첨부파일</th></tr>
<%-- <%
	for(Notice n : list){
%> --%>
<c:forEach var="n" items="${list}" varStatus="status">
<tr><td align="center">${n.noticeNo}<%-- <%= n.getNoticeNo() %> --%></td>
	<td>
	<%-- <% if(member != null){ %> --%>
	<c:if test="${not empty member}">
	<c:url var="ndetail" value="/ndetail"/>
		<c:param name="noticeNo" value="${n.noticeNo}"/>
		<a href="${ndetail}<%-- /first/ndetail?no=<%= n.getNoticeNo() %> --%>">
		${n.noticeTitle}<%-- <%= n.getNoticeTitle() %> --%></a>
	</c:if>
	<%-- <% }else{ %> --%>
	<c:if test="${empty member}">
		${n.noticeTitle}<%-- <%= n.getNoticeTitle() %> --%>
	<%-- <% } %> --%>
	</c:if>
	</td>
	<td align="center">${n.noticeWriter}<%-- <%= n.getNoticeWriter() %> --%></td>
	<td align="center">${n.noticeDate}<%-- <%= n.getNoticeDate() %> --%></td>
	<td align="center">
	<c:if test="${not empty n.filePath}"><%-- <% if(n.getFilePath() != null){ %> --%>
		◎
	<%-- <% }else{ %> --%>
	</c:if>
	<c:if test="${empty n.filePath}">
		&nbsp;
	<%-- <% } %> --%>
	</c:if>
	</td></tr>
<%-- <% } %> --%>
</c:forEach>
</table>
<p align="center">
<a href="/first/index.jsp">시작페이지로 이동</a> &nbsp;
<a href="/first/nlist">목록 전체 보기</a>
</p>
<br><br><br><br><br><br><br><br>
<c:import url="/footer.html"/>
</body>
</html>







