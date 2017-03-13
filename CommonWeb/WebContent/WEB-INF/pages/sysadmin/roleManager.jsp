<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<script
	src="<%=this.getServletConfig().getServletContext().getContextPath()%>/js/easyui/jquery.min.js"
	type="text/javascript"></script>
<script
	src="<%=this.getServletConfig().getServletContext().getContextPath()%>/js/easyui/jquery.easyui.min.js"
	type="text/javascript"></script>
<script
	src="<%=this.getServletConfig().getServletContext().getContextPath()%>/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>

<link
	href="<%=this.getServletConfig().getServletContext().getContextPath()%>/js/easyui/themes/icon.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=this.getServletConfig().getServletContext().getContextPath()%>/js/easyui/themes/default/easyui.css"
	rel="stylesheet" type="text/css" />

<script type="text/javascript">
	$(function() {
		$('#tt')
				.datagrid(
						{
							title : '角色管理',
							iconCls : 'icon-edit',
							width : 660,
							height : 250,
							singleSelect : true,
							idField : 'itemid',
							url : '<%=this.getServletConfig().getServletContext().getContextPath()%>/testjson/getResult/list/sysrole',
							columns : [ [
									{
										field : 'roleId',
										title : '角色Id',
										width : 60
									},
									{
										field : 'roleName',
										title : '角色名称',
										width : 100,
										formatter : function(value) {
											for (var i = 0; i < products.length; i++) {
												if (products[i].productid == value)
													return products[i].name;
											}
											return value;
										}/*,
										editor : {
											type : 'combobox',
											options : {
												valueField : 'productid',
												textField : 'name',
												data : products,
												required : true
											}
										}*/
									},
									{
										field : 'keyCode',
										title : '角色编码',
										width : 80,
										align : 'right',
										editor : {
											type : 'numberbox',
											options : {
												precision : 1
											}
										}
									},
									{
										field : 'memo',
										title : '说明',
									
										editor : 'text'
									}] ],
							onBeforeEdit : function(index, row) {
								row.editing = true;
								updateActions(index);
							},
							onAfterEdit : function(index, row) {
								row.editing = false;
								updateActions(index);
							},
							onCancelEdit : function(index, row) {
								row.editing = false;
								updateActions(index);
							}
						});
	});
	function updateActions(index) {
		$('#tt').datagrid('updateRow', {
			index : index,
			row : {}
		});
	}
</script>
</head>
<body>
	<div id="tt" style="width:100%;height:100%;"></div>
</body>
</html>