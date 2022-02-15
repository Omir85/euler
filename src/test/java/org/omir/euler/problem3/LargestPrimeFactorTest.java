package org.omir.euler.problem3;

import org.junit.Assert;
import org.junit.Test;

public class LargestPrimeFactorTest {

	@Test
	public void largestPrimeFactorOfSixShouldBeThree() {
		Assert.assertEquals(
				"Largest prime factors of six should be two and three",
				3,
				LargestPrimeFactor.largestPrimeFactorOf(6),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfNineShouldBeThree() {
		Assert.assertEquals(
				"Largest prime factors of nine should be three",
				3,
				LargestPrimeFactor.largestPrimeFactorOf(9),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfTenShouldBeFive() {
		Assert.assertEquals(
				"Largest prime factors of ten should be five",
				5,
				LargestPrimeFactor.largestPrimeFactorOf(10),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfFourteenShouldBeSeven() {
		Assert.assertEquals(
				"Largest prime factors of fourteen should be seven",
				7,
				LargestPrimeFactor.largestPrimeFactorOf(14),
				0
		);
	}

	@Test
	public void largestPrimeFactorsOfSevenShouldBeSeven() {
		Assert.assertEquals(
				"Largest prime factors of fourteen should be seven",
				7,
				LargestPrimeFactor.largestPrimeFactorOf(7),
				0
		);
	}

	@Test
	public void oneIsPrime() {
		Assert.assertTrue("1 should be prime", LargestPrimeFactor.isPrime(1));
	}

	@Test
	public void twoIsPrime() {
		Assert.assertTrue("2 should be prime", LargestPrimeFactor.isPrime(2));
	}

	@Test
	public void sevenIsPrime() {
		Assert.assertTrue("7 should be prime", LargestPrimeFactor.isPrime(7));
	}

	@Test
	public void nineIsNotPrime() {
		Assert.assertFalse("9 should not be prime", LargestPrimeFactor.isPrime(9));
	}

}
