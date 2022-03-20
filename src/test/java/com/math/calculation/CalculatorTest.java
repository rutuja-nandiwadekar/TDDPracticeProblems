package com.math.calculation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calci;

	@Before
	public void setup() {
		calci = new Calculator();
	}

	@Test
	public void addTest() {
		int sum = calci.add(3, 6);
		assertEquals(9, sum);
	}

	@Test
	public void subTest() {
		int sub = calci.sub(10, 5);
		assertEquals(5, sub);
	}

	@Test
	public void mulTest() {
		int mul = calci.mul(10, 5);
		assertEquals(50, mul);
	}

	@Test
	public void divTest() {
		int div = calci.div(10, 5);
		assertEquals(2, div);
	}
}
