package inJava.chapter2;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashSet;

import org.junit.Test;

import inJava.chapter0.LinkedListNode;

public class Q1 {
	public LinkedListNode removeDups(LinkedListNode list) {
		LinkedListNode dummy = new LinkedListNode(0), pre = dummy;
		dummy.next = list;
		HashSet<Integer> set = new HashSet<Integer>();
		while (list != null) {
			if (set.contains(list.val)) {// found duplicates
				pre.next = list.next;
				list.next = null;
				list = pre.next;
			} else {
				set.add(list.val);
				list = list.next;
				pre = pre.next;
			}
		}
		return dummy.next;
	}
	
	public LinkedListNode removeDupsWithoutBuffer(LinkedListNode list){
		  LinkedListNode cur = list;
		  while(cur != null){
		    LinkedListNode pre = cur, node = pre.next;
		    while(node != null){
		      if(node.val == cur.val){
		        pre.next = node.next;
		        node.next = null;
		        node = pre.next;
		      }
		      else{
		        pre = pre.next;
		        node = node.next;
		      }
		    }
		    cur = cur.next;
		  }
		  return list;
		}

	@Test
	public void test1() throws IOException {
		int[] list = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 6, 7, 8 };
		LinkedListNode raw = new LinkedListNode(list);
		int[] elist = { 1, 2, 3, 4, 5, 6, 7, 8 };
		LinkedListNode expect = new LinkedListNode(elist);
		assertTrue(expect.toString(), removeDups(raw).isEquals(expect));
	}

	@Test
	public void test2() throws IOException {
		int[] list = { 1 };
		LinkedListNode raw = new LinkedListNode(list);
		raw = removeDups(raw);
		int[] elist = { 1 };
		LinkedListNode expect = new LinkedListNode(elist);
		assertTrue(raw.toString() + "!" + expect.toString(), raw.isEquals(expect));
	}
	
	
	@Test
	public void test11() throws IOException {
		int[] list = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 6, 7, 8 };
		LinkedListNode raw = new LinkedListNode(list);
		int[] elist = { 1, 2, 3, 4, 5, 6, 7, 8 };
		LinkedListNode expect = new LinkedListNode(elist);
		assertTrue(expect.toString(), removeDupsWithoutBuffer(raw).isEquals(expect));
	}

	@Test
	public void test12() throws IOException {
		int[] list = { 1 };
		LinkedListNode raw = new LinkedListNode(list);
		raw = removeDupsWithoutBuffer(raw);
		int[] elist = { 1 };
		LinkedListNode expect = new LinkedListNode(elist);
		assertTrue(raw.toString() + "!" + expect.toString(), raw.isEquals(expect));
	}
}
