package org.omir.euler.problem9;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.PythagoreanAlgebraUtils;

public class SpecialPythagoreanTripletTest {

	@Test
	public void numbersThreeFourAndFiveAreAPythagoreanTriplet() {
		Assert.assertTrue(PythagoreanAlgebraUtils.isPythagoreanTriplet(3, 4, 5));
	}

	@Test
	public void numbersThreeFourAndSixAreNotAPythagoreanTriplet() {
		Assert.assertFalse(PythagoreanAlgebraUtils.isPythagoreanTriplet(3, 4, 6));
	}

	@Test
	public void squareOfThreeIsNine() {
		Assert.assertEquals(9, SpecialPythagoreanTriplet.square(3), 0);
	}

	@Test
	public void numbersThreeAndFourGiveFiveAsHypotenuse() {
		Assert.assertEquals(5d, PythagoreanAlgebraUtils.getHypothenuse(3, 4), 0);
	}

	@Test
	public void numbersSixAndEightGiveTenAsHypotenuse() {
		Assert.assertEquals(10, PythagoreanAlgebraUtils.getHypothenuse(6, 8), 0);
	}

	@Test
	public void numbersThreeAndFourGiveAnIntegerHypotenuse() {
		double c = PythagoreanAlgebraUtils.getHypothenuse(3, 4);
		Assert.assertTrue(SpecialPythagoreanTriplet.isInteger(c));
	}

	@Test
	public void numbersThreeAndFiveDoNotGiveAnIntegerHypotenuse() {
		double c = PythagoreanAlgebraUtils.getHypothenuse(3, 5);
		Assert.assertFalse(SpecialPythagoreanTriplet.isInteger(c));
	}

	@Test
	public void testProductOfPythagoreanTriplet() {
		PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet(3, 4, 5);
		Assert.assertTrue(PythagoreanAlgebraUtils.isPythagoreanTriplet(pythagoreanTriplet));
		Assert.assertEquals(3 * 4 * 5, PythagoreanAlgebraUtils.getProduct(pythagoreanTriplet), 0);
	}

}
