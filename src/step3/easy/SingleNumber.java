package step3.easy;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 2, 1 };
		System.out.println(singleNumber(nums));
	}

	static int singleNumber(int[] nums) {
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;
	}

}
