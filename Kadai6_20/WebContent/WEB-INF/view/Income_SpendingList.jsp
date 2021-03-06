<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="dto.Income_Spending"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>収入・支出</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
<%
     request.setCharacterEncoding("UTF-8");
     ArrayList<Income_Spending> incomeList = (ArrayList<Income_Spending>)request.getAttribute("incomeList");
     ArrayList<Income_Spending> spendingList = (ArrayList<Income_Spending>)request.getAttribute("spendingList");
%>


<table border="1" width="1000px" >
<tr>

<td>
<h2>収入一覧</h2>
<table border="1" width="500px">

<tr>
<th>収支</th>
<th>日付</th>
<th>種類</th>
<th>金額</th>
<th>削除</th>
</tr>


        <%
			for (Income_Spending il : incomeList) {
		%>
		<tr>
<td><%=il.getIncome_spending_kind() %></td>
<td><%=il.getDate() %></td>
<td><%=il.getIncome_spending_type() %></td>
<td><%=il.getMoney() %></td>
<td>
<form action="/Kadai6_20/Delete" method="post">
			<%int a = il.getIncome_spending_id(); %>
			<input type="hidden" name="Income_spending_id" value="<%= a %>" >
			<input type="submit" value="×">
</form>
</td>
</tr>
        <%
        }
        %>

</table>
</td>

<td>
<h2>支出一覧</h2>
<table border="1" width="500px">

<tr>
<th>収支</th>
<th>日付</th>
<th>種類</th>
<th>金額</th>
<th>削除</th>
</tr>

<%
			for (Income_Spending sl : spendingList) {
		%>
		<tr>
<td><%=sl.getIncome_spending_kind() %></td>
<td><%=sl.getDate() %></td>
<td><%=sl.getIncome_spending_type() %></td>
<td><%=sl.getMoney() %></td>
<td>
<form action="/Kadai6_20/Delete" method="post">
			<%int a = sl.getIncome_spending_id(); %>
			<input type="hidden" name="Income_spending_id" value="<%= a %>" >
			<input type="submit" value="×">
</form>
</td>
</tr>
        <%
        }
        %>
</table>
</td>
</tr>
</table>



<div id="menu" color="#6E6E6E">
<ul>
<li><a href="/Kadai6_20/Income">収入</a></li>
<li><a href="/Kadai6_20/Spending">支出</a></li>
</ul>
</div>


</body>
</html>