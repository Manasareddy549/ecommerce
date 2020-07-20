package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.entity.BookInfo;

@Repository
public interface BookDaoI extends JpaRepository<BookInfo, Integer>{

	@Query("select b from BookInfo b")
	List<BookInfo> getBookNames();

}
