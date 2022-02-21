package org.omir.euler.problem7;

import org.junit.Assert;
import org.junit.Test;

public class NthPrimeTest {

	@Test
	public void theFirstPrimeIsTwo() {
		Assert.assertEquals("The first prime number should be 2", 2, NthPrime.getNthPrime(1), 0);
	}

	@Test
	public void theSecondPrimeIsThree() {
		Assert.assertEquals("The second prime number should be 3", 3, NthPrime.getNthPrime(2), 0);
	}

	@Test
	public void theThirdPrimeIsFive() {
		Assert.assertEquals("The third prime number should be 5", 5, NthPrime.getNthPrime(3), 0);
	}

	@Test
	public void theFourthPrimeIsSeven() {
		Assert.assertEquals("The fourth prime number should be 7", 7, NthPrime.getNthPrime(4), 0);
	}

	@Test
	public void the10001stPrime() {
		Assert.assertEquals("The 10001st prime number should be 104743", 104743, NthPrime.getNthPrime(10001), 0);
	}

	@Test
	public void the100001stPrime() {
		Assert.assertEquals("The 100001st prime number should be 1299721", 1299721, NthPrime.getNthPrime(100001), 0);
	}

}
