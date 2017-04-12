package inJava.chapter2;

import inJava.chapter0.LinkedListNode;

public class Q6 {
	public boolean palindrome(LinkedListNode list){
		  if(list == null) return false;
		  if(list.next == null) return true;
		  //find middle
		  LinkedListNode fast = list, slow = list;
		  while(fast.next != null && fast.next.next != null){
		    fast = fast.next.next;
		    slow = slow.next;
		  }
		  //split
		  LinkedListNode list2 = slow.next;
		  slow.next = null;
		  //reverse 2nd half
		  list2 = Q5.reverse(list2);
		  //compare
		  boolean mark = true;
		  while(list!= null && list2 != null){
		    if(list.val != list2.val) mark = false;
		    list = list.next;
		    list2 = list2.next;
		  }
		  //recover list, give the answer without destroy original data
		  list2 = Q5.reverse(list2);
		  slow.next = list2;
		  
		  return mark;
		}
}
