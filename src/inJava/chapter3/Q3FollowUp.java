package inJava.chapter3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Q3FollowUp {
	class SetOfStacks{
		  ArrayList<Stack<Integer>> set = new ArrayList<>();
		  int capacity = 10;
		  
		  public void push(int i){
		    if(set.isEmpty() || set.get(set.size()-1).size() == capacity){
		      Stack<Integer> s = new Stack<Integer>();
		      s.add(i);
		      set.add(s);
		    }
		    else{
		      set.get(set.size()-1).push(i);
		    }
		  }
		  public int pop(){
		    if(!isEmpty()){
		      return set.get(set.size()-1).pop();
		    }
		    else throw new EmptyStackException();
		  }
		  
		  public int peek(){
		    if(!isEmpty()){
		      return set.get(set.size()-1).peek();
		    }
		    else throw new EmptyStackException();
		  }
		  
		  //this method doesn't chagne the structure of original set
		  public int popAt(int index){
		    if(index > set.size()-1 || index < 0){
		      throw new IndexOutOfBoundsException();
		    }
		    return set.get(index).pop();
		  }
		  
		  public boolean isEmpty(){
		    if(set.isEmpty()) return true;
		    while(!set.isEmpty() && set.get(set.size()-1).isEmpty()){
		      //set is not empty and last stack is empty
		      set.remove(set.size()-1);
		    }
		    return set.isEmpty();
		  }
		}
}
