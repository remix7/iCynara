<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>iCynara | 完成注册</title>
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
				<div class="dialog">
					<div class="block">
						<p class="block-heading">
							验证信息
						</p>
						<div class="block-body">
							<form action="user_mailCheck.do" method="post" name="f1"  onsubmit = "return check();">
								<label>
									返回码
								</label>
								<input type="text" name="mailCode" class="span12">
								<label>
									验证码
								</label>
								<input type="text" name="imageCode" class="span12" style="width: 200px"/>&nbsp;
								<img width="103px" height="30px" src="http://localhost:8080/servlet/ImageChack"/><br/>
								<input type='submit' class='btn btn-primary pull-right' 
									value='验证'>
								<p>
									<a href="${pageContext.request.contextPath}/user_loginUI.do">登录</a>
								</p>
								<div class="clearfix"></div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</body>
		<script type="text/javascript">
			function check(){
				if(f1.mailCode.value=="")  
                {  
					alert("请输入返回码!");
                    return false;  
                }else if(f1.imageCode.value==""){
                	 alert("请输入验证码!");  
                     return false;  
                }  
                return true;  
           	}   
		</script>
</html>




