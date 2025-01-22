package aditya.verma.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Generate all binary strings without consecutive 1’s Last Updated : 30 Jul,
 * 2024 Given an integer, K. Generate all binary strings of size k without
 * consecutive 1’s.
 * 
 * Examples:
 * 
 * Input : K = 3 Output : 000 , 001 , 010 , 100 , 101 Input : K = 4 Output :0000
 * 0001 0010 0100 0101 1000 1001 1010
 */

public class BinStrWithoutCons1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		List<String> res = solve(k, "");
		for (String s : res) {
			System.out.println(s);
		}
	}

	static List<String> solve(int k, String op) {
		List<String> res = new ArrayList<>();

		if (k == 0) {
			res.add(op);
			return res;
		}

		String op1 = op + "0";
		res.addAll(solve(k - 1, op1));

		if (op.isEmpty() || op.charAt(op.length() - 1) != '1') {
			String op2 = op + "1";
			res.addAll(solve(k - 1, op2));
		}

		return res;

	}

}
