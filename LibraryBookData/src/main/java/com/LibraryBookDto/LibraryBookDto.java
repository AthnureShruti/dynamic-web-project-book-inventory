package com.LibraryBookDto;

import java.util.Date;

public class LibraryBookDto {
	int borrow_no;
	

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

	

	String name;
	String author;
	String category;
	Date issue_date;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Date getIssue_date() {
		return issue_date;
	}

	public void setIssue_date(Date issue_date) {
		this.issue_date = issue_date;
	}

}
