<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">

//Ajax 代码
	function checkUsername() {
		//取到输入框里的值
		var name = document.getElementById("name").value;
		//定义Ajax 变量
		var xmlhttp;
		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
		//Ajax post 请求 格式， 请求的url, 异步
		xmlhttp.open("POST", "CheckUsernameServlet", true);
		// post请求特有的一句话
		xmlhttp.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");
		//向服务器发送参数
		xmlhttp.send("name=" + name);
		// Ajax 接收服务器返回参数
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				document.getElementById("span01").innerHTML = xmlhttp.responseText;
			}
		}
	}
</script>

<body>
	<table border="1" width="500">
		<tr>
			<td>用户名：</td>
			<!-- 测试表格，只要光标移走，便知道数据库是否有数据 -->
			<td><input type="text" id="name" onblur="checkUsername()"></td>
			<td width="200"><span id="span01"></span></td>

		</tr>
		<td>密码：</td>
		<td><input type="text"></td>
		<td></td>

		</tr>
		<td>邮箱：</td>
		<td><input type="text"></td>
		<td></td>

		</tr>

	</table>
</body>
</html>