package org.omir.euler.problems1.problem1;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;

public class MultiplesOf3Or5Test {

	@Test
	public void threeShouldBeAMultipleOfThree() {
		Assert.assertTrue("3 should be a multiple of 3", NumberUtils.isNumberMultipleOf(3, 3));
	}

	@Test
	public void sixShouldBeAMultipleOfThree() {
		Assert.assertTrue("6 should be a multiple of 3", NumberUtils.isNumberMultipleOf(6, 3));
	}

	@Test
	public void fiveShouldNotBeAMultipleOfThree() {
		Assert.assertFalse("5 should not be a multiple of 3", NumberUtils.isNumberMultipleOf(5, 3));
	}

	@Test
	public void fiveShouldBeAMultipleOfFive() {
		Assert.assertTrue("5 should be a multiple of 5", NumberUtils.isNumberMultipleOf(5, 5));
	}

	@Test
	public void threeShouldNotBeAMultipleOfFive() {
		Assert.assertFalse("3 should not be a multiple of 5", NumberUtils.isNumberMultipleOf(3, 5));
	}

	@Test
	public void tenShouldBeAMultipleOfFive() {
		Assert.assertTrue("10 should be a multiple of 5", NumberUtils.isNumberMultipleOf(10, 5));
	}

	@Test
	public void fifteenShouldBeAMultipleOfEitherThreeOrFive() {
		Assert.assertTrue("15 should be a multiple of either 3 or 5", NumberUtils.isMultipleOfEitherNumber(15, 3, 5));
	}

	@Test
	public void oneShouldNotBeAMultipleOfNoNumber() {
		Assert.assertFalse("1 should not be a multiple of no number", NumberUtils.isMultipleOfEitherNumber(1));
	}

	@Test
	public void fourteenShouldNotBeAMultipleOfEitherThreeOrFive() {
		Assert.assertFalse("15 should be a multiple of either 3 or 5", NumberUtils.isMultipleOfEitherNumber(14, 3, 5));
	}

	@Test
	public void sevenShouldNotBeAMultipleOfThreeOrFive() {
		Assert.assertFalse("7 should not be a multiple of 3 or 5", NumberUtils.isMultipleOfEitherNumber(7, 3, 5));
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowFiveShouldBe3() {
		int sum = NumberUtils.sumOfAllMultiplesOfEitherNumberBelow(5, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 5 should be 3", 3, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowTenShouldBe23() {
		int sum = NumberUtils.sumOfAllMultiplesOfEitherNumberBelow(10, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 10 should be 23", 3 + 5 + 6 + 9, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowFifteenShouldBe() {
		int sum = NumberUtils.sumOfAllMultiplesOfEitherNumberBelow(15, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 10 should be 23", 3 + 5 + 6 + 9 + 10 + 12, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowOneThousandShouldBe233168() {
		int sum = NumberUtils.sumOfAllMultiplesOfEitherNumberBelow(1000, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 1000 should be 233168", 233168, sum);
	}

}
