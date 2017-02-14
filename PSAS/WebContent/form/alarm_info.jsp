<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Document</title>
<link rel="stylesheet" type="text/css" href="../style/polse.css">
<script src="../script/jquery.min.js"></script>
<script type="text/javascript">
	$(function($) {
		$.ajax({
			url : "getAlarmInfo.do",
			type : "post",
			dataType:"json",
			success : function(data) {
				console.log(data);
				console.log(data.length)
				for(var i=0;i<data.length;i++){
					$("#tab").append("<tr><td></td><td>1</td><td>"+data[i].alarmName+"</td><td>男</td><td>133xxxxxxxx</td>"
							+"<td>xxx</td>"
							+"<td>12-2-2</td>"
							+"<td>李四</td>"
							+"<td>口述</td>"
							+"<td>口头警告</td>"
							+"<td>完</td>"
							+"<td>王五</td>"
							+"<td>12-2-2</td>"
							+"<td>泉水</td>"
							+"<td>10</td>"
							+"<td>0</td>"
							+"<td>0</td>"
							+"<td>10</td>"
							+"<td>完</td>"
							+"<td>王二麻子</td>"
							+"<td>雨琳</td>"
							+"<td>22</td>"
						+"</tr>");
				}
			}
		});
	});
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
		<table class="marn_table" id="tab">
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
			<tr>
				<td></td>
				<td>1</td>
				<td>张三</td>
				<td>男</td>
				<td>133xxxxxxxx</td>
				<td>xxx</td>
				<td>12-2-2</td>
				<td>李四</td>
				<td>口述</td>
				<td>口头警告</td>
				<td>完</td>
				<td>王五</td>
				<td>12-2-2</td>
				<td>泉水</td>
				<td>10</td>
				<td>0</td>
				<td>0</td>
				<td>10</td>
				<td>完</td>
				<td>王二麻子</td>
				<td>雨琳</td>
				<td>22</td>
			</tr>
		</table>
	</form>
</body>
</html>