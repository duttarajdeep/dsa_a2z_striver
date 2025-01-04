package step6.lecture1;

public class LinkedList<T> {

	private Node<T> head;
	private int size = 0;

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		size++;
	}

	public T deleteFirst() {
		if (head == null)
			throw new IllegalArgumentException("Cannot delete first node from an empty linked list");
		Node<T> temp = head;
		head = head.next;

		size--;

		return temp.data;
	}

	public T deleteLast() {
		if (head == null)
			throw new IllegalArgumentException("Cannot delete last node from an empty linked list");
		Node<T> current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		Node<T> temp = current.next;
		current.next = null;

		size--;

		return temp.data;

	}

	public T delete(int position) {
		if (position > size)
			throw new IllegalArgumentException(
					"Cannot delete from a position which is greater that the size of the list");

		if (position == 1) {
			return deleteFirst();
		}

		if (position == size) {
			return deleteLast();
		}

		Node<T> current = head;
		int counter = 0;
		while (current.next != null) {
			counter++;
			if (counter == position - 1)
				break;
			current = current.next;

		}
		Node<T> temp = current.next;
		current.next = temp.next;
		temp.next = null;

		size--;

		return temp.data;

	}

	public void insertFirst(T data) {
		if (head == null) {
			Node<T> newNode = new Node<T>(data);
			head = newNode;
			return;
		}

		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;

		size++;

		return;
	}

	public void insertLast(T data) {
		if (head == null)
			throw new IllegalArgumentException("Cannot insert to the last of an empty list");

		Node<T> current = head;
		while (current.next != null) {
			current = current.next;
		}

		Node<T> newNode = new Node<T>(data);
		current.next = newNode;

		size++;

		return;
	}

	public void insert(T data, int position) {
		if (head == null)
			throw new IllegalArgumentException("Cannot insert data into an empty list");

		if (position > size())
			throw new IllegalArgumentException("The value of position cannot be greater than the size of the list");

		if (position == 1) {
			insertFirst(data);
			return;
		}

		if (position == size()) {
			insertLast(data);
			return;
		}

		int count = 0;
		Node<T> current = head;
		while (current.next.next != null) {
			if (position == count + 1)
				break;
			count++;
			current = current.next;
		}
		Node<T> newNode = new Node<T>(data);
		newNode.next = current.next;
		current.next = newNode;

		size++;

		return;
	}

	public boolean search(T data) {
		if (head == null)
			throw new RuntimeException("List is empty");

		Node<T> current = head;

		while (current.next != null) {
			if (current.data == data)
				return true;
			current = current.next;
		}
		return false;

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

	public int size() {
		return this.size;
	}

	private class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

}
