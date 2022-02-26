package org.omir.euler.problems10.problem11;

import java.util.ArrayList;
import java.util.List;

import org.omir.euler.utils.math.NumberUtils;

/**
 * <pre>
 * In the 20×20 grid below, four numbers along a diagonal line have been surrounded with brackets.
 * 08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
 * 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
 * 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
 * 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
 * 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
 * 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
 * 32 98 81 28 64 23 67 10>26<38 40 67 59 54 70 66 18 38 64 70
 * 67 26 20 68 02 62 12 20 95>63<94 39 63 08 40 91 66 49 94 21
 * 24 55 58 05 66 73 99 26 97 17>78<78 96 83 14 88 34 89 63 72
 * 21 36 23 09 75 00 76 44 20 45 35>14<00 61 33 97 34 31 33 95
 * 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
 * 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
 * 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
 * 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
 * 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
 * 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
 * 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
 * 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
 * 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
 * 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
 *
 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 * </pre>
 *
 * @author Jean-Michel BERNARD
 *
 */
public class LargestProductInAGrid {

	public static final int[][] GRID = new int[][] {
			{  8, 02, 22, 97, 38, 15, 00, 40, 00, 75, 04, 05, 07, 78, 52, 12, 50, 77, 91,  8 },
			{ 49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 00 },
			{ 81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 03, 49, 13, 36, 65 },
			{ 52, 70, 95, 23, 04, 60, 11, 42, 69, 24, 68, 56, 01, 32, 56, 71, 37, 02, 36, 91 },
			{ 22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80 },
			{ 24, 47, 32, 60, 99, 03, 45, 02, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50 },
			{ 32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70 },
			{ 67, 26, 20, 68, 02, 62, 12, 20, 95, 63, 94, 39, 63,  8, 40, 91, 66, 49, 94, 21 },
			{ 24, 55, 58, 05, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72 },
			{ 21, 36, 23,  9, 75, 00, 76, 44, 20, 45, 35, 14, 00, 61, 33, 97, 34, 31, 33, 95 },
			{ 78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 03, 80, 04, 62, 16, 14,  9, 53, 56, 92 },
			{ 16, 39, 05, 42, 96, 35, 31, 47, 55, 58, 88, 24, 00, 17, 54, 24, 36, 29, 85, 57 },
			{ 86, 56, 00, 48, 35, 71, 89, 07, 05, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58 },
			{ 19, 80, 81, 68, 05, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 04, 89, 55, 40 },
			{ 04, 52,  8, 83, 97, 35, 99, 16, 07, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66 },
			{ 88, 36, 68, 87, 57, 62, 20, 72, 03, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69 },
			{ 04, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18,  8, 46, 29, 32, 40, 62, 76, 36 },
			{ 20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 04, 36, 16 },
			{ 20, 73, 35, 29, 78, 31, 90, 01, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 05, 54 },
			{ 01, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 01, 89, 19, 67, 48 }
	};

	public static final int RANGE = 4;

	public static List<Double> findHorizontalNumbersOfLineStartingFromIndex(int line, int startingIndex) {
		return findHorizontalNumbersOfLineStartingFromIndex(line, startingIndex, RANGE);
	}

	public static List<Double> findHorizontalNumbersOfLineStartingFromIndex(int line, int startingIndex, int range) {
		List<Double> list = new ArrayList<>();
		for (int j = startingIndex; lineConstraint(startingIndex, range, j); j++) {
			list.add((double) GRID[line][j]);
		}
		return list;
	}

	public static List<Double> findVerticalNumbersOfColumnStartingFromIndex(int column, int startingIndex) {
		return findVerticalNumbersOfColumnStartingFromIndex(column, startingIndex, RANGE);
	}

	public static List<Double> findVerticalNumbersOfColumnStartingFromIndex(int column, int startingIndex, int range) {
		List<Double> list = new ArrayList<>();
		for (int i = startingIndex; columnConstraint(startingIndex, range, i); i++) {
			list.add((double) GRID[i][column]);
		}
		return list;
	}

