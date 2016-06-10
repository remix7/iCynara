package com.icynara.view.action;

import java.util.Date;
import java.util.List;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.icynara.base.BaseAction;
import com.icynara.domain.Blog;
import com.icynara.domain.User;
import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class BlogAction extends BaseAction<Blog>{
	private String imageCode;
	public String list() throws Exception {
		List<Blog> blogList = blogService.findAll();
		ActionContext.getContext().put("blogList", blogList);
		return "list";
	}
	public String add() throws Exception {
		String code = (String) ActionContext.getContext().getSession().get("imageCheck");
		if(!imageCode.endsWith(code)){
			ActionContext.getContext().put("message", "验证码错误!");
			return "message";
		}else{
			Blog blog = new Blog();
			User user = (User)ActionContext.getContext().getSession().get("user");
			blog.setAuthor(user);
			blog.setContent(model.getContent());
			blog.setCreateTime(new Date());
			blog.setRemarks(model.getRemarks());
			blog.setTitle(model.getTitle());
			blogService.save(blog);
			return list();
		}
	}
	public String addUI() throws Exception {
		return "addUI";
	}
	public String delete() throws Exception {
		blogService.delete(model.getId());
		return list();
	}
	public String update() throws Exception {
		String code = (String) ActionContext.getContext().getSession().get("imageCheck");
		if(!imageCode.endsWith(code)){
			ActionContext.getContext().put("message", "验证码错误!");
			return "message";
		}else{
			Blog blog = blogService.getById(model.getId());
			blog.setContent(model.getContent());
			blog.setRemarks(model.getRemarks());
			blog.setTitle(model.getTitle());
			blogService.update(blog);
			return list();
		}
	}
	public String updateUI() throws Exception {
		Blog blog = blogService.getById(model.getId());
		ActionContext.getContext().getValueStack().push(blog);
		return "updateUI";
	}
	
	public String view() throws Exception {
		Blog blog = blogService.getById(model.getId());
		if(blog==null){
			ActionContext.getContext().put("message", "出现问题啦!");
			return "message";
		}else{
			ActionContext.getContext().getValueStack().push(blog);
			return "view";
		}
	}
	public String getImageCode() {
		return imageCode;
	}
	public void setImageCode(String imageCode) {
		this.imageCode = imageCode;
	}
	
}
