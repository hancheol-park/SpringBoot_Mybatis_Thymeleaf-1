package com.iu.s1.util;

public class Pager {
	
	private Long curPage;
	private Long perPage;
	
	private Long startRow;
	
	public void makeRow() {
		// curPage 	 	startRow
		// 1			0
		// 2			10
		// 3			20
		this.startRow = (this.getCurPage()-1)*this.getPerPage(); 
	}

	public Long getCurPage() {
		if(this.curPage == null || this.curPage==0) {
			this.curPage=1L;
		}
		return curPage;
	}

	public void setCurPage(Long curPage) {
		if(curPage == null || curPage==0) {
			this.curPage=1L;
		}else {
			this.curPage = curPage;
		}
	}

	public Long getPerPage() {
		if(this.perPage == null || this.perPage==0) {
			this.perPage=10L;
		}
		return perPage;
	}

	public void setPerPage(Long perPage) {
		if(perPage==null || perPage==0) {
			this.perPage=10L;
		}else {
			this.perPage = perPage;
		}
	}

	public Long getStartRow() {
		return startRow;
	}

	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	
	

}
