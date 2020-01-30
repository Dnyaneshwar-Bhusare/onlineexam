<%@page import="java.util.List"%>
<%@page import="com.lti.online.exam.Question"%>
<%@page import="com.lti.online.exam.Option"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="calculateScoreServlet" method="get">
	<%
		Question q=(Question) session.getAttribute("currentQs");
	%>
	<h3>Q.<%= (int)session.getAttribute("currentQno") %></h3> <h3> <%= q.getQuestion() %></h3>
	<% List<Option> ops=q.getOption(); %>
	<%
	int opNo=0;
	for (Option op:ops) {
	%>
	<h4>
	<input type="radio" name="option" value="<%= opNo++ %>" > <%= op.getOption()%> <br /></input>
	</h4>
	<%
	}
	%>
	<br />
	<!-- <a href="LoadQuestionServlet">next</a> -->
	<br />
	<input type="button" name="previos" onclick="{<%=session.getAttribute("PreviousQno") %>}" />
	<button type="submit">Submit</button>
	

</form>
</body>
</html>