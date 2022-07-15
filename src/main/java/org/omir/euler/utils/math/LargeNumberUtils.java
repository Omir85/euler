package org.omir.euler.utils.math;

import org.omir.euler.exception.ResultNotFoundException;
import org.omir.euler.problems10.problem13.LargeNumber;

public class LargeNumberUtils {

	public static Integer[] convertLargeNumber(String numberAsString) {
		Integer[] converted = new Integer[numberAsString.length()];
		for (int i = 0; i < numberAsString.length(); i++) {
			converted[i] = Integer.parseInt(numberAsString.substring(i, i + 1));
		}
		return converted;
	}

	public static LargeNumber[] convertLargeNumbers(String[] numbersAsString) {
		LargeNumber[] largeNumbers = new LargeNumber[numbersAsString.length];
		for (int i = 0; i < largeNumbers.length; i++) {
			String numberAsString = numbersAsString[i];
			LargeNumber largeNumber = new LargeNumber(convertLargeNumber(numberAsString));
			largeNumbers[i] = largeNumber;
		}
		return largeNumbers;
	}

	public static LargeNumber computeSum(LargeNumber[] largeNumbers) {
		if (largeNumbers == null || largeNumbers.length == 0) {
			throw new ResultNotFoundException();
		}
		LargeNumber sum = new LargeNumber(largeNumbers[0].getNumberOfDecimals());
		for (LargeNumber largeNumber : largeNumbers) {
			sum = sum.add(largeNumber);
		}
		return sum;
	}

}
