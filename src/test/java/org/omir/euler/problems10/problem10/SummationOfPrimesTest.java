package org.omir.euler.problems10.problem10;

import org.junit.Assert;
import org.junit.Test;

public class SummationOfPrimesTest {

	@Test
	public void sumOfPrimesBelowTwoIsTwo() {
		Assert.assertEquals(2, SummationOfPrimes.sumOfPrimesBelow(2), 0);
	}

	@Test
	public void sumOfPrimesBelowThreeIsFive() {
		Assert.assertEquals(5, SummationOfPrimes.sumOfPrimesBelow(3), 0);
	}

	@Test
	public void sumOfPrimesBelowFourIsFive() {
		Assert.assertEquals(5, SummationOfPrimes.sumOfPrimesBelow(4), 0);
	}

	@Test
	public void sumOfPrimesBelowTenIsSeventeen() {
		Assert.assertEquals(17, SummationOfPrimes.sumOfPrimesBelow(10), 0);
	}

	@Test
	public void sumOfPrimesBelowOtherNumbers() {
		Assert.assertEquals(5736396, SummationOfPrimes.sumOfPrimesBelow(10000), 0);
		Assert.assertEquals(6848586, SummationOfPrimes.sumOfPrimesBelow(11000), 0);
		Assert.assertEquals(8034435, SummationOfPrimes.sumOfPrimesBelow(12000), 0);
		Assert.assertEquals(9397192, SummationOfPrimes.sumOfPrimesBelow(13000), 0);
		Assert.assertEquals(10814591, SummationOfPrimes.sumOfPrimesBelow(14000), 0);
		Assert.assertEquals(12295969, SummationOfPrimes.sumOfPrimesBelow(15000), 0);
		Assert.assertEquals(13969505, SummationOfPrimes.sumOfPrimesBelow(16000), 0);
	}

}
