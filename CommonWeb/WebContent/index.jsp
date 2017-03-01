<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index in CommonWeb </title>
<style type="text/css">
</style>
</head>
<body>
	<h1>CommonWeb</h1>
	<h2>Index</h2>
	<ol>
		<li><a href="testjson/login?username=fangming&password=123456">helloworld</a></li>
		<li><a href="student/add">student/add：随机添加一个Student对象</a></li>
		<li><a href="student/getMax">student/getMax：提取ID最大的Student对象</a></li>
		<li><a href="student/getMin">student/getMin：提取ID最小的Student对象</a></li>
		<li><a href="testjson/user">testjson/user：以Json格式返回一个User对象，不携带密码</a></li>
		<li><a href="testjson/xuser">testjson/xuser：以Json格式返回一个User对象,完全返回</a></li>
		<li><a href="testjson/getStudent?id=1">testjson/getStudent：以Json格式返回[Id=1]的Student对象</a></li>
		<li><a href="testjson/getMaxStudent">testjson/getMaxStudent：以Json格式返回Id最大的Student对象</a></li>
		<li><a href="testjson/getMinStudent">testjson/getMinStudent：以Json格式返回Id最小的Student对象</a></li>
		<li><a href="testjson/getResult/list/student">testjson/getResult/list/{objectType}：以Json格式返回所有{objectType}类型的所有对象,可选的类型有"student","category","supplier","shipper","customer",此处选择"student"</a></li>
		<li><a href="testjson/getResult/list/category">testjson/getResult/list/category：以Json格式返回category对象列表</a></li>
		<li><a href="testjson/getResult/list/customer">testjson/getResult/list/customer：以Json格式返回customer对象列表</a></li>
		<li><a href="testjson/getResult/list/shipper">testjson/getResult/list/shipper：以Json格式返回shipper对象列表</a></li>
		<li><a href="testjson/getResult/list/supplier">testjson/getResult/list/supplier：以Json格式返回supplier对象列表</a></li>
		<li><a href="testjson/getResult/one/student/1">testjson/getResult/one/{objectType}/{id}：以Json格式返回类型为{objectType},id为{id}的对象，可选的类型有"student","category","supplier","shipper","customer",此处选择"student"，id的值为1</a></li>
		<li><a href="testjson/getResult/one/category/1">testjson/getResult/one/category/1：以Json格式返回id为1的category对象</a></li>
		<li><a href="testjson/getResult/one/shipper/1">testjson/getResult/one/shipper/1：以Json格式返回id为1的shipper对象</a></li>
		<li><a href="testjson/getResult/one/supplier/1">testjson/getResult/one/supplier/1：以Json格式返回id为1的supplier对象</a></li>
		<li><a href="testjson/getResult/one/customer/ALFKI">testjson/getResult/one/customer/ALFKI：以Json格式返回id为ALFKI的customer对象</a></li>
	</ol>
</body>
</html>