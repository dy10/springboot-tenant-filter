package com.example.filter.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	DocumentRepo docRepo;
	
	@Autowired
	NonFilterEntityRepo entityRepo;
	
	@GetMapping("/test")
	public String test() {
		
		List<Document> list = docRepo.findAll();
		
		List<NonFilterEntity> list2 = entityRepo.findAll();
		
		return "" + ( list.size() + list2.size() );
		
	}
}
