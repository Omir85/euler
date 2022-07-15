package org.omir.euler.problems10.problem13;

import org.omir.euler.utils.math.LargeNumberUtils;

public class LargeSum {

	public static void main(String[] args) {
		LargeNumber sum = LargeNumberUtils.computeSum(LargeNumberUtils.convertLargeNumbers(LargeSumData.numbers));
		StringBuilder stringBuilder = new StringBuilder(sum.getNumberOfDecimals());
		for (int i = 0; i < 10; i++) {
			Integer decimal = sum.getDecimal(i);
			stringBuilder.append(decimal);
		}
		System.out.println("The sum of the first 10 digits of the list of 50-digit numbers is " + stringBuilder.toString());
	}

}
