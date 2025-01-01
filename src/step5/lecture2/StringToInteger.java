package step5.lecture2;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "1337c0d3"
		// "words and 987"
		System.out.println(myAtoi("words and 987"));

	}

	static int myAtoi(String s) {
		StringBuilder sb = new StringBuilder();

		// whitespace
		s = s.trim();

		// signed-ness
		char sign = s.charAt(0);

		// conversion
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (isDigit(c)) {
				sb.append(c);
			} else {
				break;
			}
		}

		// rounding

		return 0;
	}

	static boolean isDigit(char c) {
		return c >= '1' && c <= '9';
	}

}
