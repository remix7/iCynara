<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh">
  <head>
    <meta charset="utf-8">
    <title>iCynara | 主页</title>
    <%@ include file="/WEB-INF/jsp/public/head.jspf"%>
    <body> 
    <%@ include file="/WEB-INF/jsp/public/top.jspf"%>
    <%--left --%>
    <%@ include file="/WEB-INF/jsp/public/left.jspf"%>

    
    <div class="content">
        
        <div class="header">
            <div class="stats">
    <p class="stat"><span class="number">53</span>张票</p>
    <p class="stat"><span class="number">27</span>个任务</p>
    <p class="stat"><span class="number">15</span>排队中</p>
</div>

            <h1 class="page-title">控制台</h1>
        </div>

        <div class="container-fluid">
            <div class="row-fluid">
                    

<div class="row-fluid">

    <div class="alert alert-info">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>只是个提示:</strong> 希望你喜欢这个主题!
    </div>
    <div class="block">
        <a href="#page-stats" class="block-heading" data-toggle="collapse">最新统计</a>
        <div id="page-stats" class="block-body collapse in">
        123
        <!-- 
            <div class="stat-widget-container">
                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title">2,500</p>
                        <p class="detail">博客数量</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title">3,299</p>
                        <p class="detail">下载量</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title">1,500</p>
                        <p class="detail">点击量</p>
                    </div>
                </div>

                <div class="stat-widget">
                    <div class="stat-button">
                        <p class="title">12,675</p>
                        <p class="detail">回复数量</p>
                    </div>
                </div>
            </div>
             -->
        </div>
    </div>
</div>

<div class="row-fluid">
    <div class="block span6">
        <a href="#tablewidget" class="block-heading" data-toggle="collapse">博客预览<span class="label label-warning">+10</span></a>
        <div id="tablewidget" class="block-body collapse in">
            <table class="table">
              <thead>
                <tr>
                  <th>帖子名</th>
                  <th>作者</th>
                  <th>创作时间</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>Mark</td>
                  <td>Tompson</td>
                  <td>the_mark7</td>
                </tr>
                <tr>
                  <td>Ashley</td>
                  <td>Jacobs</td>
                  <td>ash11927</td>
                </tr>
                <tr>
                  <td>Audrey</td>
                  <td>Ann</td>
                  <td>audann84</td>
                </tr>
                <tr>
                  <td>John</td>
                  <td>Robinson</td>
                  <td>jr5527</td>
                </tr>
                <tr>
                  <td>Aaron</td>
                  <td>Butler</td>
                  <td>aaron_butler</td>
                </tr>
                <tr>
                  <td>Chris</td>
                  <td>Albert</td>
                  <td>cab79</td>
                </tr>
              </tbody>
            </table>
            <p><a href="users.html">More...</a></p>
        </div>
    </div>
   
    <div class="block span6">
     <s:iterator begin="0" end="10">
        <a href="#widget1container" class="block-heading" data-toggle="collapse">可折叠框 </a>
        <div id="widget1container" class="block-body collapse in">
        888
        </div>
        </s:iterator>
    </div>
    
</div>

<div class="row-fluid">
    <div class="block span6">
        <div class="block-heading">
            <span class="block-icon pull-right">
                <a href="#" class="demo-cancel-click" rel="tooltip" title="Click to refresh"><i class="icon-refresh"></i></a>
            </span>

            <a href="#widget2container" data-toggle="collapse">可刷新框</a>
        </div>
        <div id="widget2container" class="block-body collapse in">
            <table class="table list">
              <tbody>
                  <tr>
                      <td>
                          <p><i class="icon-user"></i> Mark Otto</p>
                      </td>
                      <td>
                          <p>Amount: $1,247</p>
                      </td>
                      <td>
                          <p>Date: 7/19/2012</p>
                          <a href="#">View Transaction</a>
                      </td>
                  </tr>
                  <tr>
                      <td>
                          <p><i class="icon-user"></i> Audrey Ann</p>
                      </td>
                      <td>
                          <p>Amount: $2,793</p>
                      </td>
                      <td>
                          <p>Date: 7/12/2012</p>
                          <a href="#">View Transaction</a>
                      </td>
                  </tr>
                  <tr>
                      <td>
                          <p><i class="icon-user"></i> Mark Tompson</p>
                      </td>
                      <td>
                          <p>Amount: $2,349</p>
                      </td>
                      <td>
                          <p>Date: 3/10/2012</p>
                          <a href="#">View Transaction</a>
                      </td>
                  </tr>
                  <tr>
                      <td>
                          <p><i class="icon-user"></i> Ashley Jacobs</p>
                      </td>
                      <td>
                          <p>Amount: $1,192</p>
                      </td>
                      <td>
                          <p>Date: 1/19/2012</p>
                          <a href="#">View Transaction</a>
                      </td>
                  </tr>
                    
              </tbody>
            </table> 
        </div>
    </div>
	    <div class="block span6">
	        <p class="block-heading" >不能折叠框</p>
	        <div class="block-body">
	             <h2>这里是内容标题</h2>
	            <p>登录阿里云管理控制台进行云服务器的基本管理，如修改密码、重启、更换操作系统等，您还可以通过API的方式来管理云服务器.</p>
	            <p>远程登录到云服务器后运行程序或脚本，Linux系统可以使用SSH，Windows系统可以使用远程桌面登录，登录后的管理方式和物理服务器没有差别</p>
	            <p>云服务器（Elastic Compute Service, 简称ECS）是一种处理能力可弹性伸缩的计算服务，其管理方式比物理服务器更简单高效。
	云服务器帮助您快速构建更稳定、安全的应用，降低开发运维的难度和整体IT成本，使您能够更专注于核心业务创新。</p>
	 <p>负载均衡服务SLB和多个云服务器连接成应用服务集群, 后端数据库采用高性能的关系型数据库服务RDS，。</p>
	  <h2>这里是内容标题</h2>
	            <p>登录阿里云管理控制台进行云服务器的基本管理，如修改密码、重启、更换操作系统等，您还可以通过API的方式来管理云服务器.</p>
	            <p>远程登录到云服务器后运行程序或脚本，Linux系统可以使用SSH，Windows系统可以使用远程桌面登录，登录后的管理方式和物理服务器没有差别</p>
	            <p>云服务器（Elastic Compute Service, 简称ECS）是一种处理能力可弹性伸缩的计算服务，其管理方式比物理服务器更简单高效。
	云服务器帮助您快速构建更稳定、安全的应用，降低开发运维的难度和整体IT成本，使您能够更专注于核心业务创新。</p>
	 <p>负载均衡服务SLB和多个云服务器连接成应用服务集群, 后端数据库采用高性能的关系型数据库服务RDS，。</p>
	        </div>
	    </div>
</div>
<%@ include file="/WEB-INF/jsp/public/footer.jspf" %>

                    
               
