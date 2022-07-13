package org.omir.euler.problems10.problem12;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;

public class HighlyDivisibleTriangularNumberTest {

	@Test
	public void getTriangleNumberShouldReturn1WhenInputIs1() {
		Assert.assertEquals(1, NumberUtils.getTriangleNumber(1));
	}

	@Test
	public void getTriangleNumberShouldReturn3WhenInputIs2() {
		Assert.assertEquals(3, NumberUtils.getTriangleNumber(2));
	}

	@Test
	public void getTriangleNumberShouldReturn6WhenInputIs3() {
		Assert.assertEquals(6, NumberUtils.getTriangleNumber(3));
	}

	@Test
	public void getTriangleNumberShouldReturn28WhenInputIs7() {
		Assert.assertEquals(28, NumberUtils.getTriangleNumber(7));
	}

	@Test
	public void getFactorsOf4ShouldReturn1_2_4() {
		List<Double> factorsOf4 = NumberUtils.getFactorsOf(4);
		Assert.assertEquals(3, factorsOf4.size());
		Assert.assertTrue(factorsOf4.contains(1d));
		Assert.assertTrue(factorsOf4.contains(2d));
		Assert.assertTrue(factorsOf4.contains(4d));
	}

	@Test
	public void getFactorsOf6ShouldReturn1_2_3_6() {
		List<Double> factorsOf6 = NumberUtils.getFactorsOf(6);
		Assert.assertTrue(factorsOf6.contains(1d));
		Assert.assertTrue(factorsOf6.contains(2d));
		Assert.assertTrue(factorsOf6.contains(3d));
		Assert.assertTrue(factorsOf6.contains(6d));
		Assert.assertEquals(4, factorsOf6.size());
	}

	@Test
	public void getFactorsOf28ShouldReturn1_2_4_7_14_28() {
		List<Double> factorsOf28 = NumberUtils.getFactorsOf(28);
		Assert.assertEquals(6, factorsOf28.size());
		Assert.assertTrue(factorsOf28.contains(1d));
		Assert.assertTrue(factorsOf28.contains(2d));
		Assert.assertTrue(factorsOf28.contains(4d));
		Assert.assertTrue(factorsOf28.contains(7d));
		Assert.assertTrue(factorsOf28.contains(14d));
		Assert.assertTrue(factorsOf28.contains(28d));
	}

	@Test
	public void getFirstTriangleNumberWithAtLeast1FactorsShouldReturn1() {
		Assert.assertEquals(1, NumberUtils.getFirstTriangleNumberWithAtLeastNFactors(1));
	}

	@Test
	public void getFirstTriangleNumberWithAtLeast2FactorsShouldReturn3() {
		Assert.assertEquals(3, NumberUtils.getFirstTriangleNumberWithAtLeastNFactors(2));
	}

	@Test
	public void getFirstTriangleNumberWithAtLeast3FactorsShouldReturn6() {
		Assert.assertEquals(6, NumberUtils.getFirstTriangleNumberWithAtLeastNFactors(3));
	}

	@Test
	public void getFirstTriangleNumberWithAtLeast5FactorsShouldReturn28() {
		Assert.assertEquals(28, NumberUtils.getFirstTriangleNumberWithAtLeastNFactors(5));
	}

	@Test
	public void getFirstTriangleNumberWithAtLeast100FactorsShouldReturn73920() {
		Assert.assertEquals(73920, NumberUtils.getFirstTriangleNumberWithAtLeastNFactors(100));
	}

	// @Test
	// lasts 15s
	public void getFirstTriangleNumberWithAtLeast300FactorsShouldReturn2162160() {
		Assert.assertEquals(2162160, NumberUtils.getFirstTriangleNumberWithAtLeastNFactors(300));
	}

	// @Test
	// lasts 3000s - Activate with caution or if you have some time at hand
	public void getFirstTriangleNumberWithAtLeast500FactorsShouldReturn2162160() {
		Assert.assertEquals(76576500, NumberUtils.getFirstTriangleNumberWithAtLeastNFactors(500));
	}

	// @Test
	public void justToCheckTheDivisorsOf76576500() {
		System.out.println(NumberUtils.getFactorsOf(76576500));
		System.out.println("---------------------");
		System.out.println(NumberUtils.getPrimeFactorsOf(76576500));
		System.out.println("---------------------");
		System.out.println(NumberUtils.getPrimeFactorsMap(76576500));
		System.out.println("---------------------");
		System.out.println(NumberUtils.getReducedPrimeFactorsMap(76576500));
	}

}
