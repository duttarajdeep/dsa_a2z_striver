package aditya.verma.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> res = letterCasePermutation("a1b2");
		for (String s : res) {
			System.out.println(s);
		}

	}

	static List<String> letterCasePermutation(String s) {
		return solve(s, "");
	}

	static List<String> solve(String ip, String op) {
		List<String> res = new ArrayList<>();
		if (ip.length() == 0) {
			res.add(op);
			return res;
		}

		if (isDigit(ip.charAt(0))) {
			// we have 1 choice
			String op1 = op + ip.substring(0, 1);
			ip = ip.substring(1);
			res.addAll(solve(ip, op1));
		} else {
			// we have 2 choices
			// 1: take lower case
			String op1 = op + ip.substring(0, 1).toLowerCase();
			// 2: take upper case
			String op2 = op + ip.substring(0, 1).toUpperCase();
			ip = ip.substring(1);

			// solve left subtree
			res.addAll(solve(ip, op1));

			// solve right subtree
			res.addAll(solve(ip, op2));
		}

		return res;
	}

	static boolean isDigit(char c) {
		return c >= '0' && c <= '9';
	}

}
