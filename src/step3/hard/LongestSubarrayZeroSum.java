package step3.hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, -1, 3, 2, -2, -8, 1, 7, 10, 23 };
		System.out.println(getLongestSubarrayWithZeroSum(nums));

	}

	static int getLongestSubarrayWithZeroSum(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int maxLength = 0;
		int n = nums.length;
		int sum = 0;

		for (int j = 0; j < n; j++) {
			sum += nums[j];
			if (sum == 0) {
				maxLength = Math.max(maxLength, j + 1);
			} else {
				int lastSeenSumIdx = map.getOrDefault(sum, -1);
				if (lastSeenSumIdx != -1) {
					int currentLenOfSubarray = j - lastSeenSumIdx;
					maxLength = Math.max(lastSeenSumIdx, currentLenOfSubarray);
				} else {
					map.put(sum, j);
				}
			}
		}
		return maxLength;
	}

}
