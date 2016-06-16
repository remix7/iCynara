package com.icynara.view.action;

import java.util.Date;
import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.icynara.base.BaseAction;
import com.icynara.domain.User;
import com.icynara.util.MD5EncodingUtils;
import com.icynara.util.SendEmail;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class UserAction extends BaseAction<User> {
	private String imageCode;// 验证码
	private String mailCode;// 邮件回执

	public String login() throws Exception {
		String code = (String) ActionContext.getContext().getSession().get(
				"imageCheck");
		User user = userService.getByUnAndPw(model.getUserName(), model
				.getPassword());
		if (user == null || !imageCode.equals(code)) {
			ActionContext.getContext().put("message", "输入的用户名名或密码错误!");
			return "message";
		} else {
			if ("0".equals(user.getState())) {
				ActionContext.getContext().put("message", "对不起您还注册还没有成功!");
				return "message";
			} else {
				user.setLastLoginTime(new Date());
				userService.update(user);
				ActionContext.getContext().getSession().put("user", user);
				ActionContext.getContext().put("user", user);
				return "login";
			}
		}
	}

	public String loginUI() throws Exception {
		return "loginUI";
	}

	public String logOut() throws Exception {
		ActionContext.getContext().getSession().remove("user");
		return "loginUI";
	}

	public String regist() throws Exception {
		User user = userService.getByEmail(model.getEmail());
		if (user != null) {
			ActionContext.getContext().put("message", "用户已经存在!");
			return "message";
		} else {
			user = new User();
			user.setCreateTime(new Date());
			user.setEmail(model.getEmail());
			user.setName(model.getName());
			user.setNote(UUID.randomUUID().toString());
			user.setPassword(MD5EncodingUtils.getMD5(model.getPassword()));
			user.setUserName(model.getUserName());
			user.setState("0");
			userService.save(user);
			ActionContext.getContext().put("message", "请查看邮箱中的激活邮件!");
			SendEmail.send(user.getEmail(), user.getNote());
			return "message";
		}
	}

	public String registUI() throws Exception {
		return "registUI";
	}

	public String toIndex() throws Exception {
		User user = (User) ActionContext.getContext().getSession().get("user");
		if (user == null) {
			return "error";
		} else {
			return "login";
		}

	}

	public String mailCheck() throws Exception {
		User user = userService.getByNote(mailCode);
		String code = (String) ActionContext.getContext().getSession().get(
				"imageCheck");
		if (!imageCode.equals(code)) {
			ActionContext.getContext().put("message", "验证码错误!");
			return "message";
		} else if ("1".equals(user.getState())) {
			ActionContext.getContext().put("user", user);
			return "findPassword";
		}
		if (user != null && imageCode.equals(code)) {
			if ("1".equals(user.getState())) {
				ActionContext.getContext().put("message", "请不要重复激活!");
				return "message";
			} else {
				user.setState("1");
				userService.update(user);
				ActionContext.getContext().put("message", "激活成功!");
				return "message";
			}
		} else {
			ActionContext.getContext().put("message", "请输入正确的回执码!");
			return "message";
		}
	}

	public String findPassword() throws Exception {
		String code = (String) ActionContext.getContext().getSession().get(
				"imageCheck");
		User user = userService.getByEmail(model.getEmail());
		if (!imageCode.equals(code)) {
			ActionContext.getContext().put("message", "验证码错误!");
			return "message";
		} else if (user == null) {
			ActionContext.getContext().put("message", "输入的邮箱有误!");
			return "message";
		} else if (!"1".equals(user.getState())) {
			ActionContext.getContext().put("message", "请先激活用户!");
			return "message";
		} else {
			ActionContext.getContext().put("message", "请查看邮箱中的找回密码邮件邮件!");
			SendEmail.send(user.getEmail(), user.getNote());
			return "message";
		}

	}

	public String findUserPass() throws Exception {
		String code = (String) ActionContext.getContext().getSession().get(
				"imageCheck");
		User user = userService.getByEmail(model.getEmail());
		if (!imageCode.equals(code)) {
			ActionContext.getContext().put("message", "验证码错误!");
			return "message";
		} else if (user != null) {
			user.setPassword(MD5EncodingUtils.getMD5(model.getPassword()));
			ActionContext.getContext().put("message", "找回密码成功!");
			userService.update(user);
			return "message";
		} else {
			ActionContext.getContext().put("message", "error!");
			return "message";
		}
	}

	public String getImageCode() {
		return imageCode;
	}

	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}

	public String getMailCode() {
		return mailCode;
	}

	public void setMailCode(String mailCode) {
		this.mailCode = mailCode;
	}

}
