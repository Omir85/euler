package org.omir.euler.utils.math;

import java.util.Arrays;
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
	
}
