<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:include page="../common/menubar.jsp"/>
    <table align="center" border="1">
        <tr>
            <td width="100">글번호</td>
            <td width="500">${ b.boardNo }</td>
        </tr>
        <tr>
            <td>제목</td>
            <td>${ b.boardTitle }</td>
        </tr>
        <tr>
            <td>작성자</td>
            <td>${ b.boardWriter }</td>
        </tr>
        <tr>
            <td>조회수</td>
            <td>${ b.count }</td>
        </tr>
        <tr>
            <td>작성일</td>
            <td>${ b.createDate }</td>
        </tr>
        <tr>
            <td>내용</td>
            <td height="100">
                ${ b.boardContent }
            </td>
        </tr>
    </table>

    <br>

    <table align="center" border="1">
        <tr>
            <th width="100">댓글작성</th>
            <th width="400"><textarea name="" id="" cols="30" rows="10" style="resize: none;"></textarea></th>
            <th width="100"><button>등록</button></th>
        </tr>
        <tr>
            <td colspan="3">댓글(${ list.size() })</td>
        </tr>

		<c:forEach var="r" items="${ list }">
        	<tr>
            	<td>${ r.replyWriter }</td>
            	<td>${ r.replyContent } </td>
            	<td>${ r.createDate }</td>
        	</tr>
        </c:forEach>
        
    </table>
</body>
</html>