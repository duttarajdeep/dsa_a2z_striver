package step4.lecture3;

public class MedianInRowWiseSortedArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
		System.out.println(median(mat));
	}

	static int median(int mat[][]) {
		int low = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;

		int m = mat.length;
		int n = mat[0].length;

		for (int i = 0; i < m; i++) {
			low = Math.min(low, mat[i][0]);
			high = Math.max(high, mat[i][n - 1]);
		}

		int req = (m * n) / 2;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			int countOfSmaller = countSmaller(mat, mid);
			if (countOfSmaller <= req)
				low = mid + 1;
			else
				high = mid - 1;
		}

		return low;
	}

	static int countSmaller(int[][] mat, int x) {
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			count += upperBound(mat[i], x);
		}
		return count;
	}

	static int upperBound(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		int ans = arr.length;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] > x) {
				ans = mid;
				high = mid - 1;

			} else
				low = mid + 1;
		}
		return ans;
	}

}
