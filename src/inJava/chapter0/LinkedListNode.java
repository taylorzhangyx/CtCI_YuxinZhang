package inJava.chapter0;

import java.io.IOException;

public class LinkedListNode {
	public LinkedListNode next = null;
	public int val;
	
	public LinkedListNode(int n){ val = n;}
	public LinkedListNode(int[] ary) throws IOException {
		if(ary.length < 1) throw new IOException("The input array must have at least one element");
		LinkedListNode dummy = new LinkedListNode(0);
		for(int n : ary){
			dummy.appendToTail(n);
		}
		this.val = dummy.next.val;
		this.next = dummy.next.next;
	}
	void appendToTail(int d){
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = end;
	}
	public boolean isEquals(LinkedListNode node){
		LinkedListNode cur = this;
		while(node != null && cur != null){
			if(node.val != cur.val) return false;
			else{
				node = node.next;
				cur = cur.next;
			}
		}
		return node == null && cur == null;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		LinkedListNode n = this;
		sb.append(n.val);
		n = n.next;
		while(n != null){
			sb.append(',');
			sb.append(n.val);
			n = n.next;
		}
		return sb.toString();
	}
}
