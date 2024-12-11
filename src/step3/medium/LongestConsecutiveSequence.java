package step3.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 102, 4, 100, 1, 101, 3, 2, 1, 5 };
		System.out.println(longestConsSeqOpt(nums));

	}

	static int longestConsSeq(int[] nums) {
		Arrays.sort(nums);
		int longestLength = 0;
		int currentLength = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] - 1)
				currentLength++;
			else
				currentLength = 0;

			longestLength = Math.max(currentLength, longestLength);
		}
		return longestLength + 1;
	}

	static int longestConsSeqOpt(int[] nums) {
		int n = nums.length;
		if (n == 0)
			return 0;

		int longest = 1;
		Set<Integer> hashSet = new HashSet<>();
		for (int i : nums) {
			hashSet.add(i);
		}

		for (int i : hashSet) {
			// i is first of the sequence
			if (!hashSet.contains(i - 1)) {
				int count = 1;
				int x = i;
				while (hashSet.contains(x + 1)) {
					x++;
					count++;
				}
				longest = Math.max(count, longest);
			}
		}

		return longest;

	}

}
