package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Tag("fast")
	@Test
	void aSuperFastTest() {
	}	
	@Tag("fast")
	@Test
	void anotherSuperFastTest() {
	}	
	

	
	@Tag("slow")
	@Test
	void aSuperSlowTest() {
	}	
}
