package com.piseth.java.school.phoneshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piseth.java.school.phoneshop.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{
	
}



// Repository mean database communication (save, select, update..)