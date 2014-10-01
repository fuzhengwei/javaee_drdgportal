<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/view/res_head.jsp"%>
<html>
	<head>
		<title></title>
		<%@ include file="/view/res_easyui.jsp"%>
	</head>

	<body>
		<table id="dg" class="easyui-datagrid"
			style="width: 100%; h" url="#"
			toolbar="#toolbar" pagination="true" rownumbers="true"
			fitColumns="true" singleSelect="true" data-options="panelHeight:'auto'">
			<thead>
				<tr>
					<th field="pgName" align="center">
						权限组名称
					</th>
				</tr>
			</thead>
		</table>
	</body>
</html>
