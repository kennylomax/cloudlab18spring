package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		assertTrue(true);
	}

	@Tag("fast")
	@Test
	void aSuperFastTest() {
		assertTrue(true);
	}	
	@Tag("fast")
	@Test
	void anotherSuperFastTest() {
		assertTrue(true);
	}	
	

	
	@Tag("slow")
	@Test
	void aSuperSlowTest() {
		assertTrue(true);
	}	
}
