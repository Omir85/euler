package org.omir.euler.problems10.problem14;

public class LongestCollatzSequence {

	public static void main(String[] args) {
		System.out.println("The starting number, under one million, that produces the longest chain is " + LongestCollatzSequence.findLongestCollatzSequence(1000000));
	}

	public static CollatzNumber findLongestCollatzSequence(int start) {
		CollatzNumber longest = CollatzNumber.of(start);
		longest.buildSequence();
		for (int i = start - 1; i > 1; i--) {
			CollatzNumber current = CollatzNumber.of(i);
			current.buildSequence();
			if (current.getSequence().size() > longest.getSequence().size()) {
				longest = current;
			}
		}
		return longest;
	}

}
