<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>案件信息管理</title>
<base href="<%=basePath%>" />
<link rel="stylesheet" type="text/css" href="style/easyui.css">
<link rel="stylesheet" type="text/css" href="style/icon.css">
<link rel="stylesheet" type="text/css" href="style/demo.css">
<link rel="stylesheet" type="text/css" href="style/jquery.treeview.css">
<link rel="stylesheet" type="text/css" href="style/polse.css">
<script type="text/javascript" src="script/jquery.min.js"></script>
<script type="text/javascript" src="script/jquery.easyui.min.js"></script>
<script src="script/jquery.js" type="text/javascript"></script>
<script src="script/jquery.cookie.js" type="text/javascript"></script>
<script src="script/jquery.treeview.js" type="text/javascript"></script>
<script language="javascript" type="text/javascript">
	function tiaozhuan(msg) {
		console.log(msg);
		//$("#submit").submit();

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
				style="height: 50px; text-align: center; background-color: #0113f1;"
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
			<div data-options="region:'west',split:true" title="信息操作"
				style="width: 150px;">
				<div style="height: 50px; width: 100%;">
					<div class="easyui-accordion" data-options="fit:false,border:false"
						style="width: 100%;">
						<div title="信息管理"
							style="padding: 5px; overflow: scroll; height: 675px">
							<ul id="tree1" class="filetree">
								<li><span class="folder">接处警信息管理</span>
									<ul>
										<li><span class="file"> <a
												href="case_info_manager.do?select=alarm_info">接处警信息</a></span></li>
									</ul></li>
								<li><span class="folder">立案信息管理</span>
									<ul>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/accept_case.html');">接受案件回执单</a></span></li>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/case_notify.html');">立案告知书</a></span></li>
									</ul></li>
								<li><span class="folder">人员信息管理</span>
									<ul>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/illegal_info.html');">案件违法人员信息</a></span></li>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/victim_info.html');">案件受害人员信息</a></span></li>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/suspect_info.html');">犯罪嫌疑人员信息</a></span></li>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/policeman_info.html');">警员信息</a></span></li>
									</ul></li>
								<li><span class="folder">刑事案件管理</span>
									<ul>
										<li><span class="folder">刑事案件处理</span>
											<ul>
												<li><span class="file"><a href="#"
														onclick="tiaozhuan('form/criminal_report.html');">刑事案件调查报告书</a></span></li>
												<li><span class="file"><a href="#"
														onclick="tiaozhuan('form/case_later.html');">未及时破案说明书</a></span></li>
												<li><span class="file"><a href="#"
														onclick="tiaozhuan('form/criminal_info.html');">刑事案件登记信息</a></span></li>
											</ul></li>
									</ul>
									<ul>
										<li><span class="folder">治安案件管理</span>
											<ul>
												<li><span class="file"><a href="#"
														onclick="tiaozhuan('form/security_info.html');">治安案件登记信息</a></span></li>
											</ul></li>
									</ul>
									<ul>
										<li><span class="folder">民事纠纷管理</span>
											<ul>
												<li><span class="file"><a href="#"
														onclick="tiaozhuan('form/civil_dispute.html');">民事纠纷登记信息</a></span></li>
											</ul></li>
									</ul>
									<ul>
										<li><span class="folder">救助服务管理</span>
											<ul>
												<li><span class="file"><a href="#"
														onclick="tiaozhuan('form/help_service.html');">救助服务登记信息</a></span></li>
											</ul></li>
									</ul>
									<ul>
										<li><span class="folder">其他案件管理</span>
											<ul>
												<li><span class="file"><a href="#"
														onclick="tiaozhuan('form/other_case.html');">其他案件登记信息</a></span></li>
											</ul></li>
									</ul></li>
								<li><span class="folder">扣押处罚管理</span>
									<ul>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/fine.html');">追缴、罚没、财物登记信息</a></span></li>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/punishment_info.html');">公安处罚信息</a></span></li>
									</ul></li>
							</ul>

						</div>
						<div title="报表输出"
							style="padding: 5px; overflow: scroll; height: 675px">
							<ul id="tree2" class="filetree">
								<li><span class="folder">...</span>
									<ul>
										<li><span class="file">..</span></li>
									</ul></li>
							</ul>
						</div>
						<div title="信息分析"
							style="padding: 5px; overflow: scroll; height: 675px">
							<ul id="tree3" class="filetree">
								<li><span class="folder">柱状图</span>
									<ul>
										<li><span class="file"><a href="#"
												onclick="tiaozhuan('form/zz.html');">柱状图</a></span></li>
									</ul></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div data-options="region:'center',title:'Main Title'">
				<iframe id="s" src="form/${select }.jsp" style="width:100%;height:100%;"></iframe>
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