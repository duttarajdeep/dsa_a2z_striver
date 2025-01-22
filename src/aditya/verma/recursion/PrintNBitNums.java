package aditya.verma.recursion;

import java.util.ArrayList;

public class PrintNBitNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		printNBit(4);
		ArrayList<String> res = printNBit(2);
		System.out.println(res.toString());
	}

	static ArrayList<String> printNBit(int n) {
		int zeroCount = n / 2;
		int oneCount = n / 2 + 1;
		if (n % 2 == 0)
			zeroCount = n / 2 - 1;

//		solve(zeroCount, oneCount, "");

		return solveList(zeroCount, oneCount, "");
	}

	static void solve(int zeroCount, int oneCount, String op) {
		if (zeroCount == 0 && oneCount == 0) {
			System.out.println(op);
			return;
		}

		if (zeroCount == 0) {
			String op1 = op + "1";
			solve(zeroCount, oneCount - 1, op1);
			return;
		}

		if (oneCount == 0) {
			String op1 = op + "0";
			solve(zeroCount - 1, oneCount, op1);
			return;
		}

		// we have 2 choice
		String op1 = op + "0";
		solve(zeroCount - 1, oneCount, op1);

		String op2 = op + "1";
		solve(zeroCount, oneCount - 1, op2);

	}

	static ArrayList<String> solveList(int zeroCount, int oneCount, String op) {
		ArrayList<String> res = new ArrayList<>();
		if (zeroCount == 0 && oneCount == 0) {
			res.add(op);
			return res;
		}

		if (zeroCount == 0) {
			String op1 = op + "1";
			res.addAll(solveList(zeroCount, oneCount - 1, op1));
			return res;
		}

		if (oneCount == 0) {
			String op1 = op + "0";
			res.addAll(solveList(zeroCount - 1, oneCount, op1));
			return res;
		}

		// we have 2 choices here
		// Choice 1 : Take 0
		String op1 = op + "0";
		res.addAll(solveList(zeroCount - 1, oneCount, op1));

		// Choice 2 : Take 1
		String op2 = op + "1";
		res.addAll(solveList(zeroCount, oneCount - 1, op2));

		return res;
	}

}