	public static List<Double> findSouthEastDiagonalNumbersStartingFromIndex(int line, int column) {
		return findSouthEastDiagonalNumbersStartingFromIndex(line, column, RANGE);
	}

	public static List<Double> findSouthEastDiagonalNumbersStartingFromIndex(int line, int column, int range) {
		List<Double> list = new ArrayList<>();
		for (int i = line, j = column; southEastDiagonalConstraint(line, column, range, i, j); i++, j++) {
			list.add((double) GRID[i][j]);
		}
		return list;
	}

	public static List<Double> findSouthWestDiagonalNumbersStartingFromIndex(int line, int column) {
		List<Double> list = new ArrayList<>();
		for (int i = line, j = column; lineConstraint(line, RANGE, i) && oppositeColumnConstraint(j); i++, j--) {
			list.add((double) GRID[i][j]);
		}
		return list;
	}

	private static boolean lineConstraint(int line, int range, int i) {
		return i < line + range && i < GRID.length;
	}

	private static boolean columnConstraint(int column, int range, int j) {
		return j < column + range && j < GRID[0].length;
	}

	private static boolean oppositeColumnConstraint(int j) {
		return j >= 0;
	}

	private static boolean southEastDiagonalConstraint(int line, int column, int range, int i, int j) {
		return lineConstraint(line, range, i) && columnConstraint(column, range, j);
	}

	public static List<Double> findHighestProductOfNumbersInLine(int line) {
		List<Double> solution = new ArrayList<>();
		double highestProductOfNumbersInLine = 0;
		for (int i = 0; i + RANGE < GRID.length; i++) {
			List<Double> candidate = findHorizontalNumbersOfLineStartingFromIndex(line, i);
			double product = NumberUtils.product(candidate);
			if (highestProductOfNumbersInLine < product) {
				highestProductOfNumbersInLine = product;
				solution = candidate;
			}
		}
		return solution;
	}

	public static List<Double> findHighestProductOfNumbersInColumn(int column) {
		List<Double> solution = new ArrayList<>();
		double highestProductOfNumbersInColumn = 0;
		for (int j = 0; j + RANGE < GRID.length; j++) {
			List<Double> candidate = findVerticalNumbersOfColumnStartingFromIndex(column, j);
			double product = NumberUtils.product(candidate);
			if (highestProductOfNumbersInColumn < product) {
				highestProductOfNumbersInColumn = product;
				solution = candidate;
			}
		}
		return solution;
	}

	public static List<Double> findHighestProductOfNumbersInSouthEastDiagonal(int line, int column) {
		List<Double> solution = new ArrayList<>();
		double highestProductOfNumbersInDiagonal = 0;
		for (int i = line, j = column; i < GRID.length && j < GRID[i].length; i++, j++) {
			List<Double> candidate = findSouthEastDiagonalNumbersStartingFromIndex(i, j);
			double product = NumberUtils.product(candidate);
			if (highestProductOfNumbersInDiagonal < product) {
				highestProductOfNumbersInDiagonal = product;
				solution = candidate;
			}
		}
		return solution;
	}

	public static List<Double> findHighestProductOfNumbersInSouthWestDiagonal(int line, int column) {
		List<Double> solution = new ArrayList<>();
		double highestProductOfNumbersInDiagonal = 0;
		solution.add((double) GRID[line][column]);
		for (int i = line, j = column; i < GRID.length && j >= 0; i++, j--) {
			List<Double> candidate = findSouthWestDiagonalNumbersStartingFromIndex(i, j);
			double product = NumberUtils.product(candidate);
			if (highestProductOfNumbersInDiagonal < product) {
				highestProductOfNumbersInDiagonal = product;
				solution = candidate;
			}
		}
		return solution;
	}

