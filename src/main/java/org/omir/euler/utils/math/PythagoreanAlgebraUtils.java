package org.omir.euler.utils.math;

import java.util.Optional;

import org.omir.euler.problem9.PythagoreanTriplet;
import org.omir.euler.problem9.SpecialPythagoreanTriplet;

public class PythagoreanAlgebraUtils {

	public static boolean isPythagoreanTriplet(PythagoreanTriplet pythagoreanTriplet) {
		return PythagoreanAlgebraUtils.isPythagoreanTriplet(
				pythagoreanTriplet.getA(),
				pythagoreanTriplet.getB(),
				pythagoreanTriplet.getC()
		);
	}

	public static boolean isPythagoreanTriplet(double a, double b, double c) {
		return SpecialPythagoreanTriplet.square(a) + SpecialPythagoreanTriplet.square(b) == SpecialPythagoreanTriplet.square(c);
	}

	public static double getProduct(PythagoreanTriplet pythagoreanTriplet) {
		return 1
				* pythagoreanTriplet.getA()
				* pythagoreanTriplet.getB()
				* pythagoreanTriplet.getC();
	}

	public static double getHypothenuse(int a, int b) {
		return Math.sqrt(SpecialPythagoreanTriplet.square(a) + SpecialPythagoreanTriplet.square(b));
	}

	public static Optional<PythagoreanTriplet> findPythagoreanTripletWhichProductIs(int target) {
		for (int a = 1; a < target; a++) {
			for (int b = 2; b < target; b++) {
				double c = getHypothenuse(a, b);
				if (
						SpecialPythagoreanTriplet.isInteger(c)
						&& isPythagoreanTriplet(a, b, c)
						&& (a + b + c == target)
				) {
					return Optional.of(new PythagoreanTriplet(a, b, c));
				}
			}
		}
		return Optional.empty();
	}
	
}
