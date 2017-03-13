<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index in CommonWeb </title>
<style type="text/css">
.actionlist li{
	margin:5px;
}
.actionlist li a{
	text-decoration:none;
}
</style>
</head>
<body>
	<h1>CommonWeb</h1>
	<h2>Index</h2>
	<ol class="actionlist">
		<li><a href="ui/user/login" target="_blank">登录</a></li>
		<li><a href="user/logout" target="_blank">登出</a></li>
		<li><a href="ui/sysadmin/user/add" target="_blank">添加用户</a></li>
		<li><a href="default.jsp" target="_blank">EasyUI桌面</a></li>
		<li><a href="fileUploadDownload.jsp" target="_blank">文件的上传下载测试</a></li>
		<li><a href="test.jsp" target="_blank">测试特定功能,比如序号生成器</a></li>
		<li><a href="testjson/login?username=fangming&password=123456" target="_blank">testjson/login:正确账号登录</a></li>
		<li><a href="testjson/login?username=fangming&password=123" target="_blank">testjson/login:错误账号登录</a></li>
		<li><a href="student/add" target="_blank">student/add：随机添加一个Student对象</a></li>
		<li><a href="student/getMax" target="_blank">student/getMax：提取ID最大的Student对象</a></li>
		<li><a href="student/getMin" target="_blank">student/getMin：提取ID最小的Student对象</a></li>
		<li><a href="testjson/user" target="_blank">testjson/user：以Json格式返回一个User对象，不携带密码</a></li>
		<li><a href="testjson/xuser" target="_blank">testjson/xuser：以Json格式返回一个User对象,完全返回</a></li>
		<li><a href="testjson/getStudent?id=1" target="_blank">testjson/getStudent：以Json格式返回[Id=1]的Student对象</a></li>
		<li><a href="testjson/getMaxStudent" target="_blank">testjson/getMaxStudent：以Json格式返回Id最大的Student对象</a></li>
		<li><a href="testjson/getMinStudent" target="_blank">testjson/getMinStudent：以Json格式返回Id最小的Student对象</a></li>
		<li><a href="testjson/getResult/list/student" target="_blank">testjson/getResult/list/{objectType}：以Json格式返回所有{objectType}类型的所有对象,可选的类型有"student","category","supplier","shipper","customer",此处选择"student"</a></li>
		<li><a href="testjson/getResult/list/category" target="_blank">testjson/getResult/list/category：以Json格式返回category对象列表</a></li>
		<li><a href="testjson/getResult/list/customer" target="_blank">testjson/getResult/list/customer：以Json格式返回customer对象列表</a></li>
		<li><a href="testjson/getResult/list/shipper" target="_blank">testjson/getResult/list/shipper：以Json格式返回shipper对象列表</a></li>
		<li><a href="testjson/getResult/list/supplier" target="_blank">testjson/getResult/list/supplier：以Json格式返回supplier对象列表</a></li>
		<li><a href="testjson/getResult/one/student/1" target="_blank">testjson/getResult/one/{objectType}/{id}：以Json格式返回类型为{objectType},id为{id}的对象，可选的类型有"student","category","supplier","shipper","customer",此处选择"student"，id的值为1</a></li>
		<li><a href="testjson/getResult/one/category/1" target="_blank">testjson/getResult/one/category/1：以Json格式返回id为1的category对象</a></li>
		<li><a href="testjson/getResult/one/shipper/1" target="_blank">testjson/getResult/one/shipper/1：以Json格式返回id为1的shipper对象</a></li>
		<li><a href="testjson/getResult/one/supplier/1" target="_blank">testjson/getResult/one/supplier/1：以Json格式返回id为1的supplier对象</a></li>
		<li><a href="testjson/getResult/one/customer/ALFKI" target="_blank">testjson/getResult/one/customer/ALFKI：以Json格式返回id为ALFKI的customer对象</a></li>
		<li><a href="trans/order/add" target="_blank">事务测试:/trans/order/add,没有错误!</a></li>
		<li><a href="trans/order/addWithOrderError" target="_blank">事务测试:/trans/order/addWithOrderError,Order错误!</a></li>
		<li><a href="trans/order/addWithDetailError" target="_blank">事务测试:/trans/order/addWithDetailError,OrderDetail错误!</a></li>
		<li><a href="trans/order/addByTrans" target="_blank">事务测试:/trans/order/addByTrans,没有错误!</a></li>
		<li><a href="trans/order/addWithOrderErrorByTrans" target="_blank">事务测试:/trans/order/addWithOrderErrorByTrans,Order错误!</a></li>
		<li><a href="trans/order/addWithDetailErrorByTrans" target="_blank">事务测试:/trans/order/addWithDetailErrorByTrans,OrderDetail错误!</a></li>
	</ol>
</body>
</html>