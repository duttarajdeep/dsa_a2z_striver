package step3.easy;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

	static void moveZeroes(int[] nums) {
		int j = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				j = i;
				break;
			}
		}
		if (j == -1)
			return;

		for (int i = j + 1; i < nums.length; i++) {
			if (nums[i] != 0) {
				swap(nums, i, j);
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
