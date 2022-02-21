package org.omir.euler.problem7;

import java.util.ArrayList;
import java.util.List;

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

	public static double getNthPrime(int n) {
		return computePrimes(n).get(n - 1);
	}

	private static List<Double> computePrimes(int size) {
		List<Double> primeNumbers = new ArrayList<>();
		primeNumbers.add(2d);
		for (int i = 3; primeNumbers.size() < size; i += 2) {
			if (NumberUtils.isPrime(i)) {
				primeNumbers.add((double) i);
			}
		}
		return primeNumbers;
	}

}
