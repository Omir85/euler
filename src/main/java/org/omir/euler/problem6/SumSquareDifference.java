package org.omir.euler.problem6;

import java.util.stream.DoubleStream;

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
				+ (int) (squareOfSum(limit) - sumOfSquares(limit))
		);
	}

	public static double sumOfSquares(double limit) {
		return DoubleStream.iterate(1, d -> d + 1)
				.limit((long) limit)
				.map(d -> Math.pow(d, 2))
				.reduce(0, (total, d) -> total + d);
	}

	public static double squareOfSum(double limit) {
		return Math.pow(
				DoubleStream.iterate(1, d -> d + 1)
						.limit((long)limit)
						.reduce(0, (total, d) -> total + d)
				, 2
		);
	}

}
