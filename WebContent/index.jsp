<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	// 创建GET 方法
	function get() {
		//1.创建xmlHttpRequest对象

		var xmlhttp;
		if (window.XMLHttpRequest) {// code for IE7+, Firefox, Chrome, Opera, Safari
			xmlhttp = new XMLHttpRequest();
		} else {// code for IE6, IE5
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		//2.发送请求
		xmlhttp.open("GET", "AjaxServlet?name=zhangsan&age=18", true);
		xmlhttp.send();

		//3.处理返回请求
		xmlhttp.onreadystatechange = function() {
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
				alert(xmlhttp.responseText);
			}
		}

	}
</script>
<body>

	<h3>
		<a onClick="get()">点击发送一个请求</a>
	</h3>

</body>
</html>