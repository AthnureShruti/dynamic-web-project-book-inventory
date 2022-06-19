package com.LibraryBookDao;

public class LibraryBookDao {
	int borrow_no;
	String name;
	String author;
	String category;
	String issue_date;
	String return_date;
	
	public int getBorrow_no() {
		return borrow_no;
	}
	public void setBorrow_no(int borrow_no) {
		this.borrow_no = borrow_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getReturn_date() {
		return return_date;
	}
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
