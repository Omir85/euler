package org.omir.euler.problems10.problem10;

import org.omir.euler.utils.math.NumberUtils;

/**
 * <pre>
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class SummationOfPrimes {

	private static final int TWO_MILLION = 2000000;

	public static void main(String[] args) {
		System.out.println("The sum of all the primes below two million is " + NumberUtils.sumOfPrimesBelow(TWO_MILLION));
	}

}
