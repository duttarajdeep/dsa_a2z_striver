package step6.lecture3;

public class IntersectionOf2Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode t1 = headA;
		ListNode t2 = headB;

		while (t1 != t2) {
			t1 = t1.next;
			t2 = t2.next;

			if (t1 == t2)
				return t1;

			if (t1 == null)
				t1 = headB;
			if (t2 == null)
				t2 = headA;
		}

		return t1;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

}
