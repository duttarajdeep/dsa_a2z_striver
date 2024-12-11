package step3.medium;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majorityElement(nums));

	}

	static int majorityElement(int[] nums) {
		int winner = nums[0];
		int votes = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == winner)
				votes++;
			else
				votes--;

			if (votes == 0) {
				winner = nums[i];
				votes = 1;
			}

		}
		return winner;
	}

}
