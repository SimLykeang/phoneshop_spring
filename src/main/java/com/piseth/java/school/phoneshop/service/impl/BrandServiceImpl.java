package com.piseth.java.school.phoneshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piseth.java.school.phoneshop.entity.Brand;
import com.piseth.java.school.phoneshop.repository.BrandRepository;
import com.piseth.java.school.phoneshop.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService{
	
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand create(Brand brand) {
		return brandRepository.save(brand);
	}

}
