package com.dagim.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Library {
	
	@Id
	private String bookIsbn;
	private String bookTitle;
	
	public Library(){
		
	}
	public Library(String bookIsbn, String bookTitle) {
		super();
		this.bookIsbn = bookIsbn;
		this.bookTitle = bookTitle;
	}
	public String getBookIsbn() {
		return bookIsbn;
	}
	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	@Override
	public String toString() {
		return "Library [bookIsbn=" + bookIsbn + ", bookTitle=" + bookTitle + "]";
	}

	
}
