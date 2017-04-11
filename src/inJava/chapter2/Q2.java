package inJava.chapter2;

import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import inJava.chapter0.LinkedListNode;

public class Q2 {
	public LinkedListNode returnKth(LinkedListNode list, int k) {
		if (k <= 1)
			return findTail(list);
		LinkedListNode fast = list, slow = list;
		for (int i = 1; i < k && fast.next != null; i++) {
			fast = fast.next;
		}
		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}

	private LinkedListNode findTail(LinkedListNode list) {
		while (list.next != null) {
			list = list.next;
		}
		return list;
	}
	
	
	int[] listary = {9,8,7,6,5,4,3,2,1};
	
	
	@Test
	public void test1() throws IOException{
		LinkedListNode raw = new LinkedListNode(listary);
		LinkedListNode expected = new LinkedListNode(1);
		assertTrue(expected.val == returnKth(raw,0).val);
	}
	@Test
	public void test2() throws IOException{
		LinkedListNode raw = new LinkedListNode(listary);
		LinkedListNode expected = new LinkedListNode(1);
		assertTrue(expected.val == returnKth(raw,1).val);
	}
	@Test
	public void test3() throws IOException{
		LinkedListNode raw = new LinkedListNode(listary);
		LinkedListNode expected = new LinkedListNode(2);
		assertTrue(expected.val == returnKth(raw,2).val);
	}
	@Test
	public void test4() throws IOException{
		LinkedListNode raw = new LinkedListNode(listary);
		LinkedListNode expected = new LinkedListNode(6);
		assertTrue(expected.val == returnKth(raw,6).val);
	}
	@Test
	public void test5() throws IOException{
		LinkedListNode raw = new LinkedListNode(listary);
		LinkedListNode expected = new LinkedListNode(9);
		assertTrue(expected.val == returnKth(raw,11).val);
	}
}
