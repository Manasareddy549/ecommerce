package com.cap.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.dao.BookDaoI;
import com.cap.dao.CategoryDaoI;
import com.cap.entity.BookInfo;
import com.cap.entity.CategoryInfo;
import com.cap.exceptions.InvalidBookDetails;
import com.cap.exceptions.InvalidBookId;
import com.cap.exceptions.InvalidCategoryDetails;
import com.cap.exceptions.InvalidCategoryId;
import com.cap.exceptions.InvalidNameException;
import com.cap.model.BookInfoDetails;
@Service
@Transactional
public class BookCategoryService implements BookCategoryServiceI {

	@Autowired
	private BookDaoI book_dao;

	@Autowired
	private CategoryDaoI cat_dao;

	@Override
	public CategoryInfo addCategory(CategoryInfo cate_info) throws Exception {
		if( cate_info.getCategory_Name()!="" && cate_info.getCategory_Id()>0)
			return cat_dao.save(cate_info);
		else if(cate_info.getCategory_Name()=="" && cate_info.getCategory_Id()>0)
			throw new InvalidNameException("Name should not be null");
		else if(cate_info.getCategory_Id()<=0 && cate_info.getCategory_Name()!="")
			throw new InvalidCategoryId("Category id should not be 0 or less than 0");	
		else if(cate_info.getCategory_Id()<=0 && cate_info.getCategory_Name()=="")
			throw new InvalidCategoryDetails("Id and Name can't be 0 and null");
		else
			return null;
	}
	
	@Override
	public BookInfoDetails addBook(BookInfoDetails b_info) throws Exception {
		Boolean bool = cat_dao.existsById(b_info.getCategory_Id());
		if (bool) {
				Optional<CategoryInfo> c = cat_dao.findById(b_info.getCategory_Id());
				BookInfo book_info = new BookInfo();
				book_info.setCategory_info(c.get());
				book_info.setAuthor(b_info.getAuthor());
				book_info.setCategory_Name(b_info.getCategory_Name());
				book_info.setDescription(b_info.getDescription());
				book_info.setIcon(b_info.getIcon());
				book_info.setIsbn(b_info.getIsbn());
				book_info.setPrice(b_info.getPrice());
				book_info.setPublished_Date(b_info.getPublished_Date());
				book_info.setTitle(b_info.getTitle());
				book_info = book_dao.save(book_info);
				if( book_info.getTitle()!="" && book_info.getBook_id()>0)
					return b_info; 
				//book_dao.save(book_info);
				else if(book_info.getTitle()=="" &&book_info.getBook_id()>0)
					throw new InvalidNameException("Name should not be null");
				else if(book_info.getBook_id()<=0 && book_info.getTitle()!="")
					throw new InvalidBookId("Book id should not be 0 or less than 0");	
				else if(book_info.getBook_id()<=0 && book_info.getTitle()=="")
					throw new InvalidBookDetails("Id and Name can't be 0 and null");
				else
					return null;
			}
		return b_info;
		
	}

	// Displaying Category Names
	@Override
	public List<CategoryInfo> getCategoryNames() {
		return cat_dao.getCityNames();
	}

	@Override
	public List<BookInfo> getBookNames() {
		return book_dao.getBookNames();
	}

	@Override
	public CategoryInfo updateCategory(CategoryInfo c1) {
		return cat_dao.save(c1);
	}

	@Override
	public BookInfo updateBook(BookInfo b1) {
		return book_dao.save(b1);

	}

	@Override
	public void deleteCategory(int id) throws Exception {
		if(id!=0)
		cat_dao.deleteById(id);
		else if(id==0)
			throw new InvalidCategoryId("Category id should not be 0 or less than 0");
	}

	@Override
	public void deleteBook(int id) throws Exception{
		if(id!=0)
		book_dao.deleteById(id);
		else if(id==0)
			throw new InvalidBookId("Book id should not be 0 or less than 0");
	}
}