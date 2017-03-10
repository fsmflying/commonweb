<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css"
	href="js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
	<!--<link rel="stylesheet" type="text/css" href="js/easyui/demo.css">-->
	<script type="text/javascript" src="js/easyui/jquery.min.js"></script>
	<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
	<title>桌面:/default.jsp</title>
	<script type="text/javascript">
		$(function() {
			
		});
		
		function loadTreeMenu()
		{
			$.ajax({
				url:"",
				success:function(){
					
				}
			});
			
		}
	
		function showContent(item) {
			
		}
	</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false"
		style="height: 80px; background: #B3DFDA; padding: 10px">
		<span style="font-size: 18px; font-weight: bold;">CommonWeb项目</span>:用于演示Java
		Web开发相关的示例;
	</div>
	<div data-options="region:'west',split:true,title:'West'"
		style="width: 200px; padding: 10px;">


		<ul id="easyui-tree" class="easyui-tree">
			<li><span>My Documents</span>
				<ul>
					<li data-options="state:'closed'"><span>Photos</span>
						<ul>
							<li><span>Friend</span></li>
							<li><span>Wife</span></li>
							<li><span>Company</span></li>
						</ul></li>
					<li><span>Program Files</span>
						<ul>
							<li>Intel</li>
							<li>Java</li>
							<li>Microsoft Office</li>
							<li>Games</li>
						</ul></li>
					<li>index.html</li>
					<li>about.html</li>
					<li>welcome.html</li>
				</ul></li>
		</ul>

	</div>
	<div
		data-options="region:'east',split:true,collapsed:true,title:'East'"
		style="width: 100px; padding: 10px;">
		
		
		east region
		
		</div>
	<div data-options="region:'south',border:false"
		style="height: 50px; background: #A9FACD; padding: 10px;">
		
		south region
		
		</div>
	<div data-options="region:'center',title:'Center'"></div>
</body>
</html>