<%@page import="java.util.List"%>
<%@page import="com.springbook.biz.board.impl.BoardDAO"%>
<%@page import="com.springbook.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	// 세션에 저장된 글 목록을 꺼낸다.
// 	List<BoardVO> boardList = (List) session.getAttribute("boardList");
	List<BoardVO> boardList = (List) request.getAttribute("boardList");
%>
<html>
<head>
<meta charset="UTF-8">
<titl>글 목록</title>
</head>
<body>
<center>
<h1>글 목록</h1>
<h3>이정기님 환영합니다.<a href="login.do">Log-out</a></h3>

<!-- 검색 시작 -->
<form action="getBoardList.do" method="post">
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr align="rigth">
			<select name="searchCondition">
				<option value="TITLE">제목
				<option value="CONTENT">내
			</select>
			<input name="searchKeyword" type="text"/>
			<input type="submit" value="검색"/>
		</tr>
	</table>
</form>
<!--검색 종료 -->

<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<td bgcolor="orange" width="100">번호</td>
		<td bgcolor="orange" width="200">제목</td>
		<td bgcolor="orange" width="150">작성자</td>
		<td bgcolor="orange" width="150">등록일</td>
		<td bgcolor="orange" width="100">조회수</td>
	</tr>
	
	<% for(BoardVO board : boardList) { %>
	<tr>
		<td><%=board.getSeq() %></td>
		<td align="left"><a href="getBoard.do?seq=<%=board.getSeq()%>"><%=board.getTitle() %></a></td>
		<td><%=board.getWriter() %></td>
		<td><%=board.getRegDate() %></td>
		<td><%=board.getCnt() %></td>
	</tr>
	<% } %>
</table>
<br>
<a href="insertBoard.jsp">새글 등록</a>
</center>
</body>
</html>