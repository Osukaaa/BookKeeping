<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規登録</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<div class="Top">
	<h1>新規ユーザを登録</h1>
	<form action="/Kadai6_20/NewUser" method="post">
		登録ユーザID:<input type="text" name="id"><br>
		登録ユーザパスワード:<input type="password" name="pass"><br>
		登録ユーザ名:<input type="text" name="name"><br>
			<input type="submit"value="登録">
	</form>

	<a href="/Kadai6_20/Top">ログイン画面へ戻る</a>
</div>
</body>
</html>