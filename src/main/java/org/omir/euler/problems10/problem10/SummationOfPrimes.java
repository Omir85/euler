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

	private SummationOfPrimes() {}
	
	public static final int TWO_MILLION = 2000000;
	
	public static final String SOLUTION_PREFIX = "The sum of all the primes below two million is ";

	public static void main(String[] args) {
		System.out.println(displaySolution());
	}

	public static String displaySolution() {
		return SOLUTION_PREFIX + sumOfPrimesBelowTwoMillion();
	}

	public static long sumOfPrimesBelowTwoMillion() {
		return NumberUtils.sumOfPrimesBelow(TWO_MILLION);
	}

}
