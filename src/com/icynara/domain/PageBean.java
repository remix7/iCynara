package com.icynara.domain;

import java.util.List;
/**
 * 分页用一页的信息对象
 * 
currentPage;  当前页
pageCount;     总页数
pageSize;      每页显示的条数
recordCount;   总记录数
recordList;   本业的数据列表
beginPageIndex; 本业开始的索引
endPageIndex;  本业结束的索引
 * @author liutao-REMIX 
 *
 */
public class PageBean {
	//传递的参数 或配置的值
	private int currentPage;
	private int pageSize;
	
	//查询数据库出来
	private int recordCount;
	private List recordList;
	
	//计算出
	private int pageCount;
	private int beginPageIndex;
	private int endPageIndex;
	
	/**
	 * 结束前四个数据  计算后面三个
	 * @param currentPage
	 * @param pageSize
	 * @param recordCount
	 * @param recordList
	 */
	public PageBean(int currentPage, int pageSize, int recordCount,
			List recordList) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.recordCount = recordCount;
		this.recordList = recordList;
		//  技算pageCount
		pageCount = recordCount%pageSize == 0 ? recordCount/pageSize:recordCount/pageSize+1;
		// 计算beginPageIndex 技算endPageIndex
		//总页数不超过10也
		if(pageCount<=10){
			beginPageIndex = 1;
			endPageIndex = pageCount;
		}else{//总页数超过10页  显示当前页附近的10也
			beginPageIndex = currentPage-4;
			endPageIndex = currentPage + 5;
			if(beginPageIndex < 1){
				beginPageIndex = 1;
				endPageIndex = 10;
			}else if(endPageIndex > pageCount){
				beginPageIndex = pageCount-10+1; //在显示是包含两个边界
				endPageIndex = pageCount;
			}
		}
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public List getRecordList() {
		return recordList;
	}
	public void setRecordList(List recordList) {
		this.recordList = recordList;
	}
	public int getBeginPageIndex() {
		return beginPageIndex;
	}
	public void setBeginPageIndex(int beginPageIndex) {
		this.beginPageIndex = beginPageIndex;
	}
	public int getEndPageIndex() {
		return endPageIndex;
	}
	public void setEndPageIndex(int endPageIndex) {
		this.endPageIndex = endPageIndex;
	}
	
}
