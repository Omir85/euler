package org.omir.euler.problem2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class EvenFibonacciNumbersTest {

	@Test
	public void twoShouldBeEven() {
		Assert.assertTrue("2 should be even", EvenFibonacciNumbers.isEven(2));
	}

	@Test
	public void threeShouldNotBeEven() {
		Assert.assertFalse("3 should not be even", EvenFibonacciNumbers.isEven(3));
	}

	@Test
	public void first2FibonacciNumbersShouldBe1_2() {
		int[] expecteds = { 1, 2 };
		Assert.assertArrayEquals(expecteds, EvenFibonacciNumbers.getFibonacciNumbers(2));
	}

	@Test
	public void first3FibonacciNumbersShouldBe1_2_3() {
		int[] expecteds = { 1, 2, 3 };
		Assert.assertArrayEquals(expecteds, EvenFibonacciNumbers.getFibonacciNumbers(3));
	}

	@Test
	public void first4FibonacciNumbersShouldBe1_2_3_5() {
		int[] expecteds = { 1, 2, 3, 5 };
		Assert.assertArrayEquals(expecteds, EvenFibonacciNumbers.getFibonacciNumbers(4));
	}

	@Test
	public void first10FibonacciNumbersShouldBe1_2_3_5_8_13_21_34_55_89() {
		int[] expecteds = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 };
		Assert.assertArrayEquals(expecteds, EvenFibonacciNumbers.getFibonacciNumbers(10));
	}

	@Test
	public void firstFibonacciNumbersBelowFiveShouldBe1_2_3() {
		int[] expecteds = { 1, 2, 3 };
		Assert.assertArrayEquals(expecteds, EvenFibonacciNumbers.getFibonacciNumbersBelow(5));
	}

	@Test
	public void firstFibonacciNumbersBelowFiftyShouldBe1_2_3_5_8_13_21_34() {
		int[] expecteds = { 1, 2, 3, 5, 8, 13, 21, 34 };
		Assert.assertArrayEquals(expecteds, EvenFibonacciNumbers.getFibonacciNumbersBelow(50));
	}

	@Test
	public void sumOfEvenFibonacciTermsBelowFourMillionShouldBe4613732() {
		Assert.assertEquals(4613732, EvenFibonacciNumbers.getSumOfEvenFibonacciTermsBelow(4000000));
	}

	@Test
	public void testCastArrayToListOfOneElement() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		Assert.assertEquals(expected.size(), EvenFibonacciNumbers.castArrayToList(new int[] { 1 }).size());
	}

	@Test
	public void testCastArrayToListOfTwoElement() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		Assert.assertEquals(expected.size(), EvenFibonacciNumbers.castArrayToList(new int[] { 1, 2 }).size());
	}

}