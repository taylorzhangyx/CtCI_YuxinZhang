package inJava.chapter3;

import java.util.Stack;

public class Q2 {
	class MinStack{
		  Stack<Integer> stackBase = new Stack<>();
		  Stack<Integer> stackMin = new Stack<>();
		  int min = Integer.MAX_VALUE;
		  public void push(int n){
		    stackBase.push(n);
		    min = Math.min(n, min);
		    stackMin.push(min);
		  }
		  public int pop(int n){
		    min = stackMin.pop();
		    return stackBase.pop();
		  }
		  public boolean isEmpty(){
		    return stackBase.isEmpty();
		  }
		  public int peek(){
		    return stackBase.peek();
		  }
		  public int min(){
		    return min;
		  }
		}
}
