package step6.lecture3;

public class Add1ToLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);
		head.next = first;
		first.next = second;

		addOne(head);

	}

	static Node addOne(Node head) {
		int carry = helper(head);
		if (carry == 1) {
			Node newNode = new Node(1);
			newNode.next = head;
			return newNode;
		}
		return head;
	}

	static int helper(Node head) {
		if (head == null)
			return 1;

		int carry = helper(head.next);
		int sum = head.data + carry;
		if (sum > 9) {
			head.data = 0;
			carry = 1;
		} else {
			head.data = sum;
			carry = 0;
		}
		return carry;
	}

	static class Node {
		int data;
		Node next;

		Node(int x) {
			data = x;
			next = null;
		}
	}

}
