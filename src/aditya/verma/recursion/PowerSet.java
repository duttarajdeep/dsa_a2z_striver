package aditya.verma.recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums of unique elements, return all possible subsets
 * (the power set).
 * 
 * The solution set must not contain duplicate subsets. Return the solution in
 * any order.
 */

public class PowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		List<List<Integer>> res = solve(nums, new ArrayList<Integer>());
		for (List<Integer> list : res) {
			System.out.println(list.toString());
		}

	}

	static List<List<Integer>> solve(List<Integer> ip, List<Integer> op) {
		List<List<Integer>> res = new ArrayList<>();

		if (ip.size() == 0) {
			res.add(op);
			return res;
		}

		List<Integer> op1 = new ArrayList<>(op);
		List<Integer> op2 = new ArrayList<>(op);
		op2.add(ip.get(0));

		List<Integer> remIp = new ArrayList<>(ip);
		remIp.remove(0);

		res.addAll(solve(remIp, op1));
		res.addAll(solve(remIp, op2));

		return res;
	}

}
