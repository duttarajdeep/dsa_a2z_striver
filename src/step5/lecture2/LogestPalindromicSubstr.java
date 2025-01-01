package step5.lecture2;

public class LogestPalindromicSubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("aacabdkacaa"));

	}

	static String longestPalindrome(String s) {
		int max = 0;
		int start = 0;
		int end = 0;
		int n = s.length();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (s.charAt(i) == s.charAt(j))
					if (isValidPalindrome(s.substring(i, j + 1)))
						if (j - i + 1 > max) {
							start = i;
							end = j;
							max = j - i + 1;
						}
			}
		}
		return s.substring(start, end + 1);
	}

	static boolean isValidPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
