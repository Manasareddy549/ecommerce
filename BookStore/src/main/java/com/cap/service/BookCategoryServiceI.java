package com.cap.service;

import java.util.List;

import com.cap.entity.BookInfo;
import com.cap.entity.CategoryInfo;
import com.cap.model.BookInfoDetails;

public interface BookCategoryServiceI {

	BookInfoDetails addBook(BookInfoDetails b_info);

	CategoryInfo addCategory(CategoryInfo cate_info);

	List<CategoryInfo> getCategoryNames();

	List<BookInfo> getBookNames();

	CategoryInfo updateCategory(CategoryInfo c1) ;

	BookInfo updateBook(BookInfo b1)  ;
	
	void deleteCategory(int id);

	void deleteBook(int id);
	

}
