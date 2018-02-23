<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.model.vo.Member" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%
	Member m = (Member)session.getAttribute("member");
	String[] addr = m.getAddress().split(",");
%>  --%>   
	<c:set var="m" value="${member}" scope="session"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보 보기</title>
</head>
<body>
<h1 align="center">${m.name}<%-- <%= m.getName() %> --%>님 정보 보기</h1>
<br>
<center>
<form action="/first/mupdate" method="post">
<table width="600" cellspacing="5" bgcolor="#99ccff">
<tr><td width="150">아이디</td>
<td width="450">
<input type="text" name="userid" value="${m.id}<%-- <%= m.getId() %> --%>" readonly> </td></tr>
<tr><td>이 름</td><td>
<input type="text" name="name" readonly value="${m.name}<%-- <%= m.getName() %> --%>"></td></tr>
<tr><td>암 호</td>
<td><input type="password" name="userpwd" id="userpwd" value="${m.passwd}<%-- <%= m.getPasswd() %> --%>"></td></tr>
<tr><td>암호확인</td><td>
<input type="password" name="userpwd2" id="userpwd2" value="${m.passwd}<%-- <%= m.getPasswd() %> --%>"></td></tr>
<tr><td>성 별</td>

<%-- <% if(m.getGender().equals("M")){ %> --%>
<c:if test="${m.gender eq 'M'}">
<td><input type="radio" name="gender" value="M" checked> 남
<input type="radio" name="gender" value="F"> 여</td>
</c:if>
<%-- <% }else{ %> --%>
<c:if test="${m.gender ne 'M'}">
<td><input type="radio" name="gender" value="M"> 남
<input type="radio" name="gender" value="F" checked> 여</td>
<%-- <% } %> --%>
</c:if>

</tr>
<tr><td>나 이</td>
<td><input type="number" min="20" max="100" name="age" id="age" value="${m.age}<%-- <%= m.getAge() %> --%>"></td></tr>
<tr><td>이메일</td><td>
<input type="email" name="email" value="${m.email}<%-- <%= m.getEmail() %> --%>"></td></tr>
<tr><td>전화번호</td><td>
<input type="tel" name="phone" value="${m.phone}<%-- <%= m.getPhone() %> --%>"></td></tr>


<c:forEach var="addr" items="${m.address}" varStatus="status">
	<c:if test="${status.index eq 0}">
		<tr><td>우편번호</td><td>
		<input type="text" name="post" size="10" value="${addr}<%-- <%= addr[0] %> --%>"></td></tr>
	</c:if>
	<c:if test="${status.index eq 1}">
		<tr><td>기본주소</td><td>
		<input type="text" name="address1" value="${addr}<%-- <%= addr[1] %> --%>"></td></tr>
	</c:if>
		<c:if test="${status.index eq 2}">
		<tr><td>상세주소</td><td>
		<input type="text" name="address2" value="${addr}<%-- <%= addr[2] %> --%>"></td></tr>
	</c:if>
</c:forEach>


<c:url var="mdel" value="/mdelete">
	<c:param name="userid" value="${m.id}"/>
</c:url>


<tr><td colspan="2" align="center">
	<input type="submit" value="수정하기"> &nbsp;
	<a href="${mdel}<%-- /first/mdelete?userid=<%= m.getId() %> --%>">탈퇴하기</a>
	<!-- 쿼리스트링 : 서블릿이름?이름=값&이름=값 -->
</td></tr>
</table>
</form>

<br><br>
<!-- c:url을 사용할 경우 절대 경로를 인식하지 못한다. -->
<c:url var="index" value="/index/jsp"/>
<a href="${index}">시작페이지로 이동</a>
</center>

</body>
</html>