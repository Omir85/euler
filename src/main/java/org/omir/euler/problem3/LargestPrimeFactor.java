package org.omir.euler.problem3;

import org.omir.euler.utils.math.NumberUtils;

/**
 * <pre>
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class LargestPrimeFactor {

	public static void main(String[] args) {
		System.out.println(
				"The largest prime factor of the number 600851475143 is "
				+ (int) NumberUtils.largestPrimeFactorOf(6.00851475143E11)
		);
	}

}
