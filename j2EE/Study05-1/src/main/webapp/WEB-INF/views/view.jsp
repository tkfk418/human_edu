<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 보기</title>
</head>
<body>

<table border=1 align=center>
<tr><td>제목</td><td><label id=lblTitle> ${getpost.title}</label></td></tr>
<tr><td>내용</td>
	<td valign=top><textarea id=content name=content rows=10 cols=80 readonly>  ${getpost.content}  </textarea></td></tr>
<tr><td>작성자</td>
	<td><label id=lblWriter>${getpost.writer} </label></td></tr>
<tr><td>작성시각</td><td> ${getpost.created}   </td></tr>
<tr><td>수정시각</td><td> ${getpost.updated}   </td></tr>		
<tr><td colspan=2 align=right><a href='/'>목록보기</a></td></tr>
</table>

</body>
</html>