<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
		<title>Basic CRUD Application - jQuery EasyUI CRUD Demo</title>
		<link rel="stylesheet" type="text/css" href="view/res/jquery-easyui-1.4/themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="view/res/jquery-easyui-1.4/themes/icon.css">
		<link rel="stylesheet" type="text/css" href="view/res/jquery-easyui-1.4/themes/color.css">
		<link rel="stylesheet" type="text/css" href="view/res/jquery-easyui-1.4/demo/demo.css">
		<script type="text/javascript" src="view/res/scripts/lib/jquery.min.js"></script>
		<script type="text/javascript" src="view/res/jquery-easyui-1.4/jquery.easyui.min.js"></script>
	</head>
	<body>
		<table id="dg" title="My Users" class="easyui-datagrid"
			style="width: 700px; height: 250px" url="emp/doGetEmpList.do"
			toolbar="#toolbar" pagination="true" rownumbers="true"
			fitColumns="true" singleSelect="true">
			<thead>
				<tr>
					<th field="empName" width="50" align="center">
						雇员姓名
					</th>
					<th field="empPwd" width="50" align="center">
						登录密码
					</th>
					<th field="empPower" width="50" align="center">
						管理权限
					</th>
					<th field="empDate" width="50" align="center">
						创建日期
					</th>
					<th field="empState" width="50" align="center">
						使用状态
					</th>
				</tr>
			</thead>
		</table>
		<div id="toolbar">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-add" plain="true" onclick= newUser();>New User</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-edit" plain="true" onclick=editUser();>Edit User</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
			    iconCls="icon-remove" plain="true" onclick=destroyUser();>Remove User</a>
		</div>
		<div id="dlg" class="easyui-dialog"
			style="width: 400px; height: 280px; padding: 10px 20px" closed="true"
			buttons="#dlg-buttons">
			<div class="ftitle">
				雇员信息
			</div>
			<form id="fm" method="post" novalidate>
				<div class="fitem">
					<label>
						雇员ID:
					</label>
					<input name="empId" class="easyui-textbox" required="true" data-options="editable:false">
				</div>
				<div class="fitem">
					<label>
						雇员姓名:
					</label>
					<input name="empName" class="easyui-textbox" required="true">
				</div>
				<div class="fitem">
					<label>
						登录密码:
					</label>
					<input name="empPwd" type="password" class="easyui-textbox" required="true">
				</div>
				<div class="fitem">
					<label>
						管理权限:
					</label>
					<select class="easyui-combobox" id="empPower" name="empPower" style="width: 90px;" data-options="editable:false,required:true,panelHeight:'auto'">
						<option value="0" selected="selected">管理员</option>
						<option value="1">普通雇员</option>
					</select>
				</div>
				<div class="fitem">
					<label>
						使用状态:
					</label>
					<select class="easyui-combobox" id="empState" name="empState" style="width: 90px;" data-options="editable:false,required:true,panelHeight:'auto'">
						<option value="0" >开启</option>
						<option value="1" selected="selected">关闭</option>
					</select>
				</div>
			</form>
		</div>
		<div id="dlg-buttons">
			<a href="javascript:void(0)" class="easyui-linkbutton c6"
				iconCls="icon-ok" onclick="saveUser()";style="width: 90px">Save</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel" onclick="javascript: $('#dlg').dialog('close')";style="width: 90px">Cancel</a>
		</div>
<script type="text/javascript">

	var url;
	function newUser() {
		$('#dlg').dialog('open').dialog('setTitle', 'New User');
		$('#fm').form('clear');
		$("#empState").combobox("setValue","1");
		$("#empPower").combobox("setValue","1");		
		url = 'emp/doSaveEmp.do';
	}
	function editUser() {
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$('#dlg').dialog('open').dialog('setTitle', 'Edit User');
			$('#fm').form('load', row);
			url = 'emp/doUpdateEmp.do';
		}
	}
	function saveUser() {
		$('#fm').form('submit', {
			url : url,
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(result) {
				var result = eval('(' + result + ')');
				if (result.errorMsg) {
					$.messager.show( {
						title : 'Error',
						msg : result.errorMsg
					});
				} else {
					$('#dlg').dialog('close'); // close the dialog
				    $('#dg').datagrid('reload'); // reload the user data
		}
	}
		});
	}
	function destroyUser() {
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$.messager.confirm('Confirm',
					'Are you sure you want to destroy this user?', function(r) {
						if (r) {
							$.post('emp/doDeleteEmpById.do', {
								empId : row.empId
							}, function(result) {
								if (result.success) {
									$('#dg').datagrid('reload'); // reload the user data
								} else {
									$.messager.show( { // show error message
												title : 'Error',
												msg : result.errorMsg
											});
								}
							}, 'json');
						}
					});
		}
	}
</script>
		<style type="text/css">
#fm {
	margin: 0;
	padding: 10px 30px;
}

.ftitle {
	font-size: 14px;
	font-weight: bold;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}

.fitem {
	margin-bottom: 5px;
}

.fitem label {
	display: inline-block;
	width: 80px;
}

.fitem input {
	width: 160px;
}
</style>
	</body>
</html>