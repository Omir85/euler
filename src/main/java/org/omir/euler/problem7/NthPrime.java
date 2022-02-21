package org.omir.euler.problem7;

import org.omir.euler.utils.math.NumberUtils;

/**
 * <pre>
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class NthPrime {

	public static void main(String[] args) {
		System.out.println("The 10001st prime number is " + (int) NumberUtils.getNthPrime(10001));
	}

}
