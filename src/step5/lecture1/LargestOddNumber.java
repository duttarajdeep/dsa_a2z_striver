package step5.lecture1;

public class LargestOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "4206";
		System.out.println(largestOddNumber(num));

	}

	static String largestOddNumber(String num) {
		int oddIdx = -1;
		for (int i = num.length() - 1; i >= 0; i--) {
			char c = num.charAt(i);
			if (c % 2 != 0) {
				oddIdx = i;
				break;
			}
		}
		return num.substring(0, oddIdx + 1);
	}

}
