package org.omir.euler.problem4;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;
import org.omir.euler.utils.string.StringUtils;

public class LargestPalindromeProductTest {

	@Test
	public void number9009IsAPalindrome() {
		Assert.assertTrue("9009 should be a palindrome", StringUtils.isPalindrome(9009));
	}

	@Test
	public void number90109IsAPalindrome() {
		Assert.assertTrue("90109 should be a palindrome", StringUtils.isPalindrome(90109));
	}

	@Test
	public void number9001IsNotAPalindrome() {
		Assert.assertFalse("9001 should not be a palindrome", StringUtils.isPalindrome(9001));
	}

	@Test
	public void number906609IsTheLargestPalindromeProductOfTwoThreeDigitNumbers() {
		Assert.assertEquals(906609, NumberUtils.computeLargestPalindromeProduct()[0]);
	}

}
