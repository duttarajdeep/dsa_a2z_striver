package step2.lecture1;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		sort(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while(j > 0 && nums[j - 1] > nums[j]) {
				swap(nums, j-1, j);
				j--;
			}
		}
	}
	
	static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
