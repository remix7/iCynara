<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
	<head>
		<meta charset="utf-8">
		<title>iCynara | 修改博客</title>
		<%@ include file="/WEB-INF/jsp/public/head.jspf"%>
		<%@ include file="/WEB-INF/jsp/public/kindeditor.jspf"%>
		<body>

			<%@ include file="/WEB-INF/jsp/public/top.jspf"%>
			<%--left --%>
			<%@ include file="/WEB-INF/jsp/public/left.jspf"%>
			<div class="content">

				<div class="container-fluid">
					<br />
					<div class="row-fluid">

						<div class="row-fluid">
							<s:form action="blog_update" method="post" name="f1" 
								onsubmit="return check();">
								<input type="hidden" name="id" value="${id}"/>
								<label>
									标题
								</label>
								<input type="text" name="title" class="span12" value="${title}"
									style="width: 500px">
								<label>
									备注
								</label>
								<input type="text" name="remarks" class="span12"  value="${remarks}"
									style="width: 500px">
								<label>
									内容
								</label>
								<textarea name="content"  rows="16" style="width: 680px" value="${content}"></textarea>
								<label>
									验证码
								</label>
								<input type="text" name="imageCode" class="span12"
									style="width: 200px" />&nbsp;
								<img width="103px" height="30px"
									src="http://localhost:8080/servlet/ImageChack" />
								<br />
								<input type='submit' class='btn btn-primary pull-center'
									value='修改'>
							</s:form>
							<%@ include file="/WEB-INF/jsp/public/footer.jspf"%>
						</div>
					</div>
				</div>
			</div>
		