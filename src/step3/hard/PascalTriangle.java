package step3.hard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		generate(5);
	}

	static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> pascalTriangle = new ArrayList<>();

		if (numRows == 0)
			return pascalTriangle;

		List<Integer> firstRow = new ArrayList<>();
		firstRow.add(1);
		pascalTriangle.add(firstRow);

		List<Integer> secondRow = new ArrayList<>();
		secondRow.add(1);
		secondRow.add(1);
		pascalTriangle.add(secondRow);

		for (int i = 2; i < numRows; i++) {
			List<Integer> prevRow = pascalTriangle.get(i - 1);
			List<Integer> currentRow = new ArrayList<>();
			currentRow.add(1);

			for (int j = 1; j < i; j++) {
				int val = prevRow.get(j - 1) + prevRow.get(j);
				currentRow.add(val);
			}
			currentRow.add(1);
			pascalTriangle.add(currentRow);
		}

		return pascalTriangle;
	}

}
