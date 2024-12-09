package step2.lecture2;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = { 5, 4, 3, 2, 1 };
		sort(nums, nums.length);
		System.out.println(Arrays.toString(nums));
	}

	static void sort(int[] nums, int n) {
		if (n == 1)
			return;

		for (int i = 0; i < n - 1; i++) {
			if (nums[i] > nums[i + 1])
				swap(nums, i, i + 1);
		}
		
		sort(nums, n - 1);
	}

	static void swap(int[] nums, int low, int high) {
		int temp = nums[low];
		nums[low] = nums[high];
		nums[high] = temp;
	}

}
