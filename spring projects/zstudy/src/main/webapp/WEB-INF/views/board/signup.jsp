<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container-sm pt-5">
	<form action="<c:url value='/member/signup'/>" method="post">
		<div class="form-group">
			<label>아이디</label> <input type="text" class="form-control"
				name="me_id">
		</div>
		<div class="form-group">
			<label>비번</label> <input type="password" class="form-control"
				name="me_pw">
		</div>
		<div class="form-group">
			<label>이메일</label> <input type="email" class="form-control"
				name="me_email">
		</div>
		<button class="btn btn-outline-primary col-12">회원가입</button>
	</form>
	</div>
</body>
</html>