package aditya.verma.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubseqWithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ip = { 1, 2, 1 };
		int k = 2;

		solve(0, ip, new ArrayList<Integer>(), 0, k);

	}

	static void solve(int i, int[] ip, List<Integer> op, int sum, int k) {
		if (i == ip.length) {
			if (sum == k)
				System.out.println(op.toString());
			return;
		}

		// take current element
		List<Integer> op1 = new ArrayList<>(op);
		op1.add(ip[i]);
		solve(i + 1, ip, op1, sum + ip[i], k);

		// dont take current element
		List<Integer> op2 = new ArrayList<>(op);
		solve(i + 1, ip, op2, sum, k);

	}

}
