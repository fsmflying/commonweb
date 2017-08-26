<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>字典目录管理</title>
	<link rel="stylesheet" type="text/css"
	href="<%=this.getServletContext().getContextPath()%>/js/easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css"
	href="<%=this.getServletContext().getContextPath()%>/js/easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css"
	href="<%=this.getServletContext().getContextPath()%>/js/easyui/themes/color.css">
	<script type="text/javascript"
	src="<%=this.getServletContext().getContextPath()%>/js/easyui/jquery.min.js"></script>
	<script type="text/javascript"
	src="<%=this.getServletContext().getContextPath()%>/js/easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript"
	src="<%=this.getServletContext().getContextPath()%>/js/easyui/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript">
		$(function(){
			/*
			$("#dg").datagrid('load',{
				pageSize:10,
				pageIndex:1
			});
			*/
			$('#dg').datagrid({
			    url:'<%=this.getServletContext().getContextPath()%>/sys/list?otype=dictdir',
			    columns:[[
			        {field:'dirName',title:'目录名称',width:100},
			        {field:'keyCode',title:'唯一标识',width:100},
			        {field:'memo',title:'备注',width:100,align:'right'},
			        {field:'dbCreateTime',title:'创建时间',width:100,align:'right'}
			    ]]
			});
			$(window).resize(function() {
			  alert("window.resize");
			});
		});
	</script>
</head>
<body>
	<table id="dg" title="字典目录管理" class="easyui-datagrid" style="width:95%;height:390px;"
            url="get_users.php"
            toolbar="#toolbar" pagination="true"
            rownumbers="true" fitColumns="true" singleSelect="true">
        <thead>
            <tr>
                <th field="dirName" width="50">目录名称</th>
                <th field="keyCode" width="50">目录唯一编码</th>
                <th field="memo" width="50">说明</th>
                <th field="dbCreateTime" width="50">创建时间</th>
            </tr>
        </thead>
    </table>
    <div id="toolbar">
    	<div style="margin-bottom:5px">
        	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newModel()">添加</a>
        	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editModel()">编辑</a>
        	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyModel()">删除</a>
     	</div>
     	<div>
			Date From: <input class="easyui-datebox" style="width:80px">
			To: <input class="easyui-datebox" style="width:80px">
			Language: 
			<select class="easyui-combobox" panelHeight="auto" style="width:100px">
				<option value="java">Java</option>
				<option value="c">C</option>
				<option value="basic">Basic</option>
				<option value="perl">Perl</option>
				<option value="python">Python</option>
			</select>
			<a href="#" class="easyui-linkbutton" iconCls="icon-search">Search</a>
		</div>
    </div>
    
    <div id="dlg" class="easyui-dialog" style="width:400px"
            closed="true" buttons="#dlg-buttons">
        <form id="fm" method="post" novalidate style="margin:0;padding:20px 50px">
            <div style="margin-bottom:20px;font-size:14px;border-bottom:1px solid #ccc">[字典目录]信息</div>
            <div style="margin-bottom:10px">
                <input name="dirName" class="easyui-textbox" required="true" label="目录名称:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="keyCode" class="easyui-textbox" required="true" label="唯一编码:" style="width:100%">
            </div>
            <div style="margin-bottom:10px">
                <input name="memo" class="easyui-textbox" required="true" label="说明信息:" style="width:100%">
            </div>
            <!--  
            <div style="margin-bottom:10px">
                <input name="" class="easyui-textbox" required="true" validType="email" label="Email:" style="width:100%">
            </div>
            -->
        </form>
    </div>
    <div id="dlg-buttons">
        <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="saveModel()" style="width:90px">保 存</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')" style="width:90px">取 消</a>
    </div>
    <script type="text/javascript">
        var url;
        function newModel(){
            $('#dlg').dialog('open').dialog('center').dialog('setTitle','添加字典目录');
            $('#fm').form('clear');
            url = 'save_user.php';
        }
        function editModel(){
            var row = $('#dg').datagrid('getSelected');
            if (row){
                $('#dlg').dialog('open').dialog('center').dialog('setTitle','编辑字典目录');
                $('#fm').form('load',row);
                url = 'update_user.php?id='+row.id;
            }
        }
        function saveModel(){
            $('#fm').form('submit',{
                url: url,
                onSubmit: function(){
                    return $(this).form('validate');
                },
                success: function(result){
                    var result = eval('('+result+')');
                    if (result.errorMsg){
                        $.messager.show({
                            title: 'Error',
                            msg: result.errorMsg
                        });
                    } else {
                        $('#dlg').dialog('close');        // close the dialog
                        $('#dg').datagrid('reload');    // reload the user data
                    }
                }
            });
        }
        function destroyModel(){
            var row = $('#dg').datagrid('getSelected');
            if (row){
                $.messager.confirm('确认','您确定要删除此字典目录吗？',function(r){
                    if (r){
                        $.post('destroy_user.php',{id:row.id},function(result){
                            if (result.success){
                                $('#dg').datagrid('reload');    // reload the user data
                            } else {
                                $.messager.show({    // show error message
                                    title: 'Error',
                                    msg: result.errorMsg
                                });
                            }
                        },'json');
                    }
                });
            }
        }
        
        function queryModels(){
        	
        }
    </script>
</body>
</html>