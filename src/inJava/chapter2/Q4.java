package inJava.chapter2;

import inJava.chapter0.LinkedListNode;

public class Q4 {
	public LinkedListNode partition(LinkedListNode head, int x) {
		LinkedListNode dummy1 = new LinkedListNode(0), dummy2 = new LinkedListNode(0), node1 = dummy1, node2 = dummy2;
		while (head != null) {
			if (head.val < x) {
				node1.next = head;
				node1 = node1.next;
			} else {
				node2.next = head;
				node2 = node2.next;
			}
			head = head.next;
		}
		node1.next = dummy2.next;
		return dummy1.next;
	}
}
