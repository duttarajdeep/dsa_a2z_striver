package step2.lecture1;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1 };
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			int minIndex = findMin(nums, i, nums.length - 1);
			swap(nums, i, minIndex);
		}
	}

	static int findMin(int[] nums, int low, int high) {
		int min = low;
		for (int i = low; i <= high; i++) {
			if (nums[i] < nums[min])
				min = i;
		}
		return min;
	}

	static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
