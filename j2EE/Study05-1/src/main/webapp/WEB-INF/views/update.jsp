<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정글 작성</title>
</head>
<body>
<form id=frmupdate method=post action="/modify">
<table>
<tr><td>게시물번호</td><td><input type=text id=lblPost_id name=post_id value=${getpost.post_id} readonly> </td></tr>
<tr><td>제목</td><td><input type=text name=title id=title value= ${getpost.title} > </td></tr>
<tr><td>내용</td><td valign=top><textarea  name=content id=content rows=10 cols=80 > ${getpost.content} </textarea></td></tr>
<tr><td colspan=2 align=right><input type=submit value='등록'>&nbsp; <input type=reset value='비우기'></td></tr>
<tr><td>작성시각</td><td><label> ${getpost.created}</label></td></tr>
<tr><td>수정시각</td><td><label> ${getpost.updated} </label> </td></tr>
</table>
</form>
</body>

</html>