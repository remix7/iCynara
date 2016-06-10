<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>iCynara | Blog</title>
		<meta charset="utf-8">
		<%@ include file="/client/page/header.jspf"%>
		<div class="d1">
			<ul class="list-blog">
	            <li>  
	            <h4>${title}</h4>  
	            <time datetime="${createTime}" class="date-1"><i class="icon-calendar icon-white"></i>${createTime}</time>
	            <div class="name-author"><i class="icon-user icon-white"></i> ${author.name }  </div>&nbsp;&nbsp;&nbsp;${remarks}
	            <div class="clear"> </div>   
	                    
	            </li>  
	          </ul>
	        
		</div>
		 ${content} 
 <!-- footer -->
<%@ include file="/client/page/foot.jspf"%>
