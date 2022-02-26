package org.omir.euler.problems1.problem5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;

public class SmallestMultipleTest {

	@Test
	public void number2520IsDivisibleByAllNumbersFromOneToTen() {
		int number = 2520;
		long limit = 10;
		List<Double> divisors = NumberUtils.getNumbersFromOneTo(limit);
		for (Double divisor : divisors) {
			Assert.assertTrue(divisor + " should divide " + number, NumberUtils.divides(number).test(divisor));
		}
	}

	@Test
	public void primeFactorsOfFourIsTwoTwos() {
		int number = 4;
		Map<Double, Integer> expected = new HashMap<>();
		expected.put(2d, 2);
		for (Double key : expected.keySet()) {
			Assert.assertEquals(expected.get(key), NumberUtils.getPrimeFactorsMap(number).get(key));
		}
	}

	@Test
	public void primeFactorsOfSixIsOneTwoAndOneThree() {
		int number = 6;
		Map<Double, Integer> expected = new HashMap<>();
		expected.put(2d, 1);
		expected.put(3d, 1);
		for (Double key : expected.keySet()) {
			Assert.assertEquals(expected.get(key), NumberUtils.getPrimeFactorsMap(number).get(key));
		}
	}

	@Test
	public void primeFactorsOfNineIsTwoThrees() {
		int number = 9;
		Map<Double, Integer> expected = new HashMap<>();
		expected.put(3d, 2);
		for (Double key : expected.keySet()) {
			Assert.assertEquals(expected.get(key), NumberUtils.getPrimeFactorsMap(number).get(key));
		}
	}

	@Test
	public void primeFactorsOfTwelveIsTwoTwosAndOneThree() {
		int number = 12;
		Map<Double, Integer> expected = new HashMap<>();
		expected.put(2d, 2);
		expected.put(3d, 1);
		for (Double key : expected.keySet()) {
			Assert.assertEquals(expected.get(key), NumberUtils.getPrimeFactorsMap(number).get(key));
		}
	}

	@Test
	public void primeFactorsOf2520IsThreeTwosTwoThreesOneFiveAndOneSeven() {
		int number = 2520;
		Map<Double, Integer> expected = new HashMap<>();
		expected.put(2d, 3);
		expected.put(3d, 2);
		expected.put(5d, 1);
		expected.put(7d, 1);
		for (Double key : expected.keySet()) {
			Assert.assertEquals(expected.get(key), NumberUtils.getPrimeFactorsMap(number).get(key));
		}
	}

	@Test
	public void twoTimesTwoIsFour() {
		List<Double> list = new ArrayList<>();
		list.add(2d);
		list.add(2d);
		Assert.assertEquals(4d, NumberUtils.product(list).intValue(), 0);
	}

	@Test
	public void twoTimesTwoTimesTwoIsEight() {
		List<Double> list = new ArrayList<>();
		list.add(2d);
		list.add(2d);
		list.add(2d);
		Assert.assertEquals(8d, NumberUtils.product(list).intValue(), 0);
	}

	@Test
	public void whatIsTheSmallestNumberThatIsDivisibleByAllNumbersFromOneToTwenty() {
		int number = 232792560;
		long limit = 20;
		int smallestNumberThatIsDivisibleByAllNumbersFromOneToTwenty = NumberUtils.product(NumberUtils.getReducedPrimeFactorsMap(limit));
		Assert.assertEquals(number, smallestNumberThatIsDivisibleByAllNumbersFromOneToTwenty);
	}

}
