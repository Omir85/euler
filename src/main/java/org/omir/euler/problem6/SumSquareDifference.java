package org.omir.euler.problem6;

import org.omir.euler.utils.math.NumberUtils;

/**
 * <pre>
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 *
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
 * 3025 - 285 = 2640
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class SumSquareDifference {

	public static void main(String[] args) {
		double limit = 100;
		System.out.println(
				"The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is "
				+ (int) (NumberUtils.squareOfSum(limit) - NumberUtils.sumOfSquares(limit))
		);
	}

}
