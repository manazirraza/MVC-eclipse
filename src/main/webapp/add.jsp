<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>MVC Architecture example.. </h1>
<h2>Add Two numbers</h2>
<form action="add" method="post">

Number1<input type="text" name="num1">
Number2<input type="text" name="num2">
	<input type="submit" ><br>
	
<%
	if(request.getAttribute("result")!=null){
	out.println(request.getAttribute("result"));

	}


%>
	





</form>

</body>
</html>