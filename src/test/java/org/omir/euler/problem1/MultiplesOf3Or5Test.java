package org.omir.euler.problem1;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesOf3Or5Test {

	@Test
	public void threeShouldBeAMultipleOfThree() {
		Assert.assertTrue("3 should be a multiple of 3", MultiplesOf3Or5.isNumberMultipleOf(3, 3));
	}

	@Test
	public void sixShouldBeAMultipleOfThree() {
		Assert.assertTrue("6 should be a multiple of 3", MultiplesOf3Or5.isNumberMultipleOf(6, 3));
	}

	@Test
	public void fiveShouldNotBeAMultipleOfThree() {
		Assert.assertTrue("5 should not be a multiple of 3", !MultiplesOf3Or5.isNumberMultipleOf(5, 3));
	}

	@Test
	public void fiveShouldBeAMultipleOfFive() {
		Assert.assertTrue("5 should be a multiple of 5", MultiplesOf3Or5.isNumberMultipleOf(5, 5));
	}

	@Test
	public void threeShouldNotBeAMultipleOfFive() {
		Assert.assertTrue("3 should not be a multiple of 5", !MultiplesOf3Or5.isNumberMultipleOf(3, 5));
	}

	@Test
	public void tenShouldBeAMultipleOfFive() {
		Assert.assertTrue("10 should be a multiple of 5", MultiplesOf3Or5.isNumberMultipleOf(10, 5));
	}

	@Test
	public void fifteenShouldBeAMultipleOfEitherThreeOrFive() {
		Assert.assertTrue("15 should be a multiple of either 3 or 5", MultiplesOf3Or5.isMultipleOfEitherNumber(15, 3, 5));
	}

	@Test
	public void OneShouldNotBeAMultipleOfNoNumber() {
		Assert.assertTrue("1 should not be a multiple of no number", !MultiplesOf3Or5.isMultipleOfEitherNumber(1));
	}

	@Test
	public void fourteenShouldNotBeAMultipleOfEitherThreeOrFive() {
		Assert.assertTrue("15 should be a multiple of either 3 or 5", !MultiplesOf3Or5.isMultipleOfEitherNumber(14, 3, 5));
	}

	@Test
	public void sevenShouldNotBeAMultipleOfThreeOrFive() {
		Assert.assertTrue("7 should not be a multiple of 3 or 5", !MultiplesOf3Or5.isMultipleOfEitherNumber(7, 3, 5));
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowFiveShouldBe3() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfEitherNumberBelow(5, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 5 should be 3", 3, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowTenShouldBe23() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfEitherNumberBelow(10, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 10 should be 23", 3 + 5 + 6 + 9, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowFifteenShouldBe() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfEitherNumberBelow(15, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 10 should be 23", 3 + 5 + 6 + 9 + 10 + 12, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowOneThousandShouldBe233168() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfEitherNumberBelow(1000, 3, 5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 1000 should be 233168", 233168, sum);
	}

}
