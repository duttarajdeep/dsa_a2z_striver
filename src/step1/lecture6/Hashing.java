package step1.lecture6;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6, 3, 2, 1, 2, 3, 4, 5, 6, 4, 4, 3, 1, 1, 3, 4 };
		System.out.println(getCount(nums, 1));

		String s = "aabbcccddddde";
		System.out.println(getCount(s, 'd'));

		System.out.println(getCountByMap(nums, 3));
		System.out.println(getCountByMap(s, 'd'));
	}

	// Array based hashing
	static int getCount(int[] nums, int key) {
		int max = findMax(nums);
		int[] hash = new int[max + 1];

		for (int num : nums) {
			hash[num]++;
		}
		return hash[key];
	}

	static int findMax(int[] nums) {
		int max = nums[0];
		for (int num : nums) {
			if (num > max)
				max = num;
		}
		return max;
	}

	static int getCount(String s, char c) {
		int[] hash = new int[255];
		for (char ch : s.toCharArray()) {
			hash[ch]++;
		}
		return hash[c];
	}
	

	// map based hashing
	static int getCountByMap(int[] nums, int key) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : nums) {
			int currentCount = map.getOrDefault(num, 0);
			map.put(num, currentCount + 1);
		}
		return map.get(key);
	}

	static int getCountByMap(String s, char ch) {
		Map<Character, Integer> hash = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			int currentCount = hash.getOrDefault(c, 0);
			hash.put(c, currentCount + 1);
		}
		return hash.get(ch);
	}

}
