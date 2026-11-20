package com.piseth.java.school.phoneshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="brands")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="brand_id")
	private Integer id;
	@Column(name="brand_name")
	private String name;
}

// NOTE: 
// When we use @Data from lombok mean lombok will automatically generates getter, setter, toString() method ......
// When Spring Boot starts, JPA/Hibernate sees @Entity and treats that class as a database table. so it mean use for database table
// @Id mean 
// @GeneratedValue mean




// Entity mean store in database