	public static Double findHighestProductOfNumbers() {
		List<Double> horizontalSolution = computeHorizontalSolution();
		List<Double> verticalSolution = computeVerticalSolution();
		List<Double> diagonalSouthEastSolution = computeSouthEastSolution();
		List<Double> diagonalSouthWestSolution = computeSouthWestSolution();

		List<Double> solution = findSolutionWithHighestProductOfNumbersBetween(
				findSolutionWithHighestProductOfNumbersBetween(horizontalSolution, verticalSolution),
				findSolutionWithHighestProductOfNumbersBetween(diagonalSouthEastSolution, diagonalSouthWestSolution)
		);
		return NumberUtils.product(solution);
	}

	private static List<Double> findSolutionWithHighestProductOfNumbersBetween(List<Double> solution1, List<Double> solution2) {
		if (NumberUtils.product(solution1) > NumberUtils.product(solution2)) {
			return solution1;
		} else {
			return solution2;
		}
	}

	private static List<Double> computeSouthWestSolution() {
		List<Double> diagonalSouthWestSolution = new ArrayList<>();
		Double product = 0d;
		for (int i = 0; i < GRID.length; i++) {
			for (int j = 0; j < GRID.length; j++) {
				List<Double> localDiagonalSouthWestSolution = findHighestProductOfNumbersInSouthWestDiagonal(i, j);
				if (diagonalSouthWestSolution.isEmpty()) {
					diagonalSouthWestSolution = localDiagonalSouthWestSolution;
					product = NumberUtils.product(localDiagonalSouthWestSolution);
				} else {
					Double localProduct = NumberUtils.product(localDiagonalSouthWestSolution);
					if (localProduct > product) {
						diagonalSouthWestSolution = localDiagonalSouthWestSolution;
						product = localProduct;
					}
				}
			}
		}
		return diagonalSouthWestSolution;
	}

	private static List<Double> computeSouthEastSolution() {
		List<Double> diagonalSouthEastSolution = new ArrayList<>();
		Double product = 0d;
		for (int i = 0; i < RANGE; i++) {
			for (int j = 0; j < RANGE; j++) {
				List<Double> localDiagonalSouthEastSolution = findHighestProductOfNumbersInSouthEastDiagonal(i, j);
				if (diagonalSouthEastSolution.isEmpty()) {
					diagonalSouthEastSolution = localDiagonalSouthEastSolution;
					product = NumberUtils.product(localDiagonalSouthEastSolution);
				} else {
					Double localProduct = NumberUtils.product(localDiagonalSouthEastSolution);
					if (localProduct > product) {
						diagonalSouthEastSolution = localDiagonalSouthEastSolution;
						product = localProduct;
					}
				}
			}
		}
		return diagonalSouthEastSolution;
	}

	private static List<Double> computeHorizontalSolution() {
		List<Double> horizontalSolution = new ArrayList<>();
		Double product = 0d;
		for (int i = 0; i < RANGE; i++) {
			List<Double> localHorizontalSolution = findHighestProductOfNumbersInLine(i);
			if (horizontalSolution.isEmpty()) {
				horizontalSolution = localHorizontalSolution;
				product = NumberUtils.product(horizontalSolution);
			} else {
				Double localProduct = NumberUtils.product(localHorizontalSolution);
				if (localProduct > product) {
					horizontalSolution = localHorizontalSolution;
					product = localProduct;
				}
			}
		}
		return horizontalSolution;
	}

	private static List<Double> computeVerticalSolution() {
		List<Double> verticalSolution = new ArrayList<>();
		Double product = 0d;
		for (int j = 0; j < RANGE; j++) {
			List<Double> localVerticalSolution = findHighestProductOfNumbersInColumn(j);
			if (verticalSolution.isEmpty()) {
				verticalSolution = localVerticalSolution;
				product = NumberUtils.product(localVerticalSolution);
			} else {
				Double localProduct = NumberUtils.product(localVerticalSolution);
				if (localProduct > product) {
					verticalSolution = localVerticalSolution;
					product = localProduct;
				}
			}
		}
		return verticalSolution;
	}

}
