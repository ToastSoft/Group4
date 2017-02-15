<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.psas.*"%>
<%@page import="java.util.*"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/form/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>" />
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../style/polse.css">
<script type="text/javascript" src="../script/jquery.min.js"></script>
<script type="text/javascript">
	var x = ${alarmInfo};
	var currentPage = 1;
	var btn;
	$(function($) {
		for (var i = 0; i < 5; i++) {
			$("#tab").append(
					"<tr><td></td><td>1</td><td>" + x[i].alarmName
							+ "</td><td>男</td><td>133xxxxxxxx</td>"
							+ "<td>xxx</td>" + "<td>12-2-2</td>"
							+ "<td>李四</td>" + "<td>口述</td>" + "<td>口头警告</td>"
							+ "<td>完</td>" + "<td>王五</td>" + "<td>12-2-2</td>"
							+ "<td>泉水</td>" + "<td>10</td>" + "<td>0</td>"
							+ "<td>0</td>" + "<td>10</td>" + "<td>完</td>"
							+ "<td>王二麻子</td>" + "<td>雨琳</td>" + "<td>22</td>"
							+ "</tr>");
		}
		if (x.length % 5 == 0) {
			btn = x.length / 5;
		} else {
			btn = Math.floor(x.length / 5 + 1);
		}
		$("#byPage").append(
				"<input value='首页' onclick='firstPage();' type='button'>");
		$("#byPage").append(
				"<input value='上一页' onclick='beforePage();' type='button'>");
		for (var i = 0; i < btn; i++) {
			$("#byPage").append(
					"<input value='" + (i + 1)
							+ "' onclick='findByPage(this);' type='button'>");
		}
		$("#byPage").append(
				"<input value='下一页' onclick='afterPage();' type='button'>");
		$("#byPage").append(
		"<input value='尾页' onclick='lastPage();' type='button'>");

	});

	function findByPage(msg) {
		var page = msg.getAttribute("value");
		currentPage = page;
		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > btn) {
			currentPage = btn;
		}
		var start = 1 + (page - 1) * 5;
		var end = 5 * page;
		var str = "";
		for (var i = start - 1; i < end; i++) {
			if (x[i] != undefined) {
				str += "<tr><td></td><td>1</td><td>" + x[i].alarmName
						+ "</td><td>男</td><td>133xxxxxxxx</td>"
						+ "<td>xxx</td>" + "<td>12-2-2</td>" + "<td>李四</td>"
						+ "<td>口述</td>" + "<td>口头警告</td>" + "<td>完</td>"
						+ "<td>王五</td>" + "<td>12-2-2</td>" + "<td>泉水</td>"
						+ "<td>10</td>" + "<td>0</td>" + "<td>0</td>"
						+ "<td>10</td>" + "<td>完</td>" + "<td>王二麻子</td>"
						+ "<td>雨琳</td>" + "<td>22</td>" + "</tr>";
			}

		}
		$("#tab").html(str);
	}

	function beforePage() {
		if (currentPage > 1) {
			currentPage =Number(currentPage)- 1;
		} else {
			currentPage = 1;
		}
		var start = 1 + (currentPage - 1) * 5;
		var end = 5 * currentPage;
		var str = "";
		for (var i = start - 1; i < end; i++) {
			if (x[i] != undefined) {
				str += "<tr><td></td><td>1</td><td>" + x[i].alarmName
						+ "</td><td>男</td><td>133xxxxxxxx</td>"
						+ "<td>xxx</td>" + "<td>12-2-2</td>" + "<td>李四</td>"
						+ "<td>口述</td>" + "<td>口头警告</td>" + "<td>完</td>"
						+ "<td>王五</td>" + "<td>12-2-2</td>" + "<td>泉水</td>"
						+ "<td>10</td>" + "<td>0</td>" + "<td>0</td>"
						+ "<td>10</td>" + "<td>完</td>" + "<td>王二麻子</td>"
						+ "<td>雨琳</td>" + "<td>22</td>" + "</tr>";
			}

		}
		$("#tab").html(str);

	}

	function afterPage() {
		console.log("after:"+currentPage);
		if (currentPage < btn) {
			currentPage = 1+Number(currentPage);
		} else {
			currentPage = Number(btn);
		}
		var start = 1 + (currentPage - 1) * 5;
		var end = 5 * currentPage;
		var str = "";
		for (var i = start - 1; i < end; i++) {
			if (x[i] != undefined) {
				str += "<tr><td></td><td>1</td><td>" + x[i].alarmName
						+ "</td><td>男</td><td>133xxxxxxxx</td>"
						+ "<td>xxx</td>" + "<td>12-2-2</td>" + "<td>李四</td>"
						+ "<td>口述</td>" + "<td>口头警告</td>" + "<td>完</td>"
						+ "<td>王五</td>" + "<td>12-2-2</td>" + "<td>泉水</td>"
						+ "<td>10</td>" + "<td>0</td>" + "<td>0</td>"
						+ "<td>10</td>" + "<td>完</td>" + "<td>王二麻子</td>"
						+ "<td>雨琳</td>" + "<td>22</td>" + "</tr>";
			}

		}
		$("#tab").html(str);
	}
	function firstPage(){
		currentPage=1;
		var start = 1 + (currentPage - 1) * 5;
		var end = 5 * currentPage;
		var str = "";
		for (var i = start - 1; i < end; i++) {
			if (x[i] != undefined) {
				str += "<tr><td></td><td>1</td><td>" + x[i].alarmName
						+ "</td><td>男</td><td>133xxxxxxxx</td>"
						+ "<td>xxx</td>" + "<td>12-2-2</td>" + "<td>李四</td>"
						+ "<td>口述</td>" + "<td>口头警告</td>" + "<td>完</td>"
						+ "<td>王五</td>" + "<td>12-2-2</td>" + "<td>泉水</td>"
						+ "<td>10</td>" + "<td>0</td>" + "<td>0</td>"
						+ "<td>10</td>" + "<td>完</td>" + "<td>王二麻子</td>"
						+ "<td>雨琳</td>" + "<td>22</td>" + "</tr>";
			}

		}
		$("#tab").html(str);
	}
	function lastPage(){
		currentPage=btn;
		var start = 1 + (currentPage - 1) * 5;
		var end = 5 * currentPage;
		var str = "";
		for (var i = start - 1; i < end; i++) {
			if (x[i] != undefined) {
				str += "<tr><td></td><td>1</td><td>" + x[i].alarmName
						+ "</td><td>男</td><td>133xxxxxxxx</td>"
						+ "<td>xxx</td>" + "<td>12-2-2</td>" + "<td>李四</td>"
						+ "<td>口述</td>" + "<td>口头警告</td>" + "<td>完</td>"
						+ "<td>王五</td>" + "<td>12-2-2</td>" + "<td>泉水</td>"
						+ "<td>10</td>" + "<td>0</td>" + "<td>0</td>"
						+ "<td>10</td>" + "<td>完</td>" + "<td>王二麻子</td>"
						+ "<td>雨琳</td>" + "<td>22</td>" + "</tr>";
			}

		}
		$("#tab").html(str);
	}
</script>
</head>
<body>
	<form>
		<div>
			接处警信息编号:<input /> 接警人:<select>
				<option>二狗子</option>
				<option>二狗子</option>
			</select> 报警时间:<input type="date" name="" size="8">
			<button>搜索</button>
			<button>按报警时间排序</button>
		</div>
		<table class="marn_table">
			<thead>
				<tr>
					<th>x</th>
					<th>接处警信息编号</th>
					<th>报警人姓名</th>
					<th>报警人性别</th>
					<th>报警人联系电话</th>
					<th>报警人住址</th>
					<th>报警时间</th>
					<th>接警人</th>
					<th>报警形式</th>
					<th>报警内容</th>
					<th>处警情况</th>
					<th>处警人</th>
					<th>报警时间</th>
					<th>案发地点</th>
					<th>损失(危害)情况</th>
					<th>死人数</th>
					<th>伤人数</th>
					<th>经济损失</th>
					<th>案件处理结果</th>
					<th>值班领导</th>
					<th>报警人单位</th>
					<th>报警人年龄</th>
				</tr>
			</thead>
			<tbody id="tab">

			</tbody>
		</table>
		<div id="byPage"></div>

	</form>
</body>
</html>