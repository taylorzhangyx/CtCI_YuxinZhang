package inJava.chapter0;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static LinkedListNode reverse(LinkedListNode node) {
		LinkedListNode head = null;
		int count = 0;

		
		while (node != null) {
			System.out.println(" ");
			System.out.println("loop "+ count++);
			System.out.println("Original list is: "+ node.toString());
			LinkedListNode n = new LinkedListNode(node.val);
			System.out.println("Node n is: "+ n.val);
			
			n.next = head;
			head = n;
			System.out.println("After n.next = head; head = n; list head is: "+ head.toString());
			
			node = node.next;
		}
		
		return head;
	}

	public static void main(String[] argus) throws IOException {
		int[] listary = { 1, 2, 3, 4, 5, 6, 7, 8 };
		LinkedListNode node = new LinkedListNode(listary);
		System.out.println("Before reverse: " + node.toString());
		LinkedListNode result = reverse(node);
		System.out.println("After reverse: " + result.toString());
		Queue<String> q = new LinkedList<>();
		q.remove();
	}
}
