package org.omir.euler.problem1;

import java.util.Arrays;
import java.util.stream.IntStream;

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
						sumOfAllMultiplesOfEitherNumberBelow(1000, 3, 5)
				)
		);
	}

	public static boolean isNumberMultipleOf(Integer number, Integer divisor) {
		return number % divisor == 0;
	}

	public static boolean isMultipleOfEitherNumber(Integer number, Integer... divisors) {
		return Arrays.asList(divisors)
				.stream()
				.anyMatch(divisor -> isNumberMultipleOf(number, divisor));
	}

	public static int sumOfAllMultiplesOfEitherNumberBelow(int maximumExcluded, Integer... divisors) {
		return IntStream.range(1, maximumExcluded)
				.filter(number -> MultiplesOf3Or5.isMultipleOfEitherNumber(number, divisors))
				.sum();
	}

}
