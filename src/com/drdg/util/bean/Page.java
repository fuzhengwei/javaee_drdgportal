package com.drdg.util.bean;

public class Page {

	private int page;
	private int rows;
	private int firstResult;
	private int maxResult;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	public int getFirstResult() {
		if(page > 1){
			return (page - 1) * rows;
		}else{
			return 0;
		}
	}
	
	public int getMaxResult() {
		return getFirstResult() + rows;
	}
	
}
