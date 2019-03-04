<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":"
+ request.getServerPort() + request.getContextPath() + "/";

	%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="<%=basePath%>/static/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="<%=basePath%>/static/js/JsonHandler.js"></script>
<body>	
	<center>
	<form id="form1" action =javascript:void(0) method="post">
		<table border="1px" width="500px">
			<tr>
				<td>账号</td>
				<td><input type="text" name="nick" placeholder="请输入6-12位字符"></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="text" name="password" placeholder="请输入6-16位字符"></td>
			
			</tr>
			<tr>
				<td>手机号</td>
				<td><input type="text" name="phone" placeholder="请输入11位有效数字"></td>
			
			</tr>
			<tr>
				<td>邮箱</td>
				<td><input type="text" name="email" placeholder="请输入有效的电子邮箱"></td>
			</tr>
			<tr>
				<td>年龄</td>
				<td><input type="text" name="age" placeholder="请输入一个正整数"></td>
			</tr>
			<tr>
				<td><input type ="submit" value="注册"></td>
			</tr>
			<tr>
				<td><input type ="submit" value="重置"></td>
			</tr>
			<tr>
				<td><input type ="submit" value="添加账号"></td>
			</tr>
		</table>
		</form>
	</center>
	<script>
		$(function(){
			$("input[type=submit]").click(function(){
				var jsonData = $("#form1").serializeObject();
				$.ajax({
					url:"<%=basePath%>/getQQInfo.do",
					type:"POST",
					dataType:"json",
					data:jsonData,
					success:function(result){
						alert(result);
					}
				});
			});
			
			
		});
	
	</script>
</body>
</html>