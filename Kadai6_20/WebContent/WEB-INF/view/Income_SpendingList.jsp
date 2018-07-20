<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>収入・支出</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>



<table border="1" width="1000px" >
<tr>

<td>
<h2>収入一覧</h2>
<table border="1" width="500px" overflow-y="auto">
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
</table>
</td>

<td>
<h2>支出一覧</h2>
<table border="1" width="500px">
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
</table>
</td>
</tr>
</table>



<div id="menu" color="#6E6E6E">
<ul>
<li><a href="/Kadai6_20/Income">収入</a></li>
<li><a href="/Kadai6_20/Spending">支出</a></li>
<li><a href="#">検索</a></li>
<li><a href="#">収支合計表示</a></li>
</ul>
</div>


</body>
</html>