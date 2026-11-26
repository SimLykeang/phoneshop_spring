package com.piseth.java.school.phoneshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.piseth.java.school.phoneshop.dto.BrandDTO;
import com.piseth.java.school.phoneshop.entity.Brand;
import com.piseth.java.school.phoneshop.service.BrandService;
import com.piseth.java.school.phoneshop.service.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
		Brand brand = Mapper.toBrand(brandDTO);
		brand = brandService.create(brand);
		return ResponseEntity.ok(Mapper.toBrandDTo(brand));
	}
}


// Controller mean API end point
// @RestController => *Tells Spring that this class handles REST API requests and returns response data.
// @RequestMapping("brands") => *Defines the common URL for this controller.

//***** This is Dependency Injection ******.
// 	@Autowired
//  private BrandService brandService;

// @RequestBody BrandDTO brandDTO => This tells Spring to receive JSON data from the request body and convert it into a Java BrandDTO object.
// Mapper.toBrand(brandDTO) => Converts the DTO object into an Entity object.
// brandService.create(brand) => Sends the Brand entity to the service layer to save it.
// ResponseEntity.ok(...) => Returns an HTTP response with status 200 OK and the converted DTO as the response body.






