package org.omir.euler.problems1.problem2;

import org.omir.euler.utils.math.FibonacciSequenceUtils;

/**
 * <pre>
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms.
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		System.out.println("The sum of the even-valued Fibonacci terms below four million is " + FibonacciSequenceUtils.getSumOfEvenFibonacciTermsBelow(4000000));
	}

}