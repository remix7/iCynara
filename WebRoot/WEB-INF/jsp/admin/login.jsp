<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8">
		<title>iCynara | 后台登录</title>
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
							登录
						</p>
						<div class="block-body">
							<s:form action="user_login" method="post" name="f1"  onsubmit = "return check();">
								<label>
									用户名
								</label>
								<input type="text" name="userName" class="span12">
								<label>
									密码
								</label>
								<input type="password" name="password" class="span12">
								<label>
									验证码
								</label>
								<input type="text" name="imageCode" class="span12" style="width: 200px"/>&nbsp;
								<img width="103px" height="30px" src="http://localhost:8080/servlet/ImageChack"/><br/>
								<input type='submit' class='btn btn-primary pull-right' 
									value='登录'>
								<p>
									<a href="reset-password.html">忘记密码?</a>&nbsp;&nbsp;&nbsp;
									<a href="${pageContext.request.contextPath}/user_registUI.do">注册</a>
								</p>
								<div class="clearfix"></div>
							</s:form>
						</div>
					</div>
				</div>
			</div>
		</body>
		<script type="text/javascript">
			function check(){
				if(f1.userName.value=="")  
                {  
					alert("请输入用户名!");
                    return false;  
                }  
                else if(f1.password.value=="")  
                {  
                    alert("请输入密码!");  
                    return false;  
                }else if(f1.imageCode.value==""){
                	 alert("请输入验证码!");  
                     return false;  
                }  
                return true;  
           	}   
		</script>
</html>




