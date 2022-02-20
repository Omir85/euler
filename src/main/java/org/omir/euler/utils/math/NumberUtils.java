package org.omir.euler.utils.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import org.omir.euler.utils.string.StringUtils;

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

	public static List<Double> getPrimeFactorsOf(double number) {
		List<Double> list = new ArrayList<>();
		if (isPrime(number)) {
			list.add(number);
			return list;
		}
		double divisor = DoubleStream.iterate(2, d -> d + 1)
				.limit((long) number)
				.filter(divides(number))
				.filter(NumberUtils::isPrime)
				.findFirst()
				.orElse(0);
		list.add(divisor);
		list.addAll(getPrimeFactorsOf(number / divisor));
		return list;
	}

	public static double largestPrimeFactorOf(double number) {
		List<Double> primeFactors = getPrimeFactorsOf(number);
		return primeFactors.get(primeFactors.size() - 1);
	}

	public static boolean isPrime(double number) {
		return DoubleStream.iterate(2, d -> d + 1)
				.limit((long) Math.ceil(Math.sqrt(number)))
				.filter(i -> i != number)
				.noneMatch(divides(number));
	}

	public static int[] computeLargestPalindromeProduct() {
		int largestPalindromeProductOfTwoThreeDigitNumbers = 0;
		int solutionI = 0;
		int solutionJ = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				int product = i * j;
				if (StringUtils.isPalindrome(product)) {
					if (product > largestPalindromeProductOfTwoThreeDigitNumbers) {
						largestPalindromeProductOfTwoThreeDigitNumbers = product;
						solutionI = i;
						solutionJ = j;
					}
				}
			}
		}
		return new int[] { largestPalindromeProductOfTwoThreeDigitNumbers, solutionI, solutionJ };
	}

}
