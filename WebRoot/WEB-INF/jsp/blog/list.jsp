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
				<s:a action="blog_addUI" cssClass='btn btn-primary pull-left'>创建</s:a>
				<br/>
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
									data-toggle="collapse">帖子列表</a>
								<div id="page-stats" class="block-body collapse in">
									<div class="stat-widget-container">
									<table class="table">
						              <thead>
						                <tr>
						                  <th>标题</th>
						                  <th>作者</th>
						                  <th>创作时间</th>
						                  <th>回复数量</th>
						                  <th>备注</th>
						                  <th>操作</th>
						                </tr>
						              </thead>
									<s:iterator value="%{blogList}">
							              <tbody>
							                <tr>
							                  <td>
							                  <s:a action="blog_view?id=%{id}">${title}</s:a> 
							                  </td>
							                  <td>${author.name }</td>
							                  <td>${createTime}</td>
							                  <td>${replyCount}</td>
							                  <td>${remarks}</td>
							                  <td>
							                  	<s:a action="blog_updateUI?id=%{id}">修改</s:a>&nbsp;&nbsp;&nbsp;
							                  	<s:a action="blog_delete?id=%{id}" onClick="return confirm('确定要删除本帖吗？')">删除</s:a>
							                  </td>
							                </tr>
							              </tbody>
							            </s:iterator>
							            </table>
									</div>
								</div>
							</div>
						</div>
						<%@ include file="/WEB-INF/jsp/public/footer.jspf"%>
					</div>
					</div>
					</div>
					</body>
