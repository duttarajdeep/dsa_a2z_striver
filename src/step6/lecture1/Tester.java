package step6.lecture1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LinkedList<Integer> ll = new LinkedList<>();
//		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		ll.add(4);
//		ll.add(5);
//		System.out.println("Size of the list is: " + ll.size());
//		ll.display();
//		ll.delete(1);
//		ll.display();
//		System.out.println("Size of the list is: " + ll.size());
//		ll.insertFirst(1);
//		ll.display();
//		System.out.println("Size of the list is: " + ll.size());
//		ll.insertLast(6);
//		ll.display();
//		System.out.println("Size of the list is: " + ll.size());
//		ll.delete(4);
//		ll.display();
//		System.out.println("Size of the list is: " + ll.size());
//		ll.insert(4, 4);
//		ll.display();
//		System.out.println("Size of the list is: " + ll.size());
//		System.out.println(ll.search(13));

		DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
		dll.add(1);
		dll.add(2);
		dll.add(3);
		dll.display();
		dll.insertFirst(0);
		dll.display();
		dll.insertLast(4);
		dll.display();
		dll.insert(2, 2);
		dll.display();
		dll.reverse();
		dll.display();
		DoublyLinkedList<Integer> dll2 = new DoublyLinkedList<Integer>(dll.recursiveReverse(dll.head()));
		dll2.display();
	}

}
