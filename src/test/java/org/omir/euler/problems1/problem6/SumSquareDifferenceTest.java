package org.omir.euler.problems1.problem6;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;


public class SumSquareDifferenceTest {

	@Test
	public void sumOfSquaresOfOneToTenIs385() {
		Assert.assertEquals(385, NumberUtils.sumOfSquares(10), 0);
	}

	@Test
	public void sumOfSquaresOfOneToTwoIs5() {
		Assert.assertEquals(5, NumberUtils.sumOfSquares(2), 0);
	}

	@Test
	public void sumOfSquaresOfOneToThreeIs14() {
		Assert.assertEquals(14, NumberUtils.sumOfSquares(3), 0);
	}

	@Test
	public void squareOfSumOfOneToTwoIsNine() {
		Assert.assertEquals(9, NumberUtils.squareOfSum(2), 0);
	}

	@Test
	public void squareOfSumOfOneToThreeIsThirtySix() {
		Assert.assertEquals(36, NumberUtils.squareOfSum(3), 0);
	}

	@Test
	public void squareOfSumOfOneToTenIs3025() {
		Assert.assertEquals(3025, NumberUtils.squareOfSum(10), 0);
	}

	@Test
	public void squareOfSumMinusSumOfSquaresOfOneToHundredIs2516415() {
		double limit = 100;
		Assert.assertEquals(25164150, NumberUtils.squareOfSum(limit) - NumberUtils.sumOfSquares(limit), 0);
	}

}
