package org.omir.euler.problem1;

import org.junit.Assert;
import org.junit.Test;

public class MultiplesOf3Or5Test {

	@Test
	public void threeShouldBeAMultipleOfThree() {
		Integer three = 3;
		Assert.assertTrue("3 should be a multiple of 3", MultiplesOf3Or5.isMultipleOf3(three));
	}

	@Test
	public void sixShouldBeAMultipleOfThree() {
		Integer six = 6;
		Assert.assertTrue("6 should be a multiple of 3", MultiplesOf3Or5.isMultipleOf3(six));
	}

	@Test
	public void fiveShouldNotBeAMultipleOfThree() {
		Integer five = 5;
		Assert.assertTrue("5 should not be a multiple of 3", !MultiplesOf3Or5.isMultipleOf3(five));
	}

	@Test
	public void fiveShouldBeAMultipleOfFive() {
		Integer five = 5;
		Assert.assertTrue("5 should be a multiple of 5", MultiplesOf3Or5.isMultipleOf5(five));
	}

	@Test
	public void threeShouldNotBeAMultipleOfFive() {
		Integer three = 3;
		Assert.assertTrue("3 should not be a multiple of 5", !MultiplesOf3Or5.isMultipleOf5(three));
	}

	@Test
	public void tenShouldBeAMultipleOfFive() {
		Integer ten = 10;
		Assert.assertTrue("10 should be a multiple of 5", MultiplesOf3Or5.isMultipleOf5(ten));
	}

	@Test
	public void fifteenShouldBeAMultipleOfThreeAndFive() {
		Integer fifteen = 15;
		Assert.assertTrue("15 should be a multiple of 3 or 5", MultiplesOf3Or5.isMultipleOf3Or5(fifteen));
	}

	@Test
	public void sevenShouldNotBeAMultipleOfThreeAndFive() {
		Integer seven = 7;
		Assert.assertTrue("7 should not be a multiple of 3 or 5", !MultiplesOf3Or5.isMultipleOf3Or5(seven));
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowFiveShouldBe8() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfThreeOrFiveBelow(5);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 5 should be 8", 3, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowTenShouldBe23() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfThreeOrFiveBelow(10);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 10 should be 23", 3 + 5 + 6 + 9, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowFifteenShouldBe() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfThreeOrFiveBelow(15);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 10 should be 23", 3 + 5 + 6 + 9 + 10 + 12, sum);
	}

	@Test
	public void sumOfAllMultiplesOfThreeOrFiveBelowOneThousandShouldBe233168() {
		int sum = MultiplesOf3Or5.sumOfAllMultiplesOfThreeOrFiveBelow(1000);
		Assert.assertEquals("Sum of all the multiples of 3 or 5 below 1000 should be 234168", 233168, sum);
	}

}
