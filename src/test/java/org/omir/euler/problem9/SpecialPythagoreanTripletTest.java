package org.omir.euler.problem9;

import org.junit.Assert;
import org.junit.Test;

public class SpecialPythagoreanTripletTest {

	@Test
	public void numbersThreeFourAndFiveAreAPythagoreanTriplet() {
		Assert.assertTrue(SpecialPythagoreanTriplet.isPythagoreanTriplet(3, 4, 5));
	}

	@Test
	public void numbersThreeFourAndSixAreNotAPythagoreanTriplet() {
		Assert.assertFalse(SpecialPythagoreanTriplet.isPythagoreanTriplet(3, 4, 6));
	}

	@Test
	public void squareOfThreeIsNine() {
		Assert.assertEquals(9, SpecialPythagoreanTriplet.square(3), 0);
	}

	@Test
	public void numbersThreeAndFourGiveFiveAsHypotenuse() {
		Assert.assertEquals(5d, SpecialPythagoreanTriplet.getHypothenuse(3, 4), 0);
	}

	@Test
	public void numbersSixAndEightGiveTenAsHypotenuse() {
		Assert.assertEquals(10, SpecialPythagoreanTriplet.getHypothenuse(6, 8), 0);
	}

	@Test
	public void numbersThreeAndFourGiveAnIntegerHypotenuse() {
		double c = SpecialPythagoreanTriplet.getHypothenuse(3, 4);
		Assert.assertTrue(SpecialPythagoreanTriplet.isInteger(c));
	}

	@Test
	public void numbersThreeAndFiveDoNotGiveAnIntegerHypotenuse() {
		double c = SpecialPythagoreanTriplet.getHypothenuse(3, 5);
		Assert.assertFalse(SpecialPythagoreanTriplet.isInteger(c));
	}

	@Test
	public void testProductOfPythagoreanTriplet() {
		PythagoreanTriplet pythagoreanTriplet = new PythagoreanTriplet(3, 4, 5);
		Assert.assertTrue(SpecialPythagoreanTriplet.isPythagoreanTriplet(pythagoreanTriplet));
		Assert.assertEquals(3 * 4 * 5, pythagoreanTriplet.getProduct(), 0);
	}

}
