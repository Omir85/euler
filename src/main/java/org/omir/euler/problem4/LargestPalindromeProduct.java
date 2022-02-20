package org.omir.euler.problem4;

import org.omir.euler.utils.math.NumberUtils;

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

	private static final String LARGEST_PALINDROME_PRODUCT_RESULT_TEMPLATE = "The largest palindrome made from the product of two 3-digit numbers is %s and it is the product of %s and %s";

	public static void main(String[] args) {
		int[] results = NumberUtils.computeLargestPalindromeProduct();
		System.out.println(
				String.format(
						LARGEST_PALINDROME_PRODUCT_RESULT_TEMPLATE,
						results[0],
						results[1],
						results[2]
				)
		);
	}

}
