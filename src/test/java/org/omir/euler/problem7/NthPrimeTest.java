package org.omir.euler.problem7;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;

public class NthPrimeTest {

	@Test
	public void theFirstPrimeIsTwo() {
		Assert.assertEquals("The first prime number should be 2", 2, NumberUtils.getNthPrime(1), 0);
	}

	@Test
	public void theSecondPrimeIsThree() {
		Assert.assertEquals("The second prime number should be 3", 3, NumberUtils.getNthPrime(2), 0);
	}

	@Test
	public void theThirdPrimeIsFive() {
		Assert.assertEquals("The third prime number should be 5", 5, NumberUtils.getNthPrime(3), 0);
	}

	@Test
	public void theFourthPrimeIsSeven() {
		Assert.assertEquals("The fourth prime number should be 7", 7, NumberUtils.getNthPrime(4), 0);
	}

	@Test
	public void the10001stPrime() {
		Assert.assertEquals("The 10001st prime number should be 104743", 104743, NumberUtils.getNthPrime(10001), 0);
	}

	@Test
	public void the100001stPrime() {
		Assert.assertEquals("The 100001st prime number should be 1299721", 1299721, NumberUtils.getNthPrime(100001), 0);
	}

}
