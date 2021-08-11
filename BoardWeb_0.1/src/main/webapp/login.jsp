<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="message.user.login.title"></spring:message></title>
</head>
<body>
<center>
	<h1><spring:message code="message.user.login.title"></spring:message></h1>
	<a href="login.do?lang=en">
		<spring:message code="message.user.login.language.en"></spring:message>
	</a>
	<a href="login.do?lang=ko">
		<spring:message code="message.user.login.language.ko"></spring:message>
	</a>
	<hr>
	<form action="login.do" method="post">
		<table border="1" cellpadding="0" cellspacing="0">
			<tr>
				<td bgcolor="orange">아이디</td>
				<td><input type="text" name="id"/></td>
			</tr>
			<tr>
				<td bgcolor="orange">비밀번호</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="로그인"/>
				</td>
			</tr>
		</table>
	</form> 
</center>
</body>
</html>