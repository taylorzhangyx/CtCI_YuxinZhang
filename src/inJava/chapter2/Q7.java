package inJava.chapter2;

import inJava.chapter0.LinkedListNode;

public class Q7 {
	public LinkedListNode intersection(LinkedListNode l1, LinkedListNode l2) {
		if (l1 == null || l2 == null)
			return null;
		LinkedListNode node1 = l1, node2 = l2;
		int len1 = 1, len2 = 1;
		while (node1.next != null) {
			node1 = node1.next;
			len1++;
		}
		while (node2.next != null) {
			node2 = node2.next;
			len2++;
		}
		// check if intersect to compare the last node
		if (node1 != node2)
			return null;
		int dif = Math.abs(len1 - len2);
		LinkedListNode fast = (len1 < len2) ? l1 : l2;
		LinkedListNode slow = (len1 < len2) ? l2 : l1;
		for (int i = 0; i < dif; i++)
			slow = slow.next;
		while (fast != slow) {
			fast = fast.next;
			slow = slow.next;
		}
		return fast;
	}

	public LinkedListNode getIntersectionNode2(LinkedListNode l1, LinkedListNode l2) {
		if (l1 == null || l2 == null)
			return null;
		LinkedListNode node1 = l1, node2 = l2;
		while (node1 != node2) {
			node1 = node1.next == null ? l2 : node1.next;
			node2 = node2.next == null ? l1 : node2.next;
		}
		return node1;
	}
}
