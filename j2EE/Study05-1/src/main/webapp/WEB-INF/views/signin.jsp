<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<!--  <form action="/dosignin" id=frmSignin> -->
<table>
<tr>
	<td>로긴아이디</td><td><input type=text name=loginid id=loginid>&nbsp;
	<input type=button id=btnDuplicate value='중복확인'>
		<input type=hidden id=bDuplicate >
	</td></tr>
<tr>
	<td>비밀번호</td><td><input type=password name=passcode id=passcode></td>
</tr>
<tr>
	<td>비밀번호 확인</td><td><input type=password name=passcode1 id=passcode1></td>
</tr>
<tr>
	<td>실명</td><td><input type=text name=name id=name></td>
</tr>
<tr>
	<td>모바일번호</td><td><input type=text name=mobile id=mobile></td>
</tr>
<tr>
	<td align=center colspan=2><input type=submit value="회원가입" id=btnSubmit>
	</td>
</tr>
</table>
<!-- </form> -->
<br><a href='/'>홈으로</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href='/login'>로그인하기</a>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.on('click','#btnDuplicate',function(){
	if($('#loginid').val()=='') return false;
	$.post('/checkDup',{loginid:$('#loginid').val()},function(data){
		if(data=='1'){
			alert('이미 사용중인 아이디입니다.');
		}else{
			alert('사용가능한 아이디입니다.');
			$('#bDuplicate').val('ok');
		}
	},'text');
	return false;
})
.on('click','#btnSubmit',function(){
	if($('#loginid').val()==''||$('#name').val()==''||$('#mobile').val()==''){
		alert('빈값은 허용되지 않습니다');
		return false;
	}
	if($('#bDuplicate').val()!="ok"){
		alert('중복을 확인하십시오');
		return false;
	}
	 if($('#passcode').val()!=$('#passcode1').val()){
		alert('비밀번호와 확인이 일치하지 않습니다.');
		return false;
	}
	 $.post("/dosignin",{loginid:$('#loginid').val(),passcode:$('#passcode').val(),name:$('#name').val(),
		 mobile:$('#mobile').val()},function(data){
			 
			if(data=='ok'){
				document.location='/login';
			}else{
				alert('회원가입 실패');
				$('#loginid,#passcode,#passcode1,#name,#mobile,#bDuplicate').val('');
			}
		},'text');
})
</script>
</html>