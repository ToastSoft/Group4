<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>上传表格</title>
<base href="<%=basePath%>" />
<link rel="stylesheet" type="text/css" href="style/easyui.css">
<link rel="stylesheet" type="text/css" href="style/icon.css">
<link rel="stylesheet" type="text/css" href="style/demo.css">
<link rel="stylesheet" type="text/css" href="style/jquery.treeview.css">
<link rel="stylesheet" type="text/css" href="style/polse.css">
<script type="text/javascript" src="script/echarts.min.js"></script>
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/jquery.easyui.min.js"></script>
<script src="script/jquery.js" type="text/javascript"></script>
<script src="script/jquery.cookie.js" type="text/javascript"></script>
<script src="script/jquery.treeview.js" type="text/javascript"></script>
<script language="javascript" type="text/javascript">
	function tiaozhuan(a) {
		console.log(a)
		$("#s").attr("src", a)

	}
</script>
</head>
<body class="Marn_body">
	<div style="width: 1200px; height: 100%; margin: 0px auto;">
		<p style="text-align: right">
			xxx已登录&nbsp;|&nbsp;<a href="#">[退出]</a>
		</p>
		<div style="margin: 100px 0;"></div>
		<div class="easyui-layout" style="height: 900px; width: 100%">
			<div data-options="region:'north'"
				style="height: 50px; text-align: center; background-color: red;"
				class="marn_box">
				<ul>
					<li></li>
					<li><a href="sss.html">案件信息登记</a></li>
					<li><a href="Main.html">案件信息管理</a></li>
					<li><a href="#">权限</a></li>
					<li><a href="#">日志</a></li>
					<li><a href="#">备份/恢复</a></li>
					<li><a href="#">上传/下载</a></li>

				</ul>
			</div>
			<div data-options="region:'south',split:true" style="height: 50px;"></div>

			<div data-options="region:'center',title:'Main Title'">
				<iframe id="s" src="" style="width: 100%; height: 100%;"></iframe>
			</div>
		</div>
	</div>
	<script language="javascript" type="text/javascript">
		$("#tree").treeview({
			collapsed : true
		});
		$("#tree1").treeview({
			collapsed : true
		});
		$("#tree2").treeview({
			collapsed : true
		});
		$("#tree3").treeview({
			collapsed : true
		});
	</script>

</body>
</html>