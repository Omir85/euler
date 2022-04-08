package org.omir.euler.problems10.problem10;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;

public class SummationOfPrimesTest {

	@Test
	public void sumOfPrimesBelowTwoIsTwo() {
		Assert.assertEquals(2, NumberUtils.sumOfPrimesBelow(2), 0);
	}

	@Test
	public void sumOfPrimesBelowThreeIsFive() {
		Assert.assertEquals(5, NumberUtils.sumOfPrimesBelow(3), 0);
	}

	@Test
	public void sumOfPrimesBelowFourIsFive() {
		Assert.assertEquals(5, NumberUtils.sumOfPrimesBelow(4), 0);
	}

	@Test
	public void sumOfPrimesBelowTenIsSeventeen() {
		Assert.assertEquals(17, NumberUtils.sumOfPrimesBelow(10), 0);
	}

	@Test
	public void sumOfPrimesBelowOtherNumbers() {
		Assert.assertEquals(5736396, NumberUtils.sumOfPrimesBelow(10000), 0);
		Assert.assertEquals(6848586, NumberUtils.sumOfPrimesBelow(11000), 0);
		Assert.assertEquals(8034435, NumberUtils.sumOfPrimesBelow(12000), 0);
		Assert.assertEquals(9397192, NumberUtils.sumOfPrimesBelow(13000), 0);
		Assert.assertEquals(10814591, NumberUtils.sumOfPrimesBelow(14000), 0);
		Assert.assertEquals(12295969, NumberUtils.sumOfPrimesBelow(15000), 0);
		Assert.assertEquals(13969505, NumberUtils.sumOfPrimesBelow(16000), 0);
	}
	
	@Test
	public void sumOfPrimesBelowTwoMillion() {
		Assert.assertEquals(142913828922d, SummationOfPrimes.sumOfPrimesBelowTwoMillion(), 0);
	}
	
	@Test
	public void displaySolution() {
		Assert.assertEquals(SummationOfPrimes.SOLUTION_PREFIX + "142913828922", SummationOfPrimes.displaySolution());
	}
	
	@Test
	public void main() {
		SummationOfPrimes.main(null);
	}

}
