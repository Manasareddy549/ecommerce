package com.cap.entity;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
@Entity
public class BookInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(length=3)
	private int book_id;
	@Column(length=20)
	private String category_Name;
	@Column(length=20)
	private String title;
	@Column(length=20)
	private String author;
	@Column(length=200)
	private String description;
	@Column(length=10)
	private long isbn;
	@Column(length=10)
	private float price;
	@Column(name="published_date",length=20)
	private Date published_Date;
	@Lob
	@Column
	@Basic(fetch = FetchType.LAZY)
	private byte[] icon;
	@ManyToOne(optional = false)
	@JoinColumn(name="CATEGORY_ID")
	private CategoryInfo category_info;
	
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
	public CategoryInfo getCategory_info() {
		return category_info;
	}
	public void setCategory_info(CategoryInfo category_info) {
		this.category_info = category_info;
	}
}