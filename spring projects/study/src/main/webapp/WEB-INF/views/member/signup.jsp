<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<title>회원가입</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-light navbar-light">
		<ul class="navbar-nav">
			<a class="nav-link" href="<c:url value='/member/signup'/>">회원가입</a>
			<li class="nav-item"><a class="nav-link" href="<c:url value='/member/login'/>">로그인</a></li>
			<li class="nav-item"><a class="nav-link" href="<c:url value='/'/>">홈으로</a></li>
			<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
			</li>
		</ul>
	</nav>
	<div class="container">
	<h1>회원가입</h1>
	<form action="<c:url value='/member/signup'/>" method="post">
		<div class="form-group">
			<label for="usr">아이디</label> 
			<input type="text"
				class="form-control" name="me_id">
		</div>
		<div class="form-group">
			<label for="pwd">비밀번호</label> 
			<input type="password"
				class="form-control" name="me_pw">
		</div>
				<div class="form-group">
			<label for="pwd">이메일</label> 
			<input type="text"
				class="form-control" name="me_email">
		</div>
		<button class="btn btn-outline-info col-12">회원가입</button>
	</form>
	</div>
</body>
</html>
