package step5.lecture1;

public class RotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rotateString("abcde", "bcdes"));

	}

	static boolean rotateString(String a, String b) {
		String input = a;
		for (int i = 0; i < a.length(); i++) {
			String rotated = rotate(input);
			if (rotated.equals(b))
				return true;
			input = rotated;
		}
		return false;
	}

	static String rotate(String a) {
		String res = a.substring(1, a.length());
		res = res + String.valueOf(a.charAt(0));
		return res;
	}

}
