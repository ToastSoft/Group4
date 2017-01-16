package com.psas.entity;

/**
 * 分页查询实体类
 * @author  Xulai Wang
 * @data:  2016-12-16 上午09:10:02
 * @version:  V1.0
 */
public class Page {
	private int start;
	private int end;
	private static final int PAGESIZE = 5;
	private int page;
	private int total;
	private int rows;

	public static int getPagesize() {
		return PAGESIZE;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getTotal() {
		this.total = rows / PAGESIZE;
		if (rows % PAGESIZE != 0) {
			this.total = this.total + 1;
		}
		return this.total;
	}

	public int getStart() {
		return (page - 1) * PAGESIZE ;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return page * PAGESIZE;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public Page(int page) {
		super();
		this.page = page;
	}

	public Page() {
		super();
	}

	@Override
	public String toString() {
		return "Page [end=" + end + ", page=" + page + ", rows=" + rows + ", start=" + start + ", total=" + total + "]";
	}

}
