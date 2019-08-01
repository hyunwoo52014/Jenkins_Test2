<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ page import = "main.HelloWorld" %>
<%@ page import = "main.Calcurator" %>

<%
	HelloWorld hc = new HelloWorld();
	Calcurator cu = new Calcurator();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf8">
<title>Insert title here</title>
</head>
<body>
<%System.out.println(hc.getHello()); %><br>
ADD : 10+10 = <%cu.add(10, 10); %> <br>
SUB : 20-10 = <%cu.sub(20, 10); %> <br>
MUL : 10*10 = <%cu.mul(10, 10); %> <br>
DIV : 10/2  = <%cu.div(10, 2); %> <br>
</body>
</html>