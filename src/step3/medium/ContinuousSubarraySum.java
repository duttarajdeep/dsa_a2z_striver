package step3.medium;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 0, 0, 0 };
		System.out.println(checkSubarraySum(nums, 3));
	}

	static boolean checkSubarraySum(int[] nums, int k) {
		Map<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(0, -1);

		int total = 0;

		for (int i = 0; i < nums.length; i++) {
			total += nums[i];
			int r = total % k;
			if (!hashMap.containsKey(r)) {
				hashMap.put(r, i);
			} else if (i - hashMap.get(r) > 1) {
				return true;
			}
		}
		return false;
	}

}
