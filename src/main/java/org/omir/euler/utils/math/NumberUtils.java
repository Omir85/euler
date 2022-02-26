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

	public static double sumOfSquares(double limit) {
		return DoubleStream.iterate(1, d -> d + 1)
				.limit((long) limit)
				.map(d -> Math.pow(d, 2))
				.reduce(0, (total, d) -> total + d);
	}

	public static double squareOfSum(double limit) {
		return Math.pow(
				DoubleStream.iterate(1, d -> d + 1)
						.limit((long)limit)
						.reduce(0, (total, d) -> total + d)
				, 2
		);
	}

	public static double getNthPrime(int n) {
		return NumberUtils.computePrimes(n).get(n - 1);
	}

	public static List<Double> computePrimes(int size) {
		List<Double> primeNumbers = new ArrayList<>();
		primeNumbers.add(2d);
		for (int i = 3; primeNumbers.size() < size; i += 2) {
			if (isPrime(i)) {
				primeNumbers.add((double) i);
			}
		}
		return primeNumbers;
	}

	public static double getLargestProduct(List<String> trimmed) {
		double product = 0;
		for (String string : trimmed) {
			double productOfSplit = NumberUtils.productOfStrings(StringUtils.split(string));
			if (product < productOfSplit) {
				product = productOfSplit;
			}
		}
		return product;
	}

	public static double getLargestProduct(List<String> trimmed, int size) {
		List<String> sizedStrings = new ArrayList<>();
		for (String string : trimmed) {
			for (int i = 0; i + size - 1 < string.length(); i++) {
				sizedStrings.add(string.substring(i, i + size));
			}
		}
		return getLargestProduct(sizedStrings);
	}

	public static double getLargestProduct(String number, int size) {
		return getLargestProduct(
				StringUtils.trimOutShortStrings(
						StringUtils.split(number, "0"),
						size
				), size
		);
	}

	public static double productOfStrings(List<String> list) {
		return product(
				list.stream()
						.map(s -> Double.valueOf(s))
						.collect(Collectors.toList())
		);
	}

	public static double square(double i) {
		return i * i;
	}

	public static boolean isInteger(double c) {
		return (int) c == c;
	}

}
