package org.omir.euler.problem3;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;

public class LargestPrimeFactorTest {

	@Test
	public void largestPrimeFactorOfSixShouldBeThree() {
		Assert.assertEquals(
				"Largest prime factors of six should be two and three",
				3,
				NumberUtils.largestPrimeFactorOf(6),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfNineShouldBeThree() {
		Assert.assertEquals(
				"Largest prime factors of nine should be three",
				3,
				NumberUtils.largestPrimeFactorOf(9),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfTenShouldBeFive() {
		Assert.assertEquals(
				"Largest prime factors of ten should be five",
				5,
				NumberUtils.largestPrimeFactorOf(10),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfFourteenShouldBeSeven() {
		Assert.assertEquals(
				"Largest prime factors of fourteen should be seven",
				7,
				NumberUtils.largestPrimeFactorOf(14),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfSevenShouldBeSeven() {
		Assert.assertEquals(
				"Largest prime factors of fourteen should be seven",
				7,
				NumberUtils.largestPrimeFactorOf(7),
				0
		);
	}
	
	@Test
	public void largestPrimeFactorOf82933311Is27644437() {
		Assert.assertEquals(
				"Largest prime factors of fourteen should be seven",
				27644437,
				NumberUtils.largestPrimeFactorOf(82933311),
				0
		);
	}

	@Test
	public void oneIsPrime() {
		Assert.assertTrue("1 should be prime", NumberUtils.isPrime(1));
	}

	@Test
	public void twoIsPrime() {
		Assert.assertTrue("2 should be prime", NumberUtils.isPrime(2));
	}

	@Test
	public void sevenIsPrime() {
		Assert.assertTrue("7 should be prime", NumberUtils.isPrime(7));
	}

	@Test
	public void nineIsNotPrime() {
		Assert.assertFalse("9 should not be prime", NumberUtils.isPrime(9));
	}

}
