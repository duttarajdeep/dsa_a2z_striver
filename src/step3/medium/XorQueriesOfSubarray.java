package step3.medium;

import java.util.Arrays;

public class XorQueriesOfSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 1, 3, 4, 8 };
		int[] nums = { 4, 8, 2, 10 };
//		int[][] queries = { { 0, 1 }, { 1, 2 }, { 0, 3 }, { 3, 3 } };
		int[][] queries = { { 2, 3 }, { 1, 3 }, { 0, 0 }, { 0, 3 } };
		System.out.println(Arrays.toString(xorQueries(nums, queries)));
		System.out.println(Arrays.toString(xorQueriesOpt(nums, queries)));

	}

	static int[] xorQueries(int[] arr, int[][] queries) {
		int n = queries.length;
		int[] ans = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			int cAns = arr[start];
			for (int j = start + 1; j <= end; j++) {
				cAns = cAns ^ arr[j];
			}
			ans[k] = cAns;
			k++;
		}
		return ans;
	}

	static int[] xorQueriesOpt(int[] arr, int[][] queries) {
		int[] ans = new int[queries.length];
		int[] prefixXor = new int[arr.length];
		prefixXor[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			prefixXor[i] = prefixXor[i - 1] ^ arr[i];
		}
		for (int i = 0; i < queries.length; i++) {
			int start = queries[i][0];
			int end = queries[i][1];
			if (start == 0) {
				ans[i] = prefixXor[end];
			} else {
				ans[i] = prefixXor[end] ^ prefixXor[start - 1];
			}
		}
		return ans;
	}

}
