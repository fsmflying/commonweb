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
		loadTreeMenu();
	});

	function loadTreeMenu() {
		$.ajax({
			url : "<%=this.getServletConfig().getServletContext().getContextPath()%>
	/json/getUserTabs",

					success : function(data, textStatus, xhr) {
						if (data["rows"]) {
							alert(data["rows"]);

						}
					}
				});

	}

	function showContent(url, title) {
		if ($('#tt').tabs('exists', title)) {
			$('#tt').tabs('select', title);
		} else {
			var content = '<iframe scrolling="auto" frameborder="0"  src="'
					+ url + '" style="width:100%;height:100%;"></iframe>';
			$('#tt').tabs('add', {
				title : title,
				content : content,
				closable : true
			});
		}
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
			<li><span>用户功能菜单</span>
				<ul>
					<li data-options="state:'closed'"><span>系统管理</span>
						<ul>
							<li><a
								href="javascript:showContent('ui/sysadmin/user/list','用户管理')"><span>用户管理</span></a></li>
							<li><a
								href="javascript:showContent('ui/sysadmin/role/list','角色管理')"><span>角色管理</span></a></li>
							<li><a
								href="javascript:showContent('ui/sysadmin/menu/list','菜单管理')"><span>菜单管理</span></a></li>
							<li><a
								href="javascript:showContent('ui/sysadmin/tab/list','标签管理')"><span>标签管理</span></a></li>
							<li><a
								href="javascript:showContent('ui/sysadmin/company/list','公司管理')"><span>公司管理</span></a></li>
							<li><a
								href="javascript:showContent('ui/sysadmin/company/list','组织机构管理')"><span>组织机构管理</span></a></li>
							<li><a
								href="javascript:showContent('ui/sysadmin/company/list','数据权限管理')"><span>数据权限管理</span></a></li>

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
		style="width: 100px; padding: 10px;">east region</div>
	<div data-options="region:'south',border:false"
		style="height: 50px; background: #A9FACD; padding: 10px;">south
		region</div>
	<!-- 
	<div data-options="region:'center',title:'Center'"></div>
 	-->
	<div id="tt" data-options="region:'center'" class="easyui-tabs"
		style="width: 99%; height: 99%;">
		<div title="我的桌面" style="padding: 10px;"></div>
		<div title="我的通知" data-options="closable:true" style="padding: 10px;">
			Second Tab</div>
		<div title="即时消息" data-options="closable:true" iconCls="icon-reload"
			style="padding: 10px;">Third Tab</div>


	</div>
</body>
</html>