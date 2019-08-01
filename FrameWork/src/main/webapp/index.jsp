<%-- <%@page import="main.HelloWorld"%>
<%@page import="main.Calcurator"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%!
	HelloWorld he = new HelloWorld();
	Calcurator cal = new Calcurator();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2><br>
<h3><% System.out.print(he.getHello()); %></h3>
덧셈 10+10 = <%cal.add(10, 10); %> <br>
뺄셈 20-7 = <%cal.sub(20, 7); %> <br>
나눗셈 10/10 = <%cal.div(10, 10); %> <br>
곱셈 10*10 = <%cal.mul(10, 10); %> <br>
</body>
</html> --%>

<html>
<head>
</head>
<body>
<h2>Hello World</h2>
</body>
</html>