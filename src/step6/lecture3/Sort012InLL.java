package step6.lecture3;

public class Sort012InLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Node segregate(Node head) {
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

	public Node segregate2(Node head) {

		if (head == null || head.next == null)
			return head;

		Node h0 = new Node(-1);
		Node h1 = new Node(-1);
		Node h2 = new Node(-1);

		Node p0 = h0;
		Node p1 = h1;
		Node p2 = h2;

		Node temp = head;

		while (temp != null) {
			if (temp.data == 0) {
				p0.next = temp;
				p0 = p0.next;
			} else if (temp.data == 1) {
				p1.next = temp;
				p1 = p1.next;
			} else {
				p2.next = temp;
				p2 = p2.next;
			}
			temp = temp.next;
		}

		h0.next = (h1 != null) ? h1.next : h2.next;
		h1.next = h2.next;
		h2.next = null;

		Node newHead = h0.next;
		return newHead;
	}

	public class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

}
