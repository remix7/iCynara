<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>  
    <title>iCynara | 消息</title>
	<%@ include file="/WEB-INF/jsp/public/head.jspf"%>
		<body >

			<div class="navbar">
				<div class="navbar-inner">
					<ul class="nav pull-right">

					</ul>
					<a class="brand" href="#"><span class="first"></span> <span
						class="second">iCynara</span>
					</a>
				</div>
			</div>
			 <div class="row-fluid">
    	<div class="http-error">
        <div class="http-error-message">
            <div class="error-caption">
                <p style="color:$CFCFCF">Message
                	<!-- <img src="${pageContext.request.contextPath}admin/images/favicon.ico.png" width="140px" height="180px"/> -->
                </p>
            </div>
            <div class="error-message">
                <p>${message}<p>
                <p class="return-home"><a href="${pageContext.request.contextPath}/user_loginUI.do">返回登录界面</a></p>
            </div>
        </div>
    </div>
</div>
			
    
  </body>
</html>
