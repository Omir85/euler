package org.omir.euler.problem1;

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
						sumOfAllMultiplesOfThreeOrFiveBelowOneThousand()
				)
		);
	}

	public static boolean isMultipleOf3(Integer number) {
		return number % 3 == 0;
	}

	public static boolean isMultipleOf5(Integer number) {
		return number % 5 == 0;
	}

	public static boolean isMultipleOf3Or5(Integer number) {
		return isMultipleOf3(number) || isMultipleOf5(number);
	}

	public static int sumOfAllMultiplesOfThreeOrFiveBelowOneThousand() {
		return IntStream.rangeClosed(1, 1000)
				.filter(number -> MultiplesOf3Or5.isMultipleOf3Or5(number))
				.sum();
	}

}
