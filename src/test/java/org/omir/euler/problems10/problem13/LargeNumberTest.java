package org.omir.euler.problems10.problem13;

import org.junit.Assert;
import org.junit.Test;

public class LargeNumberTest {

	@Test
	public void getNumberOfDecimalsShouldReturn0WhenDecimalsIsNull() {
		LargeNumber largeNumber = new LargeNumber(null);
		Assert.assertEquals(0, largeNumber.getNumberOfDecimals());
	}

	@Test
	public void getNumberOfDecimalsShouldReturnTheNumberOfDecimalsWhenDecimalsIsNotNull() {
		Integer[] decimals = new Integer[] { 1, 1, 1, 1, 1 };
		LargeNumber largeNumber = new LargeNumber(decimals);
		Assert.assertEquals(5, largeNumber.getNumberOfDecimals());
		Assert.assertEquals(5, largeNumber.getDecimals().length);
	}

	@Test
	public void getDecimalOf0ShouldReturnTheFirstDecimal() {
		Integer[] decimals = new Integer[] { 1, 1, 1, 1, 1 };
		LargeNumber largeNumber = new LargeNumber(decimals);
		Assert.assertEquals(1, largeNumber.getDecimal(0).intValue());
	}

	@Test
	public void noArgsConstructorShouldInitializeTheDecimals() {
		LargeNumber largeNumber = new LargeNumber();
		Assert.assertEquals(0, largeNumber.getNumberOfDecimals());
	}

	@Test
	public void newLargeNumberWith3AsParameterShouldReturnALargeNumberWith3Decimals() {
		LargeNumber largeNumber = new LargeNumber(3);
		Assert.assertEquals(3, largeNumber.getNumberOfDecimals());
	}

	@Test
	public void addShouldReturnTheSum() {
		LargeNumber largeNumber1 = new LargeNumber(new Integer[] { 1, 2, 3, 4, 5 });
		LargeNumber largeNumber2 = new LargeNumber(new Integer[] { 1, 2, 3, 4, 5 });
		LargeNumber expected = new LargeNumber(new Integer[] { 2, 4, 6, 9, 0 });
		Assert.assertEquals(expected, largeNumber1.add(largeNumber2));

		largeNumber1 = new LargeNumber(new Integer[] { 5, 4, 3, 2, 1 });
		largeNumber2 = new LargeNumber(new Integer[] { 5, 4, 3, 2, 1 });
		expected = new LargeNumber(new Integer[] { 1, 0, 8, 6, 4, 2 });
		Assert.assertEquals(expected, largeNumber1.add(largeNumber2));
	}

}
