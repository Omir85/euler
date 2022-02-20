package org.omir.euler.problem4;

import org.omir.euler.utils.string.StringUtils;

/**
 * <pre>
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class LargestPalindromeProduct {

	private static final String RESULT_TEMPLATE = "The largest palindrome made from the product of two 3-digit numbers is %s and it is the product of %s and %s";

	public static void main(String[] args) {
		int largestPalindromeProductOfTwoThreeDigitNumbers = 0;
		int solutionI = 0;
		int solutionJ = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				int product = i * j;
				if (StringUtils.isPalindrome(product)) {
					if (product > largestPalindromeProductOfTwoThreeDigitNumbers) {
						largestPalindromeProductOfTwoThreeDigitNumbers = product;
						solutionI = i;
						solutionJ = j;
					}
				}
			}
		}
		System.out.println(
				String.format(
						RESULT_TEMPLATE,
						largestPalindromeProductOfTwoThreeDigitNumbers,
						solutionI,
						solutionJ
				)
		);
	}

}
