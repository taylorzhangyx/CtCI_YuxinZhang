package inJava.chapter2;

import inJava.chapter0.LinkedListNode;

public class Q8 {
	public LinkedListNode loopDetection(LinkedListNode l1) {
		if (l1 == null || l1.next == null)
			return null;
		LinkedListNode dummy = new LinkedListNode(0);
		dummy.next = l1;
		LinkedListNode fast = l1.next, slow = l1;
		while (fast.next != null && fast.next.next != null && fast != slow) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast != slow)
			return null;
		slow = dummy;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
