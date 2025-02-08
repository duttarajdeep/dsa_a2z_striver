package step8.lecture1;

import java.util.Arrays;
import java.util.Stack;

public class PrevSmallerElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 39, 27, 11, 4, 24, 32, 32, 1 };
		System.out.println(Arrays.toString(prevSmaller(A)));

	}

	static int[] prevSmaller(int[] A) {
		int n = A.length;
		int[] nse = new int[n];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!st.isEmpty() && A[i] <= st.peek())
				st.pop();
			nse[i] = st.isEmpty() ? -1 : st.peek();
			st.push(A[i]);
		}
		return nse;
	}

}
