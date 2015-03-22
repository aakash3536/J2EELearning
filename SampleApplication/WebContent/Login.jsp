<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Hey This is the login Page ... Welcome !!!</h1>
<h2>Please fill in the below form to Login </h2>

<form action="LoginHandlerNew" name="loginForm" method="post">
	
	<table>
		<tr>
			<td>UserName : </td>
			<td></td>
			<td><input type="text" name="userName"></td>
		
		</tr>
		<tr>
			<td>Password : </td>
			<td></td>
			<td><input type="password" name="pwd"></td>
		</tr>
		<tr>
			<td></td>
			<td><button type="submit"> Submit </button> </td>
			<td></td>
		</tr>
	
	</table>

</form>


</body>
</html>