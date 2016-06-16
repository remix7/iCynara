package com.icynara.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmail {
	public static void  send(String mailAdd,String text) {
		String html = "<tr><td align='center' valign='top'><table id='templateBody' border='0' cellpadding='0' cellspacing='0' width='100%'>" +
				"<tbody><tr><td align='center' valign='top'><table class='templateContainer' border='0' cellpadding='0' cellspacing='0'" +
				"width='650'><tbody><tr><td data-container='body' class='bodyContainer tpl-container dragTarget' valign='top'>" +
				"<div class='block tpl-block text-block' style='border-radius: 0px; border: 0px solid rgb(0, 0, 0);'>" +
				"<div data-attach-point='containerNode'><table class='textBlock' border='0' cellpadding='0' cellspacing='0' width='100%'>" +
				"<tbody class='textBlockOuter'><tr><td class='textBlockInner' valign='top'><table class='textContentContainer' align='left'" +
				"border='0' cellpadding='0' cellspacing='0' width='100%'><tbody><tr><td class='textContent' style='padding-top:5px; " +
				"padding-right: 40px; padding-bottom: 25px;padding-left: 40px;background-color:rgba(255,255,255,0)' valign='top'>" +
				"<div style='text-align: center'><br><span style='font-family: 'Microsoft YaHei', 微软雅黑, SimSun, 宋体, Heiti, 黑体, " +
				"sans-serif;text-align: center; font-size: 14px !important; line-height: 24.9333px;'>复制代码点击下方按钮完成注册<br><br>" +text+"<br><br>" +
				"若存在任何问题，请与我们的联系（QQ：<span style='border-bottom:1px dashed #ccc;z-index:1' t='7' onclick='return false;' " +
				"data='774022197'>774022197</span></span>） </div><div style='text-align:center;margin-top: 20px'>" +
				"<div style='width: 600px;display:inline-block;padding:10px'>" +
				"<a class='activeA' style='display:inline-block;background:#07d681;" +
				"border-radius:4px;padding: 0px auto;color:white;" +
				"text-decoration:none;font-size:16px;line-height: 44px ; width: 280px;height: 44px' href='http://localhost:8080/mailCheck.jsp' target='_blank'>完成注册</a>" +
				"</div></div><div style='text-align:center;margin-top: 20px'>或复制以下网址到浏览器里直接打开：<br>" +
				"<a href='http://localhost:8080/mailCheck.jsp' target='_blank'>http://localhost:8080/mailCheck.jsp</a>" +
				"<br>再次感谢您的注册<br> &copy;<a href='http://www.icynara.com' target='_blank'>iCynara</a>&nbsp;2016"+
				"</div></td></tr></tbody></table></td></tr></tbody></table>" +
				"</div></div></td></tr></tbody></table></td></tr></tbody></table></td></tr>";
		Properties props = new Properties();//设置环境 发送时才需要
		props.setProperty("mail.transport.protocol", "smtp");//发送使用的协议
		props.setProperty("mail.host", "smtp.163.com");//发送服务器的主机地址
		props.setProperty("mail.smtp.auth", "true");//请求身份认证
		props.setProperty("", "");
		Session session = Session.getDefaultInstance(props);
		session.setDebug(true);//是否在控制台显示debug信息
		MimeMessage message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress("cynara7@163.com"));//发件人
			message.setRecipients(Message.RecipientType.TO,mailAdd);//收件人  
			message.setSubject("欢迎注册iCynara,成为这个大家庭中的一员!!");//主题
			
			MimeBodyPart mpart = new MimeBodyPart();
			mpart.setContent(html,"text/html;charset=UTF-8");
			
			MimeMultipart mmpart = new MimeMultipart();
			mmpart.addBodyPart(mpart);
			message.setContent(mmpart);
			message.saveChanges();
			//发送邮件
			Transport ts = session.getTransport();
			ts.connect("cynara7","xzetpxtpiwdymrka");
			ts.sendMessage(message, message.getAllRecipients());
			ts.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
