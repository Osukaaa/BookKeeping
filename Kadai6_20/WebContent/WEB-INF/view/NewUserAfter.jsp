<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import ="dto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録完了</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
     request.setCharacterEncoding("UTF-8");
     User user = (User)request.getAttribute("User");
    %>
<h2>以下の情報で登録しました</h2>
        登録ユーザID:<%=user.getUserid()%><br>
		登録ユーザパスワード:<%=user.getUserpass()%><br>
		登録ユーザ名:<%=user.getUsername()%><br>

<a href="/Kadai6_20/Top">ログイン画面へ戻る</a>
</body>
</html>