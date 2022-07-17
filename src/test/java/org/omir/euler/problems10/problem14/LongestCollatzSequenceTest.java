package org.omir.euler.problems10.problem14;

import org.junit.Assert;
import org.junit.Test;

public class LongestCollatzSequenceTest {

	@Test
	public void findLongestCollatzSequenceStartingFrom1ShouldReturnASequenceWithOneElement() {
		CollatzNumber collatzNumberWithLongestSequence = LongestCollatzSequence.findLongestCollatzSequence(1);
		collatzNumberWithLongestSequence.buildSequence();
		Assert.assertEquals(1, collatzNumberWithLongestSequence.getSequence().size());
	}

	@Test
	public void findLongestCollatzSequenceStartingFrom5() {
		CollatzNumber collatzNumberWithLongestSequence = LongestCollatzSequence.findLongestCollatzSequence(5);
		Assert.assertEquals(3, collatzNumberWithLongestSequence.getNumber().intValue());
	}

	@Test
	public void findLongestCollatzSequenceStartingFrom100() {
		CollatzNumber collatzNumberWithLongestSequence = LongestCollatzSequence.findLongestCollatzSequence(100);
		Assert.assertEquals(97, collatzNumberWithLongestSequence.getNumber().intValue());
	}

	@Test
	public void findLongestCollatzSequenceStartingFrom10000() {
		CollatzNumber collatzNumberWithLongestSequence = LongestCollatzSequence.findLongestCollatzSequence(10000);
		Assert.assertEquals(6171, collatzNumberWithLongestSequence.getNumber().intValue());
	}

	@Test
	public void findLongestCollatzSequenceStartingFrom1000000() {
		CollatzNumber collatzNumberWithLongestSequence = LongestCollatzSequence.findLongestCollatzSequence(1000000);
		Assert.assertEquals(837799, collatzNumberWithLongestSequence.getNumber().intValue());
	}

}
