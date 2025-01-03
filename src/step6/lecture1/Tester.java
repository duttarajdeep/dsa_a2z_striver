package step6.lecture1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println("Size of the list is: " + ll.size());
		ll.display();
		ll.delete(1);
		ll.display();
		System.out.println("Size of the list is: " + ll.size());
		ll.insertFirst(1);
		ll.display();
		System.out.println("Size of the list is: " + ll.size());
		ll.insertLast(6);
		ll.display();
		System.out.println("Size of the list is: " + ll.size());
		ll.delete(4);
		ll.display();
		System.out.println("Size of the list is: " + ll.size());
		ll.insert(4, 4);
		ll.display();
		System.out.println("Size of the list is: " + ll.size());
	}

}
