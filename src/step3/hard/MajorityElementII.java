package step3.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 2, 3 };
		majorityElementOpt(nums);
	}

	static List<Integer> majorityElement(int[] nums) {
		int n = nums.length;
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int currentCount = map.getOrDefault(nums[i], 0);
			map.put(nums[i], currentCount + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > n / 3)
				result.add(entry.getKey());
		}
		return result;
	}

	static List<Integer> majorityElementOpt(int[] nums) {
		int n = nums.length;
		List<Integer> result = new ArrayList<>();

		// count of votes
		int count1 = 0;
		int count2 = 0;

		// majority elements
		int mEle1 = Integer.MIN_VALUE;
		int mEle2 = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			int current = nums[i];

			if (count1 == 0 && mEle2 != current) {
				mEle1 = current;
				count1 = 1;
			} else if (count2 == 0 && mEle1 != current) {
				mEle2 = current;
				count2 = 1;
			} else if (current == mEle1)
				count1++;
			else if (current == mEle2)
				count2++;
			else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;
		for (int i = 0; i < n; i++) {
			int current = nums[i];
			if (current == mEle1)
				count1++;
			if (current == mEle2)
				count2++;
		}

		int cutOff = n / 3 + 1;
		if (count1 >= cutOff)
			result.add(mEle1);
		if (count2 >= cutOff)
			result.add(mEle2);

		return result;
	}
}
