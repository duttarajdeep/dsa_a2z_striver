package aditya.verma.recursion;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input = new Stack<>();
		input.push(1);
		input.push(2);
		input.push(3);
		reverse(input);

		while (!input.isEmpty()) {
			int top = input.pop();
			System.out.println(top + " ");
		}

	}

	static void reverse(Stack<Integer> stack) {
		if (stack.size() == 1)
			return;
		int top = stack.pop();
		reverse(stack);
		insert(stack, top);
	}

	static void insert(Stack<Integer> stack, int temp) {
		if (stack.size() == 0) {
			stack.push(temp);
			return;
		}

		int top = stack.pop();
		insert(stack, temp);
		stack.push(top);
	}

}
