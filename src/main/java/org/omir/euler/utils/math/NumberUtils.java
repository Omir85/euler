package org.omir.euler.utils.math;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumberUtils {

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
				.filter(number -> isMultipleOfEitherNumber(number, divisors))
				.sum();
	}

	public static boolean isEven(int i) {
		return i % 2 == 0;
	}

	public static DoublePredicate divides(double number) {
		return i -> number % i == 0;
	}

	public static double largestPrimeFactorOf(double number) {
		if (isPrime(number)) {
			return number;
		}
		double seed = Math.ceil(number / 2);
		if (number > 10000) {
			seed = Math.ceil(Math.sqrt(number));
		}
		return DoubleStream.iterate(seed, d -> d - 1)
				.filter(divides(number))
				.filter(NumberUtils::isPrime)
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
