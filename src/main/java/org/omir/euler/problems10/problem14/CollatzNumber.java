package org.omir.euler.problems10.problem14;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class CollatzNumber {

	private Long number;

	private List<CollatzNumber> sequence;

	private CollatzNumber(long number) {
		this.number = number;
	}

	public static CollatzNumber of(long number) {
		return new CollatzNumber(number);
	}

	private CollatzNumber getNext(long number) {
		return CollatzNumber.of(computeNext(number));
	}

	private long computeNext(long number) {
		return number % 2 == 0
				? number / 2
				: 3 * number + 1;
	}

	public List<CollatzNumber> buildSequence() {
		sequence = new ArrayList<>();
		CollatzNumber next = this;
		sequence.add(next);
		while (next.getNumber() != 1) {
			next = getNext(next.getNumber());
			sequence.add(next);
		}
		return sequence;
	}

	public Long getSequence(int index) {
		return sequence.get(index).getNumber();
	}

	@Override
	public String toString() {
		return number.toString();
	}

}
