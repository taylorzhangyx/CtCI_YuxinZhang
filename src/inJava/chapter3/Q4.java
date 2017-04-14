package inJava.chapter3;

import java.util.NoSuchElementException;
import java.util.Stack;

public class Q4 {
	class MyQueue{
		  Stack<Integer> s1 = new Stack<>(), s2 = new Stack<>();
		  public void enqueue(int n){
		    s1.push(n);
		  }
		  public int dequeue(){
		    if(isEmpty()) throw new NoSuchElementException();
		    else return s2.pop();
		  }
		  public int peek(){
		    if(isEmpty()) throw new NoSuchElementException();
		    else return s2.peek();
		  }
		  public boolean isEmpty(){
		    if(s2.isEmpty()){
		      if(s1.isEmpty()) return true;
		      while(!s1.isEmpty()){
		        s2.push(s1.pop());
		      }
		      return false;
		    }
		    else return false;
		  }
		}
}
