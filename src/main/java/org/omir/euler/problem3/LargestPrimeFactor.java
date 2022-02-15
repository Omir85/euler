package org.omir.euler.problem3;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

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

	public static DoublePredicate divides(double number) {
		return i -> number % i == 0;
	}

	public static void main(String[] args) {
		System.out.println(
				"The largest prime factor of the number 600851475143 is "
				+ (int) largestPrimeFactorOf(6.00851475143E11)
		);
	}

	public static double largestPrimeFactorOf(double number) {
		if (isPrime(number)) {
			return number;
		}
		return DoubleStream.iterate(Math.ceil(Math.sqrt(number)), d -> d - 1)
				.filter(divides(number))
				.filter(LargestPrimeFactor::isPrime)
				.findFirst()
				.orElse(0);
	}

	public static boolean isPrime(double number) {
		return DoubleStream.iterate(2, d -> d + 1)
				.limit((long) Math.ceil(Math.sqrt(number)))
				.filter(i -> i != number)
				.noneMatch(divides(number));
	}

}
