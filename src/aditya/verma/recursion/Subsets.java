package aditya.verma.recursion;

import java.util.HashSet;
import java.util.Set;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ip = "abc";
//		solve(ip, "");
		Set<String> opSet = new HashSet<>();
		solveUnique(ip, "", opSet);
		for (String item : opSet) {
			System.out.println(item);
		}
	}

	static void solve(String ip, String op) {
		if (ip.length() == 0) {
			System.out.println(op);
			return;
		}
		String op1 = op;
		String op2 = op + ip.substring(0, 1);
		ip = ip.substring(1);
		solve(ip, op1);
		solve(ip, op2);
	}

	static void solveUnique(String ip, String op, Set<String> subsets) {
		if (ip.length() == 0) {
			subsets.add(op);
			return;
		}
		String op1 = op;
		String op2 = op + ip.substring(0, 1);
		ip = ip.substring(1);
		solveUnique(ip, op1, subsets);
		solveUnique(ip, op2, subsets);
	}

}
