package aditya.verma.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubseqWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = { 1, 2, 1 };
		int k = 2;

		System.out.println("No. of sub-sequences: 789p[" + "" + solve(0, ip, new ArrayList<Integer>(), 0, k));

	}

	static int solve(int i, int[] ip, List<Integer> op, int sum, int k) {
		int count = 0;
		if (i == ip.length) {
			if (sum == k) {
				System.out.println(op.toString());
				count++;
			}
			return count;
		}

		// take current element
		List<Integer> op1 = new ArrayList<>(op);
		op1.add(ip[i]);
		count += solve(i + 1, ip, op1, sum + ip[i], k);

		// dont take current element
		List<Integer> op2 = new ArrayList<>(op);
		count += solve(i + 1, ip, op2, sum, k);

		return count;

	}

}
