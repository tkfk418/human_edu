<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Information</title>
</head>
<body>
로긴아이디: ${log}<br> 
비밀번호: ${pw}<br>
이름: ${nm}<br> 
모바일번호: ${mob}<br><br>
<input type=button value="확인"  id=btnOk>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>$(document)
.on('click','#btnOk',function(){
	document.location="/login";
})
</script>

</html>