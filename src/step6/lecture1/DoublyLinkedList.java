package step6.lecture1;

public class DoublyLinkedList<T> {

	private Node<T> head;
	private int size = 0;

	public Node<T> head() {
		return this.head;
	}

	public DoublyLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public DoublyLinkedList(Node<T> head) {
		this.head = head;
	}

	public void add(T data) {
		if (head == null) {
			Node<T> newNode = new Node<T>(data);
			head = newNode;
		} else {
			Node<T> newNode = new Node<T>(data);
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
			newNode.prev = current;
		}
		size++;
	}

	public void insertFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			newNode = head;
			return;
		}
		Node<T> first = head;
		newNode.next = first;
		first.prev = newNode;
		head = newNode;
	}

	public void insertLast(T data) {
		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		Node<T> newNode = new Node<T>(data);
		current.next = newNode;
		newNode.prev = current;
	}

	public void insert(T data, int position) {
		int count = 1;
		Node<T> current = head;
		while (current.next != null) {
			if (count == position)
				break;
			current = current.next;
			count++;
		}
		Node<T> newNode = new Node<T>(data);
		Node<T> nextNode = current.next;
		current.next = newNode;
		newNode.prev = current;

		newNode.next = nextNode;
		nextNode.prev = newNode;
	}

	public int size() {
		return this.size;
	}

	public void reverse() {
		Node<T> current = head;
		Node<T> prev = null;
		while (current != null) {
			prev = current.prev;
			current.prev = current.next;
			current.next = prev;
			current = current.prev;
		}
		head = prev.prev;
	}

	public Node<T> recursiveReverse(Node<T> head) {
		if (head == null || head.next == null)
			return head;
		Node<T> newHead = recursiveReverse(head.next);
		Node<T> first = head.next;
		first.next = head;
		head.next = null;
		head.prev = first;
		return newHead;
	}

	public void display() {
		Node<T> current = head;
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.print("null");
		System.out.println();
	}

	public void displayReverse() {
		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}
		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.prev;
		}
		System.out.print("null");
		System.out.println();
	}

	private class Node<T> {
		T data;
		Node<T> prev;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			prev = null;
			next = null;
		}
	}
}
