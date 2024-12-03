package step2.lecture1;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sort(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (nums[j] > nums[j + 1])
					swap(nums, j, j + 1);
			}
		}
	}

	static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
