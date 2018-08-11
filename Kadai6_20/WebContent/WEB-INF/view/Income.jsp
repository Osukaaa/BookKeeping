<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Type"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>収入入力</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
ArrayList<Type> incomeTypeList = (ArrayList<Type>)request.getAttribute("incomeTypeList");
%>

<div class= "Top">
<h1 class="Toptitle">収入</h1>
<form action="/Kadai6_20/" method="post">

<select name="year">
        <option value="2018年">2018年</option>
        <option value="2019年">2019年</option>
        <option value="2020年">2020年</option>
　　　　<option value="2021年">2021年</option>
　　　　<option value="2022年">2022年</option>
</select>

<select name="month">
        <option value="1月">1月</option>
        <option value="2月">2月</option>
        <option value="3月">3月</option>
　　　　<option value="4月">4月</option>
　　　　<option value="5月">5月</option>
　　　　<option value="1月">6月</option>
        <option value="2月">7月</option>
        <option value="3月">8月</option>
　　　　<option value="4月">9月</option>
　　　　<option value="5月">10月</option>
　　　　<option value="1月">11月</option>
        <option value="2月">12月</option>
</select>

<select name="date">
        <option value="1日">1日</option>
        <option value="2日">2日</option>
        <option value="3日">3日</option>
　　　　<option value="4日">4日</option>
　　　　<option value="5日">5日</option>
　　　　<option value="6日">6日</option>
        <option value="7日">7日</option>
        <option value="8日">8日</option>
　　　　<option value="9日">9日</option>
　　　　<option value="10日">10日</option>
　　　　<option value="11日">11日</option>
        <option value="12日">12日</option>
        <option value="13日">13日</option>
　　　　<option value="14日">14日</option>
　　　　<option value="15日">15日</option>
　　　　<option value="16日">16日</option>
        <option value="17日">17日</option>
        <option value="18日">18日</option>
　　　　<option value="19日">19日</option>
　　　　<option value="20日">20日</option>
        <option value="21日">21日</option>
        <option value="22日">22日</option>
        <option value="23日">23日</option>
　　　　<option value="24日">24日</option>
　　　　<option value="25日">25日</option>
　　　　<option value="26日">26日</option>
        <option value="27日">27日</option>
        <option value="28日">28日</option>
　　　　<option value="29日">29日</option>
　　　　<option value="30日">30日</option>
        <option value="31日">31日</option>

</select>


<select name="type">

        <%
			for (Type iTL : incomeTypeList) {
		%>

        <option value="<%= iTL.getTypename() %>"> <%= iTL.getTypename() %> </option>


        <%
        }
        %>

</select>
		<input type="submit" value="入力">
</form>

	<a href="/Kadai6_20/Login">一覧へ</a>
	</div>

</body>
</html>