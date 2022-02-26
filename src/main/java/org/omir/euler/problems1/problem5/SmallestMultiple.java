package org.omir.euler.problems1.problem5;

import org.omir.euler.utils.math.NumberUtils;

/**
 * <pre>
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class SmallestMultiple {

	public static void main(String[] args) {
		double limit = 20;
		int n = NumberUtils.product(NumberUtils.getReducedPrimeFactorsMap(limit));
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + n);
		System.out.println("Its prime factors are " + NumberUtils.getPrimeFactorsOf(n));
	}

}
