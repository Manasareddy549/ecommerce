package com.cap.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.entity.CategoryInfo;

@Repository
public interface CategoryDaoI extends JpaRepository<CategoryInfo, Integer>{
	@Query("select c from CategoryInfo c")
	List<CategoryInfo> getCityNames();

}
