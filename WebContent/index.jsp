<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="css/select.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="M-main-b">
		<div class="M-main-list">
			<s:iterator value="#userLables" var="list" status="status">
				<div class="J-shoping-body">
					<div class="J-shoping-list" data-id="1">
						<div class="J-shoping-list-a">
							<p>${list.lable }</p>
						</div>
						<div class="baseBg J-shoping-close"></div>
					</div>
				</div>
			</s:iterator>
			<div class="J-shoping-body">
				<div class="J-shoping-list" data-id="1">
					<div class="J-shoping-list-a">
						<p>
							<a href="getAllLable.action">添加</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript" src="js/jQuery-button.js"></script>
	<script type="text/javascript">
		$(function() {
			$('.J-shoping-body').deleteLable(); //调用shoping函数
		});
	</script>

</body>
</html>
