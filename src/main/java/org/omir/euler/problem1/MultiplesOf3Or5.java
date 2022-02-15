package org.omir.euler.problem1;

import org.omir.euler.utils.math.NumberUtils;

/**
 * <pre>
 * Problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class MultiplesOf3Or5 {

	public static void main(String[] args) {
		System.out.println(
				String.format(
						"The sum of all the multiples of 3 or 5 below 1000 is %d",
						NumberUtils.sumOfAllMultiplesOfEitherNumberBelow(1000, 3, 5)
				)
		);
	}

}
