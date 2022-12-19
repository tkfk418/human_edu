<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>

<table>
<tr>
<td>아이디</td><td><input type=text  id=userid></td>
</tr>
<tr>
<td>비밀번호</td><td><input type=password id=passcode></td>
</tr>
<tr>
<td colspan=2 align=center><input type=button value='로그인' id=btnGo></td>
</tr>
</table>

<br><br><br><a href='/'>홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp; <a href='/signin'>회원가입</a>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnGo',function(){
	if($('#userid').val()==''||$('#passcode').val()==''){
		alert('아이디와 비밀번호는 반드시 입력하십시오');
		return false;
	} 
	$.post('/checkuser',{userid:$('#userid').val(),passcode:$('#passcode').val()},function(data){
		console.log(data);
				if(data=='ok'){
					document.location="/";
				}else{
					// document.location='/login';
						alert('로긴 실패. 아이디와 비밀번호를 정확히 입력하시오.');
					$('#userid,#passcode').val('');
				}
			},'text');
		return true;
	
})
</script>
</html>