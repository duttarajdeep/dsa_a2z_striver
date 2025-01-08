package step6.lecture3;

public class Sort012InLL {

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Node segregate(Node head) {
		// add your code here
		int c0 = 0, c1 = 0, c2 = 0;

		Node current = head;
		Node dummy = current;

		while (current != null) {
			if (current.data == 0)
				c0++;
			else if (current.data == 1)
				c1++;
			else
				c2++;

			current = current.next;
		}

		current = head;
		for (int i = 0; i < c0; i++) {
			current.data = 0;
			current = current.next;
		}
		for (int i = 0; i < c1; i++) {
			current.data = 1;
			current = current.next;
		}
		for (int i = 0; i < c2; i++) {
			current.data = 2;
			current = current.next;
		}

		return dummy;

	}

}
