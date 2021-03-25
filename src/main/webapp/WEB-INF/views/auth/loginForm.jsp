<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>블로그</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/style.css" />
<link rel="stylesheet" href="/css/loginForm.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>로그인 페이지</h1>
	<hr />
	<div class="loginForm-container">
		<form action="/login" method="POST">
			<input type="text" placeholder="Username" name="username" />
			<br />
			<input type="password" placeholder="Password" name="password" />
			<br />
			<button>로그인</button>
		</form>
		<div class="go-login-join">
			<span class="none-join">아직 회원가입이 안되셨나요?</span>
			<a href="/joinForm" class="go-join">회원가입</a>
			<br />
			<div class=oauth-login>
				<div class="google">
					<a href="/oauth2/authorization/google">
						<img src="https://img.icons8.com/fluent/48/000000/google-logo.png" /><span>구글 로그인</span>
					</a>
				</div>
				<div class="facebook">
					<a href="/oauth2/authorization/facebook">
						<img src="https://img.icons8.com/color/48/000000/facebook.png" /><span>페이스북 로그인</span>
					</a>
				</div>
				<div class="naver">
					<a href="/oauth2/authorization/naver">
						<img src="/images/naver.png" /><span>네이버 로그인</span>
					</a>
				</div>
				<div class="kakao">
					<a href="/oauth2/authorization/kakao">
						<img src="/images/kakaotalk.png" /><span>카카오 로그인</span>
					</a>
				</div>

			</div>
		</div>

	</div>
</body>
</html>