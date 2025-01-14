package step6.lecture4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		Node left = head;
		Node right = findRight(head);
		while (left != right) {
			int sum = left.data + right.data;
			if (sum == target) {
				ArrayList<Integer> pair = new ArrayList<>();
				pair.add(left.data);
				pair.add(right.data);
				res.add(pair);

				left = left.next;
				right = right.prev;
			} else if (sum > target)
				right = right.prev;
			else
				left = left.next;
		}
		return res;
	}

	public static Node findRight(Node head) {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		return current;
	}

	Node removeDuplicates(Node head) {
		Node temp = head;
		Map<Integer, Boolean> map = new HashMap<>();
		while (temp.next != null) {
			boolean isSeen = map.getOrDefault(temp.data, false);
			if (isSeen) {
				Node prevNode = temp.prev;
				Node nextNode = temp.next;
				prevNode.next = nextNode;
				if (nextNode != null)
					nextNode.prev = prevNode;

				temp.next = null;
				temp.prev = null;
				temp = nextNode;
			} else {
				map.put(temp.data, true);
				temp = temp.next;
			}
		}
		return head;
	}

	class Node {
		int data;
		Node next, prev;

		Node(int x) {
			data = x;
			next = null;
			prev = null;
		}
	}

}
