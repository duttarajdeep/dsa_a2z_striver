package step3.easy;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] nums = { 28078, 19451, 935, 28892, 2242, 3570, 5480, 231 };
		System.out.println(getSecondLargest(nums));
	}

	static int getSecondLargest(int[] arr) {
		// Code Here
		int max = -1;
		int secondMax = -1;
		for (int num : arr) {
			if (num > max && num > secondMax) {
				secondMax = max;
				max = num;
			} else if (num < max && num > secondMax) {
				secondMax = num;

			}
		}
		return secondMax;
	}

}
