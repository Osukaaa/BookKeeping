<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">

</head>
<body>
<div class= "Top">
<h1 class="Toptitle">家計簿システム</h1>
<form action="/Kadai6_20/Login" method="post">

		ID:<input type="text" name="id" class = "idtext" placeholder="ID"><br>
		パスワード:<input type="password" name="pass" class = "passtext" placeholder="パスワード"><br>
		<input type="submit" value="ログイン">
</form>

	<a href="/Kadai6_20/NewUser">新規登録</a>
	</div>
</body>
</html>