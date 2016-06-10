package com.icynara.view.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.icynara.base.BaseAction;
import com.icynara.domain.Blog;
import com.icynara.domain.Reply;
import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class ClientAction extends BaseAction<Reply>{
	public String toBlog() throws Exception {
		@SuppressWarnings("unused")
		List<Blog> blogList = blogService.findAll();
		ActionContext.getContext().put("blogList", blogList);
		return "toBlog";
	}
	private String blogId;
	public String viewBlog() throws Exception {
		Blog blog = blogService.getById(blogId);
		if(blog==null){
			ActionContext.getContext().put("message", "出错啦!");
			return "message";
		}else{
			ActionContext.getContext().getValueStack().push(blog);
			return "view";
		}
		
	}
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}
	
}
