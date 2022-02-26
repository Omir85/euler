package org.omir.euler.problems10.problem11;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.omir.euler.utils.math.NumberUtils;

public class LargestProductInAGridTest {

	@Test
	public void productOfTheFirstFourHorizontalNumbersFirstLine() {
		List<Double> list = LargestProductInAGrid.findHorizontalNumbersOfLineStartingFromIndex(0, 0);
		Assert.assertEquals(8 * 2 * 22 * 97, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheSecondFourHorizontalNumbersFirstLine() {
		List<Double> list = LargestProductInAGrid.findHorizontalNumbersOfLineStartingFromIndex(0, 1);
		Assert.assertEquals(2 * 22 * 97 * 38, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheThirdFourHorizontalNumbersFirstLine() {
		List<Double> list = LargestProductInAGrid.findHorizontalNumbersOfLineStartingFromIndex(0, 2);
		Assert.assertEquals(22 * 97 * 38 * 15, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheFirstFourHorizontalNumbersSecondLine() {
		List<Double> list = LargestProductInAGrid.findHorizontalNumbersOfLineStartingFromIndex(1, 0);
		Assert.assertEquals(49 * 49 * 99 * 40, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheFirstFourVerticalNumbersFromFirstLine() {
		List<Double> list = LargestProductInAGrid.findVerticalNumbersOfColumnStartingFromIndex(0, 0);
		Assert.assertEquals(8 * 49 * 81 * 52, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheSecondFourVerticalNumbersFromFirstColumn() {
		List<Double> list = LargestProductInAGrid.findVerticalNumbersOfColumnStartingFromIndex(0, 1);
		Assert.assertEquals(49 * 81 * 52 * 22, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheFirstFourVerticalNumbersFromSecondColumn() {
		List<Double> list = LargestProductInAGrid.findVerticalNumbersOfColumnStartingFromIndex(1, 0);
		Assert.assertEquals(2 * 49 * 49 * 70, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheSeventeenthFourVerticalNumbersFromFirstColumn() {
		List<Double> list = LargestProductInAGrid.findVerticalNumbersOfColumnStartingFromIndex(0, 17);
		Assert.assertEquals(20 * 20 * 1, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheFourDiagonalNumbersGoingSouthEastFromFirstLineFirstColumn() {
		List<Double> list = LargestProductInAGrid.findSouthEastDiagonalNumbersStartingFromIndex(0, 0);
		Assert.assertEquals(8 * 49 * 31 * 23, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheFourDiagonalNumbersGoingSouthEastFromFirstLineSecondColumn() {
		List<Double> list = LargestProductInAGrid.findSouthEastDiagonalNumbersStartingFromIndex(0, 1);
		Assert.assertEquals(2 * 99 * 73 * 4, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheFourDiagonalNumbersGoingSouthEastFromSecondLineSecondColumn() {
		List<Double> list = LargestProductInAGrid.findSouthEastDiagonalNumbersStartingFromIndex(1, 1);
		Assert.assertEquals(49 * 31 * 23 * 51, NumberUtils.product(list), 0);
	}

	@Test
	public void productOfTheFourDiagonalNumbersGoingSouthWestFromFirstLineFourthColumn() {
		List<Double> list = LargestProductInAGrid.findSouthWestDiagonalNumbersStartingFromIndex(0, 3);
		Assert.assertEquals(97 * 99 * 49 * 52, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInFirstLine() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInLine(0);
		Assert.assertEquals(12 * 50 * 77 * 91, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSecondLine() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInLine(1);
		Assert.assertEquals(98 * 43 * 69 * 48, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInFirstColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInColumn(0);
		Assert.assertEquals(49 * 81 * 52 * 22, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSecondColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInColumn(1);
		Assert.assertEquals(70 * 31 * 47 * 98, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthEastDiagonalFromFirstLineFirstColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthEastDiagonal(0, 0);
		Assert.assertEquals(67 * 20 * 97 * 45, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthEastDiagonalFromFirstLineSecondColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthEastDiagonal(0, 1);
		Assert.assertEquals(79 * 63 * 62 * 36, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthEastDiagonalFromFirstLineLastColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthEastDiagonal(0, 19);
		Assert.assertEquals(8, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthEastDiagonalFromLastLineLastColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthEastDiagonal(19, 19);
		Assert.assertEquals(48, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthEastDiagonalFromLine10Column10() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthEastDiagonal(10, 10);
		Assert.assertEquals(44 * 52 * 26 * 32, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthWestDiagonalFromLastLineFirstColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthWestDiagonal(19, 0);
		Assert.assertEquals(1, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthWestDiagonalFromLastLineSecondColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthWestDiagonal(19, 1);
		Assert.assertEquals(70, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthWestDiagonalFromSecondToLastLineSecondColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthWestDiagonal(18, 1);
		Assert.assertEquals(73, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthWestDiagonalFromThirdToLastLineSecondColumn() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthWestDiagonal(17, 1);
		Assert.assertEquals(69 * 20, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthWestDiagonalFromThirdToLine10Column10() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthWestDiagonal(10, 10);
		Assert.assertEquals(69 * 99 * 62 * 38, NumberUtils.product(list), 0);
	}

	@Test
	public void highestProductOfFourNumbersInSouthWestDiagonalFromFirstLineColumn18() {
		List<Double> list = LargestProductInAGrid.findHighestProductOfNumbersInSouthWestDiagonal(0, 18);
		Assert.assertEquals(89 * 94 * 97 * 87, NumberUtils.product(list), 0);
	}

	@Test
	public void solution() {
		// diagonal south west 89 94 97 87
		Assert.assertEquals(new Double(70600674), LargestProductInAGrid.findHighestProductOfNumbers());
	}

}
