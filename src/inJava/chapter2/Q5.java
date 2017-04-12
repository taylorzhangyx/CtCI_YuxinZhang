package inJava.chapter2;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import inJava.chapter0.LinkedListNode;

public class Q5 {
	public LinkedListNode sumLists(LinkedListNode n1, LinkedListNode n2) {
		int carry = 0;
		LinkedListNode dummy = new LinkedListNode(0), last = dummy;
		while (n1 != null || n2 != null || carry != 0) {
			int digit1 = n1 == null ? 0 : n1.val;
			n1 = n1 == null ? n1 : n1.next;
			int digit2 = n2 == null ? 0 : n2.val;
			n2 = n2 == null ? n2 : n2.next;
			last.next = new LinkedListNode((digit1 + digit2 + carry) % 10);
			last = last.next;
			carry = (digit1 + digit2 + carry) / 10;
		}
		return dummy.next;
	}

	int[] n1 = { 1, 1, 1 }, n2 = { 2, 3, 4 }, n3 = { 3, 4, 5 };
	int[] n4 = { 1 }, n5 = { 9, 9, 9 }, n6 = { 0, 0, 0, 1 };

	@Test
	public void test1() throws IOException {
		LinkedListNode list1 = new LinkedListNode(n1), list2 = new LinkedListNode(n2), list3 = new LinkedListNode(n3);
		assertTrue(sumLists(list1, list2).isEquals(list3));
	}

	@Test
	public void test2() throws IOException {
		LinkedListNode list4 = new LinkedListNode(n4), list5 = new LinkedListNode(n5), list6 = new LinkedListNode(n6);
		assertTrue(sumLists(list4, list5).isEquals(list6));
	}

	// follow up
	public LinkedListNode sumListsFollowUp(LinkedListNode n1, LinkedListNode n2) {
		n1 = reverse(n1);
		n2 = reverse(n2);
		LinkedListNode sum = sumLists(n1, n2);
		return reverse(sum);
	}

	public static LinkedListNode reverse(LinkedListNode list) {
		if (list.next == null)
			return list;
		LinkedListNode node = list.next;
		LinkedListNode head = reverse(list.next);
		node.next = list;
		list.next = null;
		return head;
	}

	int[] n11 = { 1, 2, 3 }, n12 = { 3, 4 }, n13 = { 1, 5, 7 };
	int[] n14 = { 1 }, n15 = { 9, 9, 9 }, n16 = { 1, 0, 0, 0 };

	@Test
	public void testfollowup1() throws IOException {
		LinkedListNode list1 = new LinkedListNode(n11), list2 = new LinkedListNode(n12),
				list3 = new LinkedListNode(n13);
		assertTrue(sumListsFollowUp(list1, list2).isEquals(list3));
	}

	@Test
	public void testfollowup2() throws IOException {
		LinkedListNode list4 = new LinkedListNode(n14), list5 = new LinkedListNode(n15),
				list6 = new LinkedListNode(n16);
		assertTrue(sumListsFollowUp(list4, list5).isEquals(list6));
	}
}
