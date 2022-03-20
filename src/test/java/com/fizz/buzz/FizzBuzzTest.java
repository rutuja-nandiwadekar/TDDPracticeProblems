package com.fizz.buzz;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
	private FizzBuzz fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void testNumber() {
		int number = 1;
		String numberReturned = fizzBuzz.play(number);
		assertEquals("1", numberReturned);
	}

	@Test
	public void testFizz() {
		int number = 3;
		String numberReturned = fizzBuzz.play(number);
		assertEquals("Fizz", numberReturned);
	}

	@Test
	public void testFizzDivisibleBy3() {
		int number = 6;
		String numberReturned = fizzBuzz.play(number);
		assertEquals("Fizz", numberReturned);
	}

	@Test
	public void testBuzz() {
		int number = 5;
		String numberReturned = fizzBuzz.play(number);
		assertEquals("Buzz", numberReturned);
	}

	@Test
	public void testBuzzDivisibleBy5() {
		int number = 10;
		String numberReturned = fizzBuzz.play(number);
		assertEquals("Buzz", numberReturned);
	}
}
