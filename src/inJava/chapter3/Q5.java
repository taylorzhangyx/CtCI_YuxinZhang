package inJava.chapter3;

import java.util.Stack;

import org.junit.Test;

public class Q5 {
	public void sortStack(Stack<Integer> s) {
		Stack<Integer> temps = new Stack<>();
		int sortsize = 0;
		while (!s.isEmpty()) {
			int cur = s.pop();
			sortsize++;
			while (!temps.isEmpty() && temps.peek() > cur) {
				s.push(temps.pop());
			}
			temps.push(cur);
			while (temps.size() < sortsize) {
				temps.push(s.pop());
			}
		}
		while (!temps.isEmpty()) {
			s.push(temps.pop());
		}
	}
	
	@Test
	public void test1(){
		Stack<Integer> s = new Stack<>();
		s.push(3);
		s.push(2);
		s.push(8);
		s.push(1);
		s.push(4);
		s.push(6);
		s.push(9);
		s.push(5);
		System.out.println(s.toString());
		sortStack(s);
		System.out.println(s.toString());
	}
}
