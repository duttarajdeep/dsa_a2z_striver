package step3.easy;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2 };
		System.out.println(removeDuplicates(nums));

	}

	static int removeDuplicates(int[] nums) {
		int i = 0, j = 0;
		while (j < nums.length) {
			if (nums[i] < nums[j]) {
				nums[i + 1] = nums[j];
				i++;
			}
			j++;
		}
		return i + 1;
	}

}
