<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>

<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	DB 확인을 위한 페이지 
</h1>

	<P>"처음 만든 버튼을 누르셨습니다.</P>
	<P>DB 조회 결과 : ${sampleAttribute}</P>
	
	<hr>

	<h2>=== 회원 목록 ===</h2>
	<table border="1" width="700px">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
		</tr>
		<c:forEach var="sample" items="${sample2}">
			<tr>
				<td>${sample.getMain_Id()}</td>
				<td>${sample.getMain_Password()}</td>
			</tr>
		</c:forEach>
	</table>
	
	<div>
		<form action="/sample.bgn" method="post">
			<button onclick="submit">처음 만든 버튼</button>
		</form>
	</div>

</body>
</html>
