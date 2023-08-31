<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<html>
<head>
<title>Home</title>

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
		<!-- Grey with black text -->
		<nav class="navbar navbar-expand-sm bg-light navbar-light">
			<ul class="navbar-nav">
				<li class="nav-item active">
				<a class="nav-link" href="<c:url value='/member/signup'/>">회원가입</a>
				</li>
				<li class="nav-item">
				<c:if test="${user == null}">
				<a class="nav-link" href="<c:url value='/member/login'/>">로그인</a></li>
				</c:if>
				<c:if test="${user != null}">
				<li class="nav-item"><a class="nav-link" href="<c:url value='/member/logout'/>">로그아웃</a></li>
				</c:if>
				<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
				</li>
			</ul>
		</nav>
		<h1>메인홈</h1>
</body>
</html>
