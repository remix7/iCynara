<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
	<head>
		<meta charset="utf-8">
		<title>iCynara | 博客</title>
		<%@ include file="/WEB-INF/jsp/public/head.jspf"%>
		<body>
			<%@ include file="/WEB-INF/jsp/public/top.jspf"%>
			<%--left --%>
			<%@ include file="/WEB-INF/jsp/public/left.jspf"%>

			<div class="content">

				<div class="container-fluid">
					<div class="row-fluid">

						<div class="row-fluid">

							<div class="alert alert-info">

								<button type="button" class="close" data-dismiss="alert">
									×
								</button>
								<strong>只是个提示:</strong> 希望你喜欢这个主题!
							</div>
							<div class="block">
								<a href="#page-stats" class="block-heading"
									data-toggle="collapse">标题:${title}</a>
								<div id="page-stats" class="block-body collapse in">
									作者:${author.name}&nbsp;&nbsp;&nbsp;创作时间:${createTime}<br/><br/>
									${content}
									<br/>....
								</div>
							</div>
						</div>
		</body>
		<%@ include file="/WEB-INF/jsp/public/footer.jspf"%>