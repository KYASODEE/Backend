package com.flightsearch;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightsearch.Repository.SearchRepository;
import com.flightsearch.controller.SearchController;



@SpringBootTest
class FlightSearchApplicationTests {
	
  @Mock
	private SearchRepository repository; 
	 @Autowired
	 private SearchController control;
	 @Test
	 void contextLoads() {

	 }
	 /*
	   @Test
		public void getFlight(){
		when(repository.findAll()).thenReturn(Stream.of(new Search("2","Note","hyd","delhi")).collect(Collectors.toList()));
		assertEquals(1,control.getBooks().size());
		}*/
  }

	
	
	
