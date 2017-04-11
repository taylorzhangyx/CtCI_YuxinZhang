package inJava.chapter2;

import inJava.chapter0.LinkedListNode;

public class Q3 {
	public void deleteMiddleNode(LinkedListNode node){
		  node.val = node.next.val;
		  node.next = node.next.next;
		}
	
}
