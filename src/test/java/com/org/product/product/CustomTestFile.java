package com.org.product.product;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomTestFile {

	@Test
	void test() {
		assertEquals("Test", "Test");
	}

	@Test
	public void testEqualValue() {
		assertEquals("Test", "Test");
	}
}
