package step3.medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 1 };
		System.out.println(subarraySum(nums, 2));

	}

	static int subarraySum(int[] nums, int k) {
		int count = 0;
		int preSum = 0;

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		for (int i = 0; i < nums.length; i++) {
			preSum += nums[i];
			int remove = preSum - k;
			count += map.getOrDefault(remove, 0);
			map.put(preSum, map.getOrDefault(preSum, 0) + 1);
		}

		return count;
	}

}
