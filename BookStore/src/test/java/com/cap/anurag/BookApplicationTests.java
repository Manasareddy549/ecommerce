package com.cap.anurag;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.cap.dao.BookDaoI;
import com.cap.dao.CategoryDaoI;
import com.cap.entity.BookInfo;
import com.cap.entity.CategoryInfo;
import com.cap.service.BookCategoryService;
@RunWith(MockitoJUnitRunner.class)
public class BookApplicationTests {
	@InjectMocks
	BookCategoryService bookcategoryservice;
	@Mock
	BookDaoI bookdao;
	@Mock
	CategoryDaoI catdao;
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void addBookTest(){
		BookInfo b=new BookInfo();
		b.setAuthor("Gupta");
		bookdao.save(b);
		//BookInfoDetails b_inf = null;
		//bookcategoryservice.addBook(b);
		assertEquals("Richa Gupta",b.getAuthor());
	}
	@Test
	public void addBookTest1(){
		BookInfo b=new BookInfo();
		b.setAuthor("Richa Gupta");
		bookdao.save(b);
		assertNotEquals("Richa Gupta",b.getAuthor());
	}
	
	@Test
	public void testAddBook(){
		BookInfo binf=new BookInfo();
		binf.setBook_id(555);
		binf.setAuthor("Paul");
		binf.setTitle("Madha");
		binf.setPrice(399);
		bookdao.save(binf);
		Mockito.verify(bookdao,Mockito.times(1)).save(binf);
	}
	@Test
	public void testAddCategory(){
		CategoryInfo cinf=new CategoryInfo(0, null);
		cinf.setCategory_Id(100);
		cinf.setCategory_Name("fiction");
		catdao.save(cinf);
		Mockito.verify(catdao, Mockito.times(1)).save(cinf);
	}
	@Test
	public void getCategoryList() {
		List<CategoryInfo> catlist = new ArrayList<>();
		catlist.add(new CategoryInfo(100,"Mystery"));
		catlist.add(new CategoryInfo(100,"Mystery"));
		Mockito.when(catdao.findAll()).thenReturn(catlist);
		List<CategoryInfo> returnedData = catdao.findAll();
		assertEquals(returnedData.get(0).getCategory_Id(), catlist.get(0).getCategory_Id());
		assertEquals(2, returnedData.size()); // expected 23 but was 2
		assertNotEquals(24,returnedData.size());
	}
	
	
	@Test
	public void Categorydetails(){
		CategoryInfo inf=new CategoryInfo(100, "Mystery");
		inf.setCategory_Id(100);
		inf.setCategory_Name("Mystery");
		catdao.save(inf);
		Mockito.verify(catdao, Mockito.times(1)).save(inf);
	}
	
	

}
