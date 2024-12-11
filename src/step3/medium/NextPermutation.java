package step3.medium;

import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));

	}

	static void nextPermutation(int[] nums) {
		/**
		 * 3 step solution thought process is below
		 * 
		 * Step 1. From the rear of the array, find the index where the increasing value
		 * curve suddenly drops, i.e we find an element lesser that the current
		 * 
		 * Step 2. Search for the least element from the right and replace with the
		 * index where the dip occurred
		 * 
		 * Step 3: Reverse all the elements after index, to get the lowest number, after
		 * swap. This becomes our next permutation
		 */

		int dipIndex = -1;

		// Step 1
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				dipIndex = i;
				break;
			}
		}

		if (dipIndex == -1) {
			Arrays.sort(nums);
			return;
		}

		// Step 2
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] > nums[dipIndex]) {
				swap(nums, i, dipIndex);
				break;
			}
		}

		// Step 3
		reverse(nums, dipIndex + 1, nums.length - 1);

	}

	static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			swap(nums, start, end);
			start++;
			end--;
		}
	};

}
