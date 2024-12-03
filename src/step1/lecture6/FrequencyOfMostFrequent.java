package step1.lecture6;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfMostFrequent {
	
	public static void main(String[] args) {
		int[] nums = {1,4,8,13};
		maxFrequency(nums, 5);
	}
	
	static int maxFrequency(int[] nums, int k) {
		Map<Integer, Integer> hash = new HashMap<>();
		for(int num: nums) {
			int currentCount = hash.getOrDefault(num, 0);
			hash.put(num, currentCount + 1);
		}
		
		return 0;
		
	}

}
