<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.model.vo.Member" %>    
<%
	Member m = (Member)session.getAttribute("member");
	String[] addr = m.getAddress().split(",");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 정보 보기</title>
</head>
<body>
<h1 align="center"><%= m.getName() %>님 정보 보기</h1>
<br>
<center>
<form action="/first/mupdate" method="post">
<table width="600" cellspacing="5" bgcolor="#99ccff">
<tr><td width="150">아이디</td>
<td width="450">
<input type="text" name="userid" value="<%= m.getId() %>" readonly> </td></tr>
<tr><td>이 름</td><td>
<input type="text" name="name" readonly value="<%= m.getName() %>"></td></tr>
<tr><td>암 호</td>
<td><input type="password" name="userpwd" id="userpwd" value="<%= m.getPasswd() %>"></td></tr>
<tr><td>암호확인</td><td>
<input type="password" name="userpwd2" id="userpwd2" value="<%= m.getPasswd() %>"></td></tr>
<tr><td>성 별</td>

<% if(m.getGender().equals("M")){ %>
<td><input type="radio" name="gender" value="M" checked> 남
<input type="radio" name="gender" value="F"> 여</td>
<% }else{ %>
<td><input type="radio" name="gender" value="M"> 남
<input type="radio" name="gender" value="F" checked> 여</td>
<% } %>

</tr>
<tr><td>나 이</td>
<td><input type="number" min="20" max="100" name="age" id="age" value="<%= m.getAge() %>"></td></tr>
<tr><td>이메일</td><td>
<input type="email" name="email" value="<%= m.getEmail() %>"></td></tr>
<tr><td>전화번호</td><td>
<input type="tel" name="phone" value="<%= m.getPhone() %>"></td></tr>
<tr><td>우편번호</td><td>
<input type="text" name="post" size="10" value="<%= addr[0] %>"></td></tr>
<tr><td>기본주소</td><td>
<input type="text" name="address1" value="<%= addr[1] %>"></td></tr>
<tr><td>상세주소</td><td>
<input type="text" name="address2" value="<%= addr[2] %>"></td></tr>
<tr><td colspan="2" align="center">
	<input type="submit" value="수정하기"> &nbsp;
	<a href="/first/mdelete?userid=<%= m.getId() %>">탈퇴하기</a>
	<!-- 쿼리스트링 : 서블릿이름?이름=값&이름=값 -->
</td></tr>
</table>
</form>

<br><br>
<a href="/first/index.jsp">시작페이지로 이동</a>
</center>

</body>
</html>






