<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试特定的功能</title>
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
			<span class="boxSequence">01:</span>生成序列号
		</div>
		<div>
			<a href="test/getNextSequence" target="_blank">生成默认序列的下一个序列号</a>
		</div>
	</div>
	<div class="box">
		<div class="title">
			<span class="boxSequence">02:</span>生成指定名称序列的下一个序列号
		</div>
		<form action="test/getNextSequence" method="post" target="_blank">
			<input type="hidden" name="_method" value="POST" />
			<div class="formItem">
				<label class="formItemTitle" for="keyname1">键名称:</label>
				<input type="text" name="keyname" id="keyname1" value="default"/>
				<input type="button" onclick="javascript:document.getElementById('keyname1').value='default';'" value="默认值"/>
			</div>
			<div class="formItem">
				<label class="formItemTitle" for="increment1">增量:</label>
				<input type="text" name="increment" id="increment1" value="1"/>
				<input type="button" onclick="javascript:document.getElementById('increment1').value='1';'" value="默认值"/>
			</div>
			<input type="submit" value="提交" />
		</form>
	</div>
	<div class="box">
		<div class="title">
			<span class="boxSequence">02:</span>生成指定名称序列的多个序列号
		</div>
		<form action="test/getNextSequences" method="post" target="_blank">
			<input type="hidden" name="_method" value="POST" />
			<div class="formItem">
				<label class="formItemTitle" for="generateCount1">生成数量:</label>
				<input type="text" name="generateCount" id="generateCount1" value="5"/>
				<input type="button" onclick="javascript:document.getElementById('keyname1').value='5';'" value="默认值"/>
			</div>
			<div class="formItem">
				<label class="formItemTitle" for="keyname1">键名称:</label>
				<input type="text" name="keyname" id="keyname1" value="default"/>
				<input type="button" onclick="javascript:document.getElementById('keyname1').value='default';'" value="默认值"/>
			</div>
			<div class="formItem">
				<label class="formItemTitle" for="increment1">增量:</label>
				<input type="text" name="increment" id="increment1" value="1"/>
				<input type="button" onclick="javascript:document.getElementById('increment1').value='1';'" value="默认值"/>
			</div>
			<input type="submit" value="提交" />
		</form>
	</div>
</body>
</html>