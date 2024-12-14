package step3.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		threeSum(nums);
	}

	static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		int n = nums.length;
		Arrays.sort(nums);

		for (int i = 0; i < n; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int j = i + 1;
			int k = n - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0) {
					j++;
				} else if (sum > 0) {
					k--;
				} else {
					List<Integer> triplet = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
					result.add(triplet);
					j++;
					k--;
					while (j < k && nums[j - 1] == nums[j])
						j++;
					while (j < k && nums[k] == nums[k + 1])
						k--;
				}
			}

		}

		return result;
	}

}
