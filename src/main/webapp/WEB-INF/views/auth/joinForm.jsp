<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>블로그</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css" />
<link rel="stylesheet" href="/css/joinForm.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<h1>회원가입 페이지</h1>
<hr />
<div class="joinForm-container">
<form action="/join" method="POST">
	<input type="text" placeholder = "Username" name="username"/> <br />
	<input type="password" placeholder = "Password" name="password"/> <br />
	<input type="email" placeholder = "Email" name="email"/> <br />
	<button>회원가입</button>
</form>
<span class="already-join">이미 회원가입이 되셨나요? </span><a class ="go-login" href="/loginForm">로그인</a>
</div>

</body>
</html>