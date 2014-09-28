<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="/view/res_head.jsp"%>
<html>
	<head>
		<title></title>
		<%@ include file="/view/res_easyui.jsp"%>
	</head>
	<body>
		<table id="dg" title="Folder Browser" class="easyui-treegrid"
			style="width: 700px;" toolbar="#toolbar"
			data-options="
				url:'proModule/doGetProModuleBaseInfo.do', 
				method: 'post',
				rownumbers: true,
				pagination: true,
				idField: 'id',
				treeField: 'pmName',
				panelHeight:'auto'
				">
			<thead>
				<tr>
					<th data-options="field:'pmName'" width="220">
					</th>
					<th data-options="field:'pmiSequence'" width="150">
						序号
					</th>
					<th data-options="field:'pmiUrl'" width="150">
						链接
					</th>
				</tr>
			</thead>
		</table>
		<div id="toolbar">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-add" plain="true" onclick="newProModule()";>添加模块</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-add" plain="true" onclick="newProModuleInfo()";>添加模块子信息</a>
		</div>
		<div id="dlg-module" class="easyui-dialog"
			style="width: 400px; height: 200px; padding: 10px 20px" closed="true" 
			buttons="#dlg-buttons">
			<div class="ftitle">
				模块信息
			</div>
			<form id="fm-module" method="post" novalidate>
				<div class="fitem">
					<label>
						模块名称:
					</label>
					<input name="pmName" class="easyui-textbox" required="true">
				</div>
				<div class="fitem">
					<label>
						模块状态:
					</label>
					<input class="easyui-combobox" id="psState" name="psState" data-options="
						valueField: 'label',
						textField: 'value',
						data: [{
							label: '0',
							value: '开启'
						},{
							label: '1',
							value: '关闭'
						}],
						panelHeight:'auto',
						editable:false" />
				</div>
				<div class="fitem">
					<label>
						备注信息:
					</label>
					<input name="pmRemarks" class="easyui-textbox">
				</div>
			</form>
		</div>

		<div id="dlg-moduleinfo" class="easyui-dialog"
			style="width: 400px; height: 250px; padding: 10px 20px" closed="true"
			buttons="#dlg-buttons-info">
			<div class="ftitle">
				模块子信息
			</div>
			<form id="fm-moduleinfo" method="post" novalidate>
				<div class="fitem">
					<label>
						模块名称:
					</label>
					<input class="easyui-combobox" id="fk_pm_id" name="fkPmId"
						data-options="
								valueField:'pmId',
								textField:'pmName',
								panelHeight:'auto'
								">
				</div>
				<div class="fitem">
					<label>
						子模块顺序:
					</label>
					<input name="pmiSequence" class="easyui-textbox" required="true">
				</div>
				<div class="fitem">
					<label>
						子模块名称:
					</label>
					<input name="pmiName" class="easyui-textbox" required="true">
				</div>
				<div class="fitem">
					<label>
						子模块地址:
					</label>
					<input name="pmiUrl" class="easyui-textbox" required="true">
				</div>
			</form>
		</div>

		<div id="dlg-buttons">
			<a href="javascript:void(0)" class="easyui-linkbutton c6"
				iconCls="icon-ok" onclick="saveProModule()";style="width: 90px">Save</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel"
				onclick="javascript: $('#dlg-module,#dlg-moduleinfo').dialog('close')";style="width: 90px">Cancel</a>
		</div>
		
		<div id="dlg-buttons-info">
			<a href="javascript:void(0)" class="easyui-linkbutton c6"
				iconCls="icon-ok" onclick="saveProModule()";style="width: 90px">Save</a>
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-cancel"
				onclick="javascript: $('#dlg-module,#dlg-moduleinfo').dialog('close')";style="width: 90px">Cancel</a>
		</div>
		<script type="text/javascript">
	var url,wform;
	function newProModule() {
		$('#dlg-module').dialog('open').dialog('setTitle', 'New User');
		$('#fm-module').form('clear');
		$("#psState").combobox("setValue", $("#psState").combobox('getData')[0].label);
		url = 'proModule/doSaveProModule.do';
		wform = '#fm-module';
	}

	function newProModuleInfo() {
		$('#dlg-moduleinfo').dialog('open').dialog('setTitle', 'New User');
		$('#fm-moduleinfo').form('clear');
		$('#fk_pm_id').combobox('reload', 'proModule/doGetProModule.do');

		var row;
		if(null != $('#dg').treegrid('getSelected')){
			row = $('#dg').treegrid('getSelected');
			//当鼠标点在模块下子信息时候，可以通过子信息截取头信息同row.pmId同作用
			var infoId = row.id;
			if(null != row.pmId){
				$("#fk_pm_id").combobox("setValue", row.pmId);
			}else if(null != infoId){
				$("#fk_pm_id").combobox("setValue", infoId.toString().substring(0,1));
			}
		}else{
			$("#fk_pm_id").combobox("setValue", $('#dg').treegrid('getRoot').id);
		}
		//当鼠标点在模块下子信息时候，可以通过子信息截取头信息同row.pmId同作用
		url = 'proModule/doSaveProModuleInfo.do';
		wform = '#fm-moduleinfo';
	}

	function saveProModule() {
		$(wform).form('submit', {
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
					$('#dlg-module,#dlg-moduleinfo').dialog('close'); // close the dialog
					$('#dg').treegrid('reload'); // reload the user data
		}
	}
		});
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
