<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
<form method="get" action="/checkuser" id= frmLogin>
<table>
<tr>
<td>아이디</td><td><input type=text name=userid id=userid></td>
</tr>
<tr>
<td>비밀번호</td><td><input type=password name=passcode id=passcode></td>
</tr>
<tr>
<td colspan=2 align=center><input type=submit value='로그인'></td>
</tr>
</table>
</form>
<br><br><br><a href='/'>홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href='/signin'>회원가입</a>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('submit','#frmLogin',function(){
	if($('#userid').val()==''||$('#passcode').val()==''){
		alert('아이디와 비밀번호는 반드시 입력하십시오');
		return false;
	} 
		return true;
	
})
</script>
</html>