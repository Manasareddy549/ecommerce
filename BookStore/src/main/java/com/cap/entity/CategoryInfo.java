package com.cap.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class CategoryInfo {
	@Id   
	@Column(length=12)   
	public int category_Id;
	@Column(length=50)
	public String category_Name;
	
	
	public int getCategory_Id() {
		return category_Id;
	}
	public void setCategory_Id(int category_Id) {
		this.category_Id = category_Id;
	}
	public String getCategory_Name() {
		return category_Name;
	}
	public void setCategory_Name(String category_Name) {
		this.category_Name = category_Name;
	}
	public CategoryInfo(int category_Id, String category_Name) {
		super();
		this.category_Id = category_Id;
		this.category_Name = category_Name;
	}
	public CategoryInfo() {
		super();
	}
	
}