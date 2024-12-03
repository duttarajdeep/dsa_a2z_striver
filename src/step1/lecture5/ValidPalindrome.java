package step1.lecture5;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
//		String s = "madam";
		System.out.println(isPalindrome(s.toLowerCase()));
	}

	static boolean isPalindrome(String s) {
		return checkIfPalindrome(s, 0);

	}

	static boolean checkIfPalindrome(String s, int i) {
		if(i >= s.length()/2) return true;
		if(s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
		if(!isValidChar(s.charAt(i))) return checkIfPalindrome(s, i + 1);
		if(!isValidChar(s.charAt(s.length() - i - 1))) return checkIfPalindrome(s, i + 1);
		
		return checkIfPalindrome(s, i + 1);
	}
	
	static boolean isValidChar(char c) {
		return (c >= 0 && c <= 9) || (c >= 'a' && c <= 'z');
	}

}
