package step4.lecture3;

public class FindPeakElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] findPeakGrid(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;

		int low = 0;
		int high = n - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int row = findMaxRowInCol(mat, mid);
			int left = mid - 1 >= 0 ? mat[row][mid - 1] : -1;
			int right = mid + 1 < n ? mat[row][mid + 1] : -1;
			if (mat[row][mid] > left && mat[row][mid] > right) {
				return new int[] { row, mid };
			} else if (mat[row][mid] < left) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return new int[] { -1, -1 };
	}

	public int findMaxRowInCol(int[][] matrix, int col) {
		int maxIdx = -1;
		int maxVal = 0;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] > maxVal) {
				maxVal = matrix[i][col];
				maxIdx = i;
			}
		}
		return maxIdx;
	}

}
