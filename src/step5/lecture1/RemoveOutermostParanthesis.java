package step5.lecture1;

public class RemoveOutermostParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(()())(())";
		System.out.println(removeOuterParentheses(s));
		System.out.println(result(s));

	}

	static String removeOuterParentheses(String s) {
		int count = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ')')
				count--;
			if (count != 0)
				sb.append(c);
			if (c == '(')
				count++;
		}

		return sb.toString();
	}

	static private String result(String s) {
		int left = 0;
		int right = s.length() - 1;

		String temp = "";
		String ans = "";

		// Iterate the string and keep on adding to form a word
		// If empty space is encountered then add the current word to the result
		while (left <= right) {
			char ch = s.charAt(left);
			if (ch != ' ') {
				temp += ch;
			} else if (ch == ' ') {
				if (!ans.equals("")) {
					ans = temp + " " + ans;
				} else {
					ans = temp;
				}
				temp = "";
			}
			left++;
		}

		// If not empty string then add to the result(Last word is added)
		if (!temp.equals("")) {
			if (!ans.equals("")) {
				ans = temp + " " + ans;
			} else {
				ans = temp;
			}
		}

		return ans;
	}

}
