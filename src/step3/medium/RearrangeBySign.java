package step3.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeBySign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = { 3, 1, -2, -5, 2, -4 };
		int[] nums = { 28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31 };
		rearrangeArrayOptimised(nums);
		System.out.println(Arrays.toString(nums));

	}

	static int[] rearrangeArray(int[] nums) {
		List<Integer> positive = new ArrayList<>();
		List<Integer> negative = new ArrayList<>();

		for (int i : nums) {
			if (i > 0)
				positive.add(i);
			else
				negative.add(i);
		}

		for (int i = 0; i < nums.length - 1; i += 2) {
			nums[i] = positive.get(i / 2);
			nums[i + 1] = negative.get(i / 2);
		}

		return nums;
	}

	static int[] rearrangeArrayOptimised(int[] nums) {
		int i = 0; // pointing to the position where we will put -ve num
		int j = 0; // for iterating

		while (j < nums.length) {
			if (j % 2 == 0 && nums[j] < 0) {
				while (nums[j] < 0 && j < nums.length)
					j++;
				swap(nums, i, j);
				j = i + 1;
			} else if (j % 2 == 1 && nums[j] > 0) {
				while (nums[j] > 0 && j < nums.length)
					j++;
				swap(nums, i, j);
				j = i + 1;
			} else {
				j++;
			}
			i++;
		}
		return nums;
	}

	static void swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

}
