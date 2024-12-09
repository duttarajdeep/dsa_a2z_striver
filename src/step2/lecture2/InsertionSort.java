package step2.lecture2;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 4, 3, 2, 1 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sort(int[] nums) {
		insertionSort(nums, nums.length);
	}

	static void insertionSort(int[] nums, int n) {
		if (n == 1)
			return;

		// recursive call
		insertionSort(nums, n - 1);

		// insert current element at correct postion
		// [2,3,4,5,1]
		int last = nums[n - 1];
		int j = n - 2;
		while (j >= 0 && nums[j] > last) {
			nums[j + 1] = nums[j];
			j--;
		}
		nums[j + 1] = last;
	}
}
