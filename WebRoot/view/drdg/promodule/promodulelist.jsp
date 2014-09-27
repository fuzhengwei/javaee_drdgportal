<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/view/res_head.jsp"%>
<html>
	<head>
		<title></title>
		<%@ include file="/view/res_easyui.jsp"%>
	</head>
	<body>
		<table title="Folder Browser" class="easyui-treegrid"
			style="width: 700px; height: 250px"
			data-options="
				url: 'proModule/doGetProModuleBaseInfo.do',
				method: 'get',
				rownumbers: true,
				idField: 'id',
				treeField: 'pmName'
				">
			<thead>
				<tr>
					<th data-options="field:'pmName'" width="220">
						Name
					</th>
					<th data-options="field:'pmiUrl'" width="150">
						pmiUrl
					</th>
				</tr>
			</thead>
		</table>

	</body>
</html>
