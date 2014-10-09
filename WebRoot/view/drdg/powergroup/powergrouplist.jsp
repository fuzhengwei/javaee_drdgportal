<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/view/res_head.jsp"%>
<html>
<head>
	<title></title>
	<%@ include file="/view/res_easyui.jsp"%>
</head>
<body>
	<div style="margin:20px 0;">
	<a href="#" class="easyui-linkbutton" onclick="getChecked()">GetChecked</a>
	</div>
	<div class="easyui-panel" title="权限创建"   style="width:100%;height:400px;padding:10px;">
	 <div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'west',split:true" title="模块树结构" style="width:20%;">
			<ul id="tt" class="easyui-tree" 
				data-options="url:'powerGroup/doGetTreeProModule.do',
				method:'get',
				animate:true,
				checkbox:true">
			</ul>
		</div>
		<div data-options="region:'center',split:true"  title="操作控制台"  style="padding:10px">
			
		</div>
		<div data-options="region:'east',split:true"  title="权限树结构"  style="width:60%;padding:10px">
		
			<table id="dg" class="easyui-treegrid"
				toolbar="#toolbar"
				data-options="
					url:'powerGroup/doGetPowerGroupTree.do', 
					method: 'post',
					idField: 'id',
					treeField: 'pmName',
					lines: true,
					panelHeight:'auto'
					">
				<thead>
					<tr align="center">
						<th data-options="field:'pmName'" align="left">
							权限组
						</th>
					</tr>
				</thead>
			</table>
			<div id="toolbar">
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-add" plain="true" onclick="addBean()";>添加模块</a>
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-edit" plain="true" onclick="updateBean";>修改模块</a>
				<a href="javascript:void(0)" class="easyui-linkbutton"
				    iconCls="icon-remove" plain="true" onclick="deleteBean()";>删除模块</a>
			</div>
			<div id="dlg-pg" class="easyui-dialog" 
				style="width: 400px; height: 200px; padding: 10px 20px" closed="false" 
				buttons="#dlg-buttons-pg">
				<div class="ftitle">
					模块信息
				</div>
				<form id="fm-pg" method="post" novalidate>
					<div class="fitem">
						<label>
							模块组名称:
						</label>
						<input name="pmName" class="easyui-textbox" required="true">
					</div>
				</form>
			</div>
			<div id="dlg-buttons-pg">
				<a href="javascript:void(0)" class="easyui-linkbutton c6"
					iconCls="icon-ok" onclick="saveProModule()";style="width: 90px">Save</a>
				<a href="javascript:void(0)" class="easyui-linkbutton"
					iconCls="icon-cancel"
					onclick="javascript: $('#dlg-pg').dialog('close')";style="width: 90px">Cancel</a>
			</div>
	    </div>
		
	 </div>
	</div>
<script type="text/javascript">

	//add 
	function addBean(){
		$('#dlg-pg').dialog('open').dialog('setTitle', 'New User');
		$('#fm-pg').form('clear');
	}
	

	function getChecked(){
		var nodes = $('#tt').tree('getChecked');
		var s = '';
		for(var i=0; i<nodes.length; i++){
		if (s != '') s += ',';
		s += nodes[i].text;
		}
		alert(s);
	}
</script>

</body>
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
</html>
