package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assert.true();
	}

	@Tag("fast")
	@Test
	void aSuperFastTest() {
		assert.true();
	}	
	@Tag("fast")
	@Test
	void anotherSuperFastTest() {
		assert.true();
	}	
	

	
	@Tag("slow")
	@Test
	void aSuperSlowTest() {
		assert.true();
	}	
}
