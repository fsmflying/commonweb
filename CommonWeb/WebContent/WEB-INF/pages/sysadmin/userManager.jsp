<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link
	href="<%=this.getServletConfig().getServletContext()
					.getContextPath()%>/js/easyui/themes/icon.css"
	rel="stylesheet" type="text/css" />
<link
	href="<%=this.getServletConfig().getServletContext()
					.getContextPath()%>/js/easyui/themes/default/easyui.css"
	rel="stylesheet" type="text/css" />
<script
	src="<%=this.getServletConfig().getServletContext()
					.getContextPath()%>/js/easyui/jquery.min.js"
	type="text/javascript"></script>
<script
	src="<%=this.getServletConfig().getServletContext()
					.getContextPath()%>/js/easyui/jquery.easyui.min.js"
	type="text/javascript"></script>
<script
	src="<%=this.getServletConfig().getServletContext()
					.getContextPath()%>/js/easyui/locale/easyui-lang-zh_CN.js"
	type="text/javascript"></script>
<script type="text/javascript">

	$(function(){
		
	});
	
	function myDateFormatter(date)
	{
		if(date)
		{
			date = new Date(date);
			var y = date.getFullYear();  
            var m = date.getMonth()+1;  
            var d = date.getDate();  
            return y+'-'+(m<10?('0'+m):m)+'-'+(d<10?('0'+d):d); 
			//return date.
		}
		//alert(date);
		return "";
		//return 
	}
	
	function myDateParser(s)
	{
		alert(s);
		if(!s) return new Date();
		return new Date(s);
	}
</script>

</head>
<body>
	
	<table id="dg" class="easyui-datagrid" title="用户信息管理" style="width:100%;height:auto"
			data-options="
				iconCls: 'icon-edit',
				singleSelect: true,
				toolbar: '#tb',
				url: '<%=this.getServletConfig().getServletContext().getContextPath()%>/testjson/getResult/list/sysuser',
				method: 'get',
				onClickRow: onClickRow
			">
		<thead>
			<tr>
				<th data-options="field:'userId',width:80">用户Id</th>
				<th data-options="field:'username',width:80,align:'right'">用户名</th>
				<th data-options="field:'nickname',width:80,align:'right',editor:{type:'numberbox',options:{precision:1}}">昵称</th>
				<th data-options="field:'lastLoginTime',width:100,formatter:myDateFormatter,parser:myDateParser">最后登录时间</th>
				<th data-options="field:'registerTime',width:100,formatter:myDateFormatter,parser:myDateParser">注册时间</th>
				<th data-options="field:'status',width:120,editor:{
						formatter:function(value,row){
							if(value==0) return '正常';
							return '未知';
						},
						editor:{
							type:'combobox',
							options:{
								valueField:'itemValue',
								textField:'itemName',
								method:'get',
								url:'<%=this.getServletConfig().getServletContext().getContextPath()%>/json/sysadmin/dictitem/userStatus',
								required:true
							}
						}
				
				
				}">用户状态</th>
				<th data-options="field:'disabledTime',width:100,formatter:myDateFormatter,parser:myDateParser">开始禁用时间</th>
			</tr>
		</thead>
	</table>
 
	<div id="tb" style="height:auto">
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true" onclick="append()">添加</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-remove',plain:true" onclick="removeit()">删除</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-save',plain:true" onclick="accept()">保存</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-undo',plain:true" onclick="reject()">撤消</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search',plain:true" onclick="getChanges()">GetChanges</a>
	</div>
	
	<script type="text/javascript">
		var editIndex = undefined;
		function endEditing(){
			if (editIndex == undefined){return true}
			if ($('#dg').datagrid('validateRow', editIndex)){
				var ed = $('#dg').datagrid('getEditor', {index:editIndex,field:'productid'});
				var productname = $(ed.target).combobox('getText');
				$('#dg').datagrid('getRows')[editIndex]['productname'] = productname;
				$('#dg').datagrid('endEdit', editIndex);
				editIndex = undefined;
				return true;
			} else {
				return false;
			}
		}
		function onClickRow(index){
			if (editIndex != index){
				if (endEditing()){
					$('#dg').datagrid('selectRow', index)
							.datagrid('beginEdit', index);
					editIndex = index;
				} else {
					$('#dg').datagrid('selectRow', editIndex);
				}
			}
		}
		function append(){
			if (endEditing()){
				$('#dg').datagrid('appendRow',{status:'P'});
				editIndex = $('#dg').datagrid('getRows').length-1;
				$('#dg').datagrid('selectRow', editIndex)
						.datagrid('beginEdit', editIndex);
			}
		}
		function removeit(){
			if (editIndex == undefined){return}
			$('#dg').datagrid('cancelEdit', editIndex)
					.datagrid('deleteRow', editIndex);
			editIndex = undefined;
		}
		function accept(){
			if (endEditing()){
				$('#dg').datagrid('acceptChanges');
			}
		}
		function reject(){
			$('#dg').datagrid('rejectChanges');
			editIndex = undefined;
		}
		function getChanges(){
			var rows = $('#dg').datagrid('getChanges');
			alert(rows.length+' rows are changed!');
		}
	</script>
</body>
</html>