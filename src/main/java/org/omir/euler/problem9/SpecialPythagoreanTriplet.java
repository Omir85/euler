package org.omir.euler.problem9;

import java.util.Optional;

/**
 * <pre>
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class SpecialPythagoreanTriplet {

	private static final int target = 1000;

	public static void main(String[] args) {
		displayResult(findPythagoreanTripletWhichProductIs(target), target);
	}

	private static void displayResult(Optional<PythagoreanTriplet> solution, int target) {
		System.out.println(
				solution.isPresent()
						? formatResult(solution.get(), target)
						: String.format("No result found for target %s", target)
		);
	}

	private static String formatResult(PythagoreanTriplet solution, int target) {
		return String.format(
				"%s + %s + %s equals %s. The product abc is %d",
				(int) solution.getA(),
				(int) solution.getB(),
				(int) solution.getC(),
				target,
				(int) solution.getProduct()
		);
	}

	public static Optional<PythagoreanTriplet> findPythagoreanTripletWhichProductIs(int target) {
		for (int a = 1; a < target; a++) {
			for (int b = 2; b < target; b++) {
				double c = getHypothenuse(a, b);
				if (
						isInteger(c)
						&& isPythagoreanTriplet(a, b, c)
						&& (a + b + c == target)
				) {
					return Optional.of(new PythagoreanTriplet(a, b, c));
				}
			}
		}
		return Optional.empty();
	}

	public static boolean isPythagoreanTriplet(double a, double b, double c) {
		return square(a) + square(b) == square(c);
	}

	public static double square(double i) {
		return i * i;
	}

	public static double getHypothenuse(int a, int b) {
		return Math.sqrt(square(a) + square(b));
	}

	public static boolean isInteger(double c) {
		return (int) c == c;
	}

	public static boolean isPythagoreanTriplet(PythagoreanTriplet pythagoreanTriplet) {
		return isPythagoreanTriplet(
				pythagoreanTriplet.getA(),
				pythagoreanTriplet.getB(),
				pythagoreanTriplet.getC()
		);
	}

}
