package org.omir.euler.problems10.problem14;

import org.junit.Assert;
import org.junit.Test;

public class CollatzNumberTest {

	@Test
	public void CollatzNumberOf5ShouldReturnACollatzNumberWithNextNumberAs16() {
		Assert.assertEquals(5, CollatzNumber.of(5).getNumber().intValue());
	}

	@Test
	public void getSequenceShouldReturnTheSequenceOfNumbersForThisCollatzNumber() {
		CollatzNumber collatzNumber = CollatzNumber.of(5);
		Assert.assertEquals(6, collatzNumber.buildSequence().size());
		Assert.assertEquals(5, collatzNumber.getSequence(0).longValue());
		Assert.assertEquals(16, collatzNumber.getSequence(1).longValue());
		Assert.assertEquals(8, collatzNumber.getSequence(2).longValue());
		Assert.assertEquals(4, collatzNumber.getSequence(3).longValue());
		Assert.assertEquals(2, collatzNumber.getSequence(4).longValue());
		Assert.assertEquals(1, collatzNumber.getSequence(5).longValue());
	}

}
