package org.omir.euler.utils.math;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import org.omir.euler.utils.collections.CollectionUtils;

public class FibonacciSequenceUtils {

	private static Map<Integer, Integer> fibonacciNumbers = new HashMap<>();

	public static int[] getFibonacciNumbers(int range) {
		return IntStream.iterate(1, i -> i + 1)
				.limit(range)
				.map(number -> getFibonacciNumber(number))
				.toArray();
	}

	public static int getFibonacciNumber(int number) {
		Integer key = Integer.valueOf(number);
		if (fibonacciNumbers.get(key) == null) {
			fibonacciNumbers.put(
					key,
					(number - 2 <= 0)
							? number
							: getFibonacciNumber(number - 1) + getFibonacciNumber(number - 2)
			);
		}
		return fibonacciNumbers.get(Integer.valueOf(number));
	}

	public static int[] getFibonacciNumbersBelow(int limit) {
		for (int i = 1; getFibonacciNumber(i) < limit; i++) {}
		return getFibonacciNumbers(fibonacciNumbers.size() - 1);
	}

	public static int getSumOfEvenFibonacciTermsBelow(int i) {
		return CollectionUtils.castArrayToList(getFibonacciNumbersBelow(i)).stream()
				.filter(number -> NumberUtils.isEven(number))
				.reduce(0, Integer::sum);
	}

}
