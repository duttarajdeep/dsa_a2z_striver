package step3.medium;

import java.util.Arrays;

public class SortColors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 0 };
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void sortColors(int[] nums) {
		int i = 0; // track 0's
		int j = 0; // iterate throught the array
		int k = nums.length - 1; // track 1's

		while (j <= k && i < k) {
			if (nums[j] == 0) {
				swap(nums, i, j);
				i++;
				j++;
			} else if (nums[j] == 2) {
				swap(nums, j, k);
				k--;
			} else {
				j++;
			}
		}
	}

	static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
