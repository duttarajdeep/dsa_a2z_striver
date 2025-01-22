package aditya.verma.recursion;

import java.util.ArrayList;
import java.util.List;

public class BalancedParenthesis {

	public static void main(String[] args) {
		int n = 3;
		List<String> res = new ArrayList<String>();
		solve("", 3, 3, res);
		for (String s : res) {
			System.out.println(s);
		}
	}

	static void solve(String op, int open, int close, List<String> res) {
		if (open == 0 && close == 0) {
			res.add(op);
			return;
		}

		if (open != 0) {
			String op1 = op + "(";
			solve(op1, open - 1, close, res);
		}

		if (open < close) {
			String op2 = op + ")";
			solve(op2, open, close - 1, res);
		}

	}

}
