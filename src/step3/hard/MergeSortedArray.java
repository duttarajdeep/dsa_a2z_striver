package step3.hard;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = { 2, 5, 6 };
		int n = 3;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}

	static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m - 1;
		int j = n - 1;
		int x = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[x] = nums1[i];
				i--;
				x--;
			} else {
				nums1[x] = nums2[j];
				j--;
				x--;
			}
		}
		while (j >= 0) {
			nums1[x] = nums2[j];
			j--;
			x--;
		}
	}

}
