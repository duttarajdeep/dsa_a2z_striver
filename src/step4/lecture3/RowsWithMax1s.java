package step4.lecture3;

import java.util.Arrays;

public class RowsWithMax1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] { { 0, 1 }, { 1, 0 } };
		System.out.println(Arrays.toString(rowAndMaximumOnes(matrix)));

	}

	static int[] rowAndMaximumOnes(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int maxCount = 0;
		int maxPos = 0;
		for (int i = 0; i < m; i++) {
			int countOnes = n - lowerBound(mat[i], 1);
			if (countOnes > maxCount) {
				maxCount = countOnes;
				maxPos = i;
			}
		}
		return new int[] { maxPos, maxCount };
	}

	static int lowerBound(int[] arr, int k) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] >= k) {
				ans = mid;
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return ans;
	}

}
