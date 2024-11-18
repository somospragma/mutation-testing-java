package com.pragma.mutation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private  Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertEquals(5, calculator.add(2, 3), "The add method should return the correct sum.");
	}

	@Test
	void testSubtract() {
		assertEquals(1, calculator.subtract(3, 2), "The subtract method should return the correct difference.");
	}

	@Test
	void testMultiply() {
		assertEquals(6, calculator.multiply(2, 3), "The multiply method should return the correct product.");
	}

	@Test
	void testDivide() {
		assertEquals(2, calculator.divide(6, 3), "The divide method should return the correct quotient.");
	}

	@Test
	void testDivideByZeroThrowsException() {
		Exception exception = assertThrows(CalculatorException.class, () -> calculator.divide(6, 0));
		assertEquals("Division by zero is not allowed", exception.getMessage(), "Exception message should match.");
	}
}
