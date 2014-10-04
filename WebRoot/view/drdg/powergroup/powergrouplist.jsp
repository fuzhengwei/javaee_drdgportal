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
	<div style="margin:10px 0">
	<input type="checkbox" checked onchange="$('#tt').tree({cascadeCheck:$(this).is(':checked')})">CascadeCheck
	<input type="checkbox" onchange="$('#tt').tree({onlyLeafCheck:$(this).is(':checked')})">OnlyLeafCheck
	</div>
	<div class="easyui-panel" style="padding:5px">
	<ul id="tt" class="easyui-tree" 
		data-options="url:'powerGroup/doGetTreeProModule.do',
		method:'get',
		animate:true,
		checkbox:true">
	</ul>
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
