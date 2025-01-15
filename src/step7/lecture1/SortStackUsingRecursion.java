package step7.lecture1;

import java.util.Stack;

public class SortStackUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> input = new Stack<>();
		input.push(1);
		input.push(2);
		input.push(3);
		input.push(4);
		input.push(5);

		sort(input);

		while (!input.isEmpty()) {
			int ele = input.pop();
			System.out.println(ele + " ");
		}

	}

	static void sort(Stack<Integer> stack) {
		if (stack.size() == 1)
			return;
		int top = stack.pop();
		sort(stack);
		insert(stack, top);
	}

	static void insert(Stack<Integer> stack, int element) {
		if (stack.size() == 0 || element >= stack.peek()) {
			stack.push(element);
			return;
		}
		int top = stack.pop();
		insert(stack, top);
		stack.push(top);
	}

}
