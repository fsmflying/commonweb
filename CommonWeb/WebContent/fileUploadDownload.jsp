<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0px;
	padding: 0px;
}

.box {
	/*width:100%;*/
	margin: 5px 5px;
	border: 2px solid #efefef;
	border-collapse: collapse;
}

.box .title {
	font-size: 16px;
	color: red;
	font-weight: bolder;
}

.box .title .boxSequence {
	color: #800080;
}

.box .formItem {
	margin: 5px;
}

.box .formItem .formItemTitle {
	width: 120px;
	text-align: right;
}
</style>
</head>
<body>
	<h1>spring文件上传下载测试</h1>
	<div class="box">
		<div class="title">
			<span class="boxSequence">01:</span>Spring文件下载
		</div>
		<div>
			<a href="file/download/1" target="_blank">下载id为1的文件</a>
		</div>
	</div>
	<div class="box">
		<div class="title">
			<span class="boxSequence">11:</span>采用流的方式上传文件
		</div>
		<form action="file/upload01" method="post" target="_blank" enctype="multipart/form-data">
			<input type="hidden" name="_method" value="POST" />
			<div class="formItem">
				<label class="formItemTitle" for="file1">file:</label>
				<input type="file" name="file">
			</div>
			<input type="submit" value="提交" />
		</form>
	</div>
	<div class="box">
		<div class="title">
			<span class="boxSequence">12:</span>采用multipart提供的file.transfer方法上传文件
		</div>
		<form action="file/upload02" method="post" target="_blank" enctype="multipart/form-data">
			<input type="hidden" name="_method" value="POST" />
			<div class="formItem">
				<label class="formItemTitle" for="file">file:</label>
				<input type="file" name="file">
			</div>
			<input type="submit" value="提交" />
		</form>
	</div>
	<div class="box">
		<div class="title">
			<span class="boxSequence">13:</span>使用spring mvc提供的类的方法上传文件
		</div>
		<form action="file/upload03" method="post" target="_blank" enctype="multipart/form-data">
			<input type="hidden" name="_method" value="POST" />
			<div class="formItem">
				<label class="formItemTitle" for="file">file:</label>
				<input type="file" name="file">
			</div>
			<input type="submit" value="提交" />
		</form>
	</div>
</body>
</html>