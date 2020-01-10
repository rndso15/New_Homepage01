<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<P> "처음 만든 버튼을 누르셨습니다.</P>
<P> DB 조회 결과 : ${sampleAttribute} </P>

	<div>
        <form action="/sample.bgn" method="post">
            <button onclick="submit">처음 만든 버튼</button>
        </form>
    </div>

</body>
</html>
