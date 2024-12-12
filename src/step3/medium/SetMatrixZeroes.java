package step3.medium;

import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	static void setZeroes(int[][] matrix) {
		// Thought process: The 1st row and 1st col will act as hash array, where we
		// mark the elements where we need to convert the elements later

		/**
		 * Step 1: Iterate through the matrix and mark in the hash array, wherever we
		 * encounter a 0. For matrix[0][0], where we will have a collision, we will
		 * store the hash in a seperate var col0
		 * 
		 * Step 2: Start iterating from 1,1 and check the hash array, wherever we marked
		 * as 0, convert the current element to 0
		 * 
		 * Step 3: Iterate through the row1 and convert the elements
		 * 
		 * Step 4: Iterate through the col1 and convert the elements
		 * 
		 */

		int n = matrix.length;
		int m = matrix[0].length;
		int col0 = 1;

		// step 1
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) {
					// mark the ith row in hash array
					matrix[i][0] = 0;
					// mark the jth col in hash array
					if (j != 0)
						matrix[0][j] = 0;
					else
						col0 = 0;
				}
			}
		}

		// step 2
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (matrix[i][j] != 0) {
					if (matrix[i][0] == 0 || matrix[0][j] == 0)
						matrix[i][j] = 0;
				}
			}
		}

		// step 3
		if (matrix[0][0] == 0) {
			for (int j = 0; j < m; j++) {
				matrix[0][j] = 0;
			}
		}

		// step 4
		if (col0 == 0) {
			for (int i = 0; i < n; i++) {
				matrix[i][0] = 0;
			}
		}
	}

}
