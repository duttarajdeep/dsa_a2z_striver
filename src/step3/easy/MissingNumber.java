package step3.easy;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
//		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int[] nums = { 0, 1 };
		System.out.println(missingNumberUsingXOR(nums));

	}

	static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i)
				return i + 1;
		}
		return nums.length;
	}

	static int missingNumberOptimised(int[] nums) {
		int n = nums.length;
		int sum = (n * (n + 1)) / 2;
		int sumOfArray = Arrays.stream(nums).sum();
		return sum - sumOfArray;
	}

	static int missingNumberUsingXOR(int[] nums) {
		int expectedXor = 0;
		int actualXor = 0;
		for (int i = 0; i < nums.length; i++) {
			actualXor = actualXor ^ nums[i];
			expectedXor = expectedXor ^ i;
		}
		expectedXor = expectedXor ^ nums.length;
		return expectedXor ^ actualXor;
	}

}
