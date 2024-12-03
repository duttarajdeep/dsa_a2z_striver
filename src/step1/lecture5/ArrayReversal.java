package step1.lecture5;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void reverse(int[] nums) {
        int i = 0;
    	helper(nums, i);
    }
    
    static void helper(int[] nums, int i) {
    	if(i >= nums.length / 2) return;
    	swap(nums, i, nums.length - i - 1);
    	helper(nums, i + 1);
    }
    
    static void swap(int [] nums, int i, int j) {
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    		
    }
}
