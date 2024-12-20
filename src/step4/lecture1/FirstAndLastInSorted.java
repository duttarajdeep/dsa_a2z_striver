package step4.lecture1;

import java.util.Arrays;

public class FirstAndLastInSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3 };
		System.out.println(Arrays.toString(searchRange(nums, 1)));

	}

	static int[] searchRange(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;
		int[] result = { -1, -1 };

		if (nums.length == 0)
			return result;

		if (nums[0] == target) {
			result[0] = 0;
			result[1] = 0;
			return result;
		}

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] < target) {
				low = mid + 1;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				if (nums[mid] == nums[mid + 1]) {
					result[0] = mid;
					result[1] = mid + 1;
				} else if (nums[mid - 1] == nums[mid]) {
					result[0] = mid - 1;
					result[1] = mid;
				}
				return result;
			}
		}

		return result;
	}

}
