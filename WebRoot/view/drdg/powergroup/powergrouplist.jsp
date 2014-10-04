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
	<div class="easyui-panel" title="权限创建"   style="width:100%;height:300px;padding:10px;">
	 <div class="easyui-layout" data-options="fit:true">
		<div data-options="region:'west',split:true" title="模块树结构" style="width:200px;">
			<ul id="tt" class="easyui-tree" 
				data-options="url:'powerGroup/doGetTreeProModule.do',
				method:'get',
				animate:true,
				checkbox:true">
			</ul>
		</div>
		<div data-options="region:'center',split:true"  title="操作控制台"  style="padding:10px">
		Right Content
		</div>
		<div data-options="region:'east',split:true"  title="权限树结构"  style="width:200px;padding:10px">
		Right Content
	    </div>
		
	 </div>
	</div>
<script type="text/javascript">
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
</html>
