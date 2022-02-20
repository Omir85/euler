package org.omir.euler.utils.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.DoublePredicate;
import java.util.stream.Collectors;
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

	public static int[] computeLargestPalindromeProduct(int digits) {
		int largestPalindromeProductOfTwoThreeDigitNumbers = 0;
		int solutionI = 0;
		int solutionJ = 0;
		int max = getLargestNumberWithDigits(digits);
		int min = getSmallestNumberWithDigits(digits);
		for (int i = max; i > min; i--) {
			for (int j = max; j > min; j--) {
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

	private static int getLargestNumberWithDigits(int digits) {
		return (int) (Math.pow(10, digits) - 1);
	}

	private static int getSmallestNumberWithDigits(int digits) {
		return getLargestNumberWithDigits(digits - 1);
	}

	public static Map<Double, Integer> getPrimeFactorsMap(double number) {
		Map<Double, Integer> primeFactorsMap = new HashMap<>();
		List<Double> primeFactors = getPrimeFactorsOf(number);
		for (Double primeFactor : primeFactors) {
			if (!primeFactorsMap.containsKey(primeFactor)) {
				primeFactorsMap.put(primeFactor, 0);
			}
			primeFactorsMap.put(primeFactor, primeFactorsMap.get(primeFactor) + 1);
		}
		return primeFactorsMap;
	}

	public static Double product(List<Double> list) {
		return list.stream()
				.reduce(1d, multiply());
	}

	private static BinaryOperator<Double> multiply() {
		return (product, i) -> product * i;
	}

	public static List<Double> getNumbersFromOneTo(long limit) {
		return DoubleStream.iterate(1, i -> i + 1)
				.limit(limit)
				.boxed()
				.collect(Collectors.toList());
	}

	public static Map<Double, Integer> getReducedPrimeFactorsMap(double limit) {
		Map<Double, Integer> primeFactorsMap = new HashMap<>();
		List<Double> divisors = NumberUtils.getNumbersFromOneTo((long) limit);
		double product = NumberUtils.product(divisors);
		List<Double> primeFactors = getPrimeFactorsOf(product);
		for (Double primeFactor : primeFactors) {
			if (!primeFactorsMap.containsKey(primeFactor)) {
				primeFactorsMap.put(primeFactor, 0);
			}
			if (Math.pow(primeFactor, primeFactorsMap.get(primeFactor) + 1) < limit) {
				primeFactorsMap.put(primeFactor, primeFactorsMap.get(primeFactor) + 1);
			}
		}
		return primeFactorsMap;
	}

	public static int product(Map<Double, Integer> map) {
		int product = 1;
		for (Double key : map.keySet()) {
			product *= Math.pow(key, map.get(key));
		}
		return product;
	}

}
