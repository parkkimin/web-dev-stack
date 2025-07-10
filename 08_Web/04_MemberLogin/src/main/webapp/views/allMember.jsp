
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% request.getAttribute("list"); %>
<h1>전체 회원 정보</h1>
	<%
	List<Member> list = (List<Member>) request.getAttribute("list");
	%>
	<table>
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
			<th>나이</th>
		</tr>
		<% for (Member member : list) { %>
		<tr>
		<td><%=member.getId()%></td>
		<td><%=member.getPwd()%></td>
		<td><%=member.getName()%></td>
		<td><%=member.getAge()%></td>
		</tr>
		<% } %>
</body>
</html>