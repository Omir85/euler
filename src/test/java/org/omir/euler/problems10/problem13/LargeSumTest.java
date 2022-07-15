package org.omir.euler.problems10.problem13;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.LargeNumberUtils;

public class LargeSumTest {

	@Test
	public void convertLargeNumberShouldReturnALargeNumber() {
		LargeNumber largeNumber = new LargeNumber(LargeNumberUtils.convertLargeNumber(LargeSumData.numbers[0]));
		Assert.assertEquals(50, largeNumber.getNumberOfDecimals());
		Assert.assertEquals(3, largeNumber.getDecimal(0).intValue());
		Assert.assertEquals(7, largeNumber.getDecimal(1).intValue());
		Assert.assertEquals(1, largeNumber.getDecimal(2).intValue());
	}

	@Test
	public void sumOfTwoLargeNumbersShouldReturnTheSum() {
		LargeNumber largeNumber = new LargeNumber(LargeNumberUtils.convertLargeNumber("12345"));
		LargeNumber result = LargeNumberUtils.computeSum(new LargeNumber[] { largeNumber, largeNumber });
		LargeNumber expected = new LargeNumber(LargeNumberUtils.convertLargeNumber("24690"));
		Assert.assertEquals(expected, result);
	}

	@Test
	public void sumOfThreeLargeNumbersShouldReturnTheSum() {
		LargeNumber largeNumber = new LargeNumber(LargeNumberUtils.convertLargeNumber("12345"));
		LargeNumber result = LargeNumberUtils.computeSum(new LargeNumber[] { largeNumber, largeNumber, largeNumber });
		LargeNumber expected = new LargeNumber(LargeNumberUtils.convertLargeNumber("37035"));
		Assert.assertEquals(expected, result);
	}

	@Test
	public void convertLargeNumbersShouldReturnAnArrayOfLargeNumbersConvertedFromTheInput() {
		String[] numbersAsString = new String[] { "123", "456", "789" };
		LargeNumber[] largeNumbers = LargeNumberUtils.convertLargeNumbers(numbersAsString);
		Assert.assertEquals(3, largeNumbers.length);
		Assert.assertEquals(1, largeNumbers[0].getDecimal(0).intValue());
		Assert.assertEquals(5, largeNumbers[1].getDecimal(1).intValue());
		Assert.assertEquals(9, largeNumbers[2].getDecimal(2).intValue());
	}

	@Test
	public void sumOfAllLargeNumbersShouldReturn5537376230AsTheFirst10Digits() {
		LargeNumber expected = new LargeNumber(LargeNumberUtils.convertLargeNumber("5537376230"));
		LargeNumber sum = LargeNumberUtils.computeSum(LargeNumberUtils.convertLargeNumbers(LargeSumData.numbers));
		for (int i = 0; i < expected.getNumberOfDecimals(); i++) {
			Assert.assertEquals(expected.getDecimal(i), sum.getDecimal(i));
		}
	}

}
