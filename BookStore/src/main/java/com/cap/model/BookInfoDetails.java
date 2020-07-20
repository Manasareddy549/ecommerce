package com.cap.model;

import java.sql.Date;

public class BookInfoDetails {
	private int book_id;
	private int category_Id;
	private String category_Name;
	private String title;
	private String author;
	private String description;
	private long isbn;
	private float price;
	private Date published_Date;
	private byte[] icon;
	
	
	public String getCategory_Name() {
		return category_Name;
	}
	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Date getPublished_Date() {
		return published_Date;
	}
	public void setPublished_Date(Date published_Date) {
		this.published_Date = published_Date;
	}
	public byte[] getIcon() {
		return icon;
	}
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	public int getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}
}