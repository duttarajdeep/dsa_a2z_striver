package step7.lecture1;

import java.util.Stack;

public class DeleteMidElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input = new Stack<>();
		input.push(1);
		input.push(2);
		input.push(3);
		input.push(4);
		input.push(5);

		deleteMid(input, input.size() / 2 + 1);

		while (!input.isEmpty()) {
			int top = input.pop();
			System.out.println(top + " ");
		}
	}

	static void deleteMid(Stack<Integer> stack, int k) {
		int top = stack.pop();
		if (k == 1)
			return;
		deleteMid(stack, k - 1);
		stack.push(top);
	}

}
