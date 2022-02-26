package org.omir.euler.problem8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class LargestProductInASeriesTest {

	@Test
	public void split101OnZeroShouldReturnAListWithTwoElementsBothEqualToOne() {
		String input = "101";
		List<String> split = LargestProductInASeries.split(input, "0");
		Assert.assertEquals("Split list should have a size of 2", 2, split.size());
		Assert.assertEquals("First element should be 1", "1", split.get(0));
		Assert.assertEquals("Second element should be 1", "1", split.get(1));
	}

	@Test
	public void splitOf9989ShouldBeAListOfFourElements() {
		String input = "9989";
		List<String> expected = IntStream.of(9, 9, 8, 9)
				.boxed()
				.map(i -> i.toString())
				.collect(Collectors.toList());
		List<String> split = LargestProductInASeries.split(input);
		Assert.assertEquals("Split list should have a size of 4", expected.size(), split.size());
		for (int i = 0; i < expected.size(); i++) {
			Assert.assertEquals(i + "th element should be " + expected.get(i), expected.get(i), split.get(i));
		}
	}

	@Test
	public void productOf99ShouldBe81() {
		String input = "99";
		List<String> split = LargestProductInASeries.split(input);
		double product = LargestProductInASeries.product(split);
		Assert.assertEquals(81, product, 0);
	}

	@Test
	public void productOf9989ShouldBe5832() {
		String input = "9989";
		List<String> split = LargestProductInASeries.split(input);
		double product = LargestProductInASeries.product(split);
		Assert.assertEquals(5832, product, 0);
	}

	@Test
	public void productOf8839987979ShouldBe493807104() {
		String input = "8839987979";
		List<String> split = LargestProductInASeries.split(input);
		double product = LargestProductInASeries.product(split);
		Assert.assertEquals(493807104, product, 0);
	}

	@Test
	public void trimShortStringsShouldRemoveSmallerStrings() {
		String expected = "319989";
		String input = "1230" + expected + "0123";
		List<String> split = LargestProductInASeries.split(input, "0");
		List<String> trimmed = LargestProductInASeries.trimOutShortStrings(split, 4);
		Assert.assertEquals(1, trimmed.size());
		Assert.assertEquals(expected, trimmed.get(0));
	}

	@Test
	public void largestProductOfFourDigitsFrom319989ShouldBe5832() {
		String input = "319989";
		double expected = 5832;
		int size = 4;
		double largestProduct = LargestProductInASeries.getLargestProduct(input, size);
		Assert.assertEquals(expected, largestProduct, 0);
	}

	@Test
	public void largestProductOfFourDigitsFromLongInputShouldBe5832() {
		String input = "82166370484403199890008895243450658541227588666881";
		double expected = 5832;
		int size = 4;
		double largestProduct = LargestProductInASeries.getLargestProduct(input, size);
		Assert.assertEquals(expected, largestProduct, 0);
	}

	@Test
	public void largestProductOfFourDigitsFromHugeInputShouldBe5832() {
		String input = LargestProductInASeries.THOUSAND_DIGIT_NUMBER;
		double expected = 5832;
		int size = 4;
		double largestProduct = LargestProductInASeries.getLargestProduct(input, size);
		Assert.assertEquals(expected, largestProduct, 0);
	}

	@Test
	public void largestProductOfThirteenDigitsFromHugeInputShouldBe5832() {
		String input = LargestProductInASeries.THOUSAND_DIGIT_NUMBER;
		double expected = 23514624000d;
		int size = 13;
		double largestProduct = LargestProductInASeries.getLargestProduct(input, size);
		Assert.assertEquals(expected, largestProduct, 0);
	}

}
