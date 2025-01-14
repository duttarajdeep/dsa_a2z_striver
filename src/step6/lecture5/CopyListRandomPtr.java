package step6.lecture5;

public class CopyListRandomPtr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void insertCopyNodesInBetween(Node head) {
		Node temp = head;
		while (temp != null) {
			Node copy = new Node(temp.val);
			copy.next = temp.next;
			temp.next = copy;
			temp = temp.next.next;
		}
	}

	public void connectRandomPointers(Node head) {
		Node temp = head;
		while (temp != null) {
			Node copy = temp.next;
			if (temp.random == null)
				copy.random = null;
			else
				copy.random = temp.random.next;
			temp = temp.next.next;
		}
	}

	public Node connectNextPointers(Node head) {
		Node temp = head;
		Node dummy = new Node(-1);
		Node res = dummy;

		while (temp != null) {
			res.next = temp.next;
			temp.next = temp.next.next;

			res = res.next;
			temp = temp.next;
		}

		return dummy.next;
	}

	public Node copyRandomList(Node head) {
		insertCopyNodesInBetween(head);
		connectRandomPointers(head);
		return connectNextPointers(head);
	}

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

}
