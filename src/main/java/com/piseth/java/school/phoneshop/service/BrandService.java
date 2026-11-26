package com.piseth.java.school.phoneshop.service;

import com.piseth.java.school.phoneshop.entity.Brand;

public interface BrandService {
	Brand create(Brand brand);
	Brand getById(Integer id);
	Brand update(Integer id, Brand brandUpdate);
}

// service mean business layer