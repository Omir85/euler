package org.omir.euler.problems10.problem13;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LargeNumber {

	private Integer[] decimals;

	public int getNumberOfDecimals() {
		return decimals == null
				? 0
				: decimals.length;
	}

	public LargeNumber(int size) {
		decimals = new Integer[size];
		int value = 0;
		fillWith(value, size);
	}

	public Integer getDecimal(int place) {
		if (place < this.getNumberOfDecimals()) {
			return decimals[place];
		} else {
			return 0;
		}
	}

	public LargeNumber add(LargeNumber largeNumber) {
		return reverse(
				addEachAndCarry(
						reverse(this),
						reverse(largeNumber)
				)
		);
	}

	private static LargeNumber reverse(LargeNumber largeNumber) {
		Integer size = largeNumber.getNumberOfDecimals();
		LargeNumber reversed = new LargeNumber(size);
		for (int i = 0; i < largeNumber.getNumberOfDecimals(); i++) {
			reversed.decimals[size - i - 1] = largeNumber.getDecimal(i);
		}
		return reversed;
	}

	private LargeNumber addEachAndCarry(LargeNumber term1, LargeNumber term2) {
		LargeNumber result = new LargeNumber(term1.getNumberOfDecimals());
		int carry = 0;
		for (int i = 0; i < term1.getNumberOfDecimals(); i++) {
			Integer decimal1 = term1.getDecimal(i);
			Integer decimal2 = term2.getDecimal(i);
			int sum = decimal1 + decimal2;
			result.decimals[i] = (carry + sum) % 10;
			carry = (carry + sum) / 10;
		}
		if (carry > 0) {
			result = shift(result, carry);
		}
		return result;
	}

	private LargeNumber shift(LargeNumber result, int carry) {
		LargeNumber shifted = copy(result);
		shifted.decimals[result.getNumberOfDecimals()] = carry;
		return shifted;
	}

	private LargeNumber copy(LargeNumber largeNumber) {
		LargeNumber shifted = new LargeNumber(largeNumber.getNumberOfDecimals() + 1);
		for (int i = 0; i < largeNumber.getNumberOfDecimals(); i++) {
			shifted.decimals[i] = largeNumber.getDecimal(i);
		}
		return shifted;
	}

	private void fillWith(int value, int size) {
		for (int i = 0; i < size; i++) {
			decimals[i] = value;
		}
	}

}
