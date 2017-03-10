<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head runat="server">
<title>Login</title>
<script src="js/easyui/jquery.min.js" type="text/javascript"></script>
<script src="js/easyui/jquery.easyui.min.js" type="text/javascript"></script>
<script src="js/easyui/locale/easyui-lang-zh_CN.js" type="text/javascript"></script>

<link href="js/easyui/themes/icon.css" rel="stylesheet" type="text/css" />
<link href="js/easyui/themes/default/easyui.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript">
	$(function() {
		$("#win").window({
			title : "登录",
			width : 300,
			height : 200,
			collapsible : false,
			minimizable : false,
			maximizable : false,
			closable : false,
			closed : false,
			draggable : false,
			resizable : false,
			modal : true
		});
	});
	function login() {
		var name = $("#username").val();
		var psd = $("#password").val();

		$.ajax({
			type : "POST",
			dataType : "json",
			url : "user/login",
			data : {
				Method : "Login"
			},
			success : function(data) {
				$.messager.alert("消息", data, "info");
			},
			error : function() {
				$.messager.alert("消息", "错误！", "info");
			}
		});
	}
</script>
</head>
<body>
	<form id="form1">
		<div id="win" class="easyui-window">
			<table cellpadding="5" style="width:100%;">
				<tr>
					<td style="width:60px;text-align:right;font-size:16px;">用户名:</td>
					<td><input id="username" class="easyui-validatebox textbox" style="height:28px;width:180px;font-size:16px;padding-left:2px;"
						data-options="missingMessage:'请输入用户名,长度为6-26！',required:true,validType:'length[6,26]'"></td>
				</tr>
				<tr>
					<td style="width:60px;text-align:right;font-size:16px;">密&#8195;码:</td>
					<td><input id="password" type="password" class="easyui-validatebox textbox" style="height:28px;width:180px;font-size:16px;"
						data-options="missingMessage:'请输入密码,长度为6-26！',required:true,validType:'length[6,26]'"></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align:center;height:40px;padding-top:10px;">
						<a href="#" class="easyui-linkbutton" style="padding:5px 15px 5px 10px;font-size:16px;" icon="icon-ok">登&#8195;录</a>
						<a href="#" class="easyui-linkbutton" style="padding:5px 15px 5px 10px;font-size:16px;margin-left:20px;" icon="icon-cancel">取&#8195;消</a>
					</td>
				</tr>
			</table>
			<!--  
			<p>用户名: <input type="text"></p>
			<p>密&#8195;码: <input type="password"></p>
			<div style="padding:5px;text-align:center;">
			</div>
			<div>
				<label for="username" style="width: 120px;">用户名:</label> <input
					class="easyui-validatebox" type="text" name="username"
					data-options="required:true" />
			</div>
			<div>
				<label for="password" style="width: 120px;">密&#8195;码:</label> <input
					class="easyui-validatebox" type="password" name="password"
					data-options="validType:'email'" />
			</div>
			<div>
				<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
					onclick="login()">Save</a> <a href="#" class="easyui-linkbutton"
					iconCls="icon-cancel"
					onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
			</div>
			-->
		</div>
	</form>
</body>
</html>