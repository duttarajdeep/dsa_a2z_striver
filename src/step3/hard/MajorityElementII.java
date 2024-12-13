package step3.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int currentCount = map.getOrDefault(nums[i], 0);
            map.put(nums[i], currentCount + 1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > n / 3) result.add(entry.getKey());
        }
        return result;
    }

}
