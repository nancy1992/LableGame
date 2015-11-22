<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link href="css/select.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jQuery-button1.js"></script>

<script>
	function Save() {
		/* 获得信息 */
		var name = document.getElementById("name").value;

		if (name != "") {
			$.post('checkLable.action', {
				name : name,
			}, function(response) {
				if (response == "exists") {
					alert("该名称已经存在");
					return false;
				} else if (response == "ok") {
					return true;
				}
			});

		} else {
			alert("请填写标签名称");
			return false;
		}
	}

	$(function() {
		$("#dialog .close").click(function() {
			$("#dialog").css("display", "none");
		});

		$("#dialog .cancle").click(function() {
			$("#dialog").css("display", "none");
		});

		$("#dialog .ok").click(function() {
			var name = $("#hide").val();
			window.location.href = "deleteLable?name=" + name;
		});
	});
	$(function() {
		$('.J-shoping-body').deleteLable(); //调用shoping函数
	});
</script>
</head>

<body>
	<div id="M-main-b">
		<div class="M-main-list">
			<s:iterator value="#lables" var="list" status="status">
				<div class="J-shoping-body">
					<div class="J-shoping-list">
						<div class="J-shoping-list-a">
							<p>
								<a href="addUserLable?name=${list.lable }">${list.lable }</a>
							</p>
						</div>
						<div class="baseBg J-shoping-close"></div>
					</div>
				</div>
			</s:iterator>
			<div class="add_button">
				<form method="post" name="loginForm" onSubmit="return Save()"
					action="addLable.action">
					<input type="text" tabindex="1" id="name" name="name"
						placeholder="标签名称" style="float: left; margin-left: 5%" />
					<button name="submit" type="submit" id="contact-submit"
						style="width: 10%; float: left; margin-left: 5%">添加</button>
				</form>
			</div>
		</div>
	</div>

	<div class="dialog new-group-dialog" id="dialog" style="width: 380px;">
		<div class="d-header">
			<h3 class="dialog-title">删除标签</h3>
			<div class="close"></div>
		</div>
		<div class="dialog-content">
			<div class="new-bottom">
				<div class="new-item">
					<span>删除标签后，相同的用户标签也会删除</span>
				</div>
			</div>
		</div>
		<div class="dialog-footer">
			<div class="btn">
				<a class="ok">确定</a> <a class="cancle">取消</a>
			</div>
			<div>
				<input type="hidden" id="hide" />
			</div>
		</div>
	</div>

</body>
</html>
