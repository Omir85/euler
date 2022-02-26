package org.omir.euler.problems1.problem9;

import java.util.Optional;

import org.omir.euler.utils.math.PythagoreanAlgebraUtils;

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
		displayResult(PythagoreanAlgebraUtils.findPythagoreanTripletWhichProductIs(target), target);
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
				(int) PythagoreanAlgebraUtils.getProduct(solution)
		);
	}

}
