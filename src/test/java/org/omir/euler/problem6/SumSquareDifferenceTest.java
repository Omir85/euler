package org.omir.euler.problem6;

import org.junit.Assert;
import org.junit.Test;


public class SumSquareDifferenceTest {

	@Test
	public void sumOfSquaresOfOneToTenIs385() {
		Assert.assertEquals(385, SumSquareDifference.sumOfSquares(10), 0);
	}

	@Test
	public void sumOfSquaresOfOneToTwoIs5() {
		Assert.assertEquals(5, SumSquareDifference.sumOfSquares(2), 0);
	}

	@Test
	public void sumOfSquaresOfOneToThreeIs14() {
		Assert.assertEquals(14, SumSquareDifference.sumOfSquares(3), 0);
	}

	@Test
	public void squareOfSumOfOneToTwoIsNine() {
		Assert.assertEquals(9, SumSquareDifference.squareOfSum(2), 0);
	}

	@Test
	public void squareOfSumOfOneToThreeIsThirtySix() {
		Assert.assertEquals(36, SumSquareDifference.squareOfSum(3), 0);
	}

	@Test
	public void squareOfSumOfOneToTenIs3025() {
		Assert.assertEquals(3025, SumSquareDifference.squareOfSum(10), 0);
	}

	@Test
	public void squareOfSumMinusSumOfSquaresOfOneToHundredIs2516415() {
		double limit = 100;
		Assert.assertEquals(25164150, SumSquareDifference.squareOfSum(limit) - SumSquareDifference.sumOfSquares(limit), 0);
	}

}
