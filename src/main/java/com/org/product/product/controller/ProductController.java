package com.org.product.product.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	
	@GetMapping(value = "/welcome")
	public String getHelloMessage(String name) {
		if(null == name)
			name=" Bunny";
		return "Hello "+name;
	}
	
	
	@GetMapping(value = "/")
	public Map<String,String> getProducts() {
		Map<String,String> products = new HashMap<>();
		products.put("Laptop", "Dell");
		products.put("TV", "Samsung Smart Tv");
		products.put("Mobile", "Sasmsung");
		products.put("Furniture", "Fern & Patel");
		products.put("Electronics", "Anchor");
		return products;
	}
}
