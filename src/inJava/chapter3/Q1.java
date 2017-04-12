package inJava.chapter3;

import java.util.EmptyStackException;

public class Q1 {
	class ThreeInOne {
		final int THREE = 3;
		int size = 3;
		int[] base = new int[THREE * size];
		
		int[] stacksize = {0,0,0};
		
		/**
		 * 
		 * @param stack the stack ID you want to push in
		 * @param val the value you want to add
		 */
		public void push(int stack, int val){
			if(stack > 2 || stack < 0) throw new ArrayIndexOutOfBoundsException("Value should be 0 to 2");
			if(stacksize[stack] == size){
				doublesize();
			}
			base[stacksize[stack]++ * stack] = val;
		}
		
		public int pop(int stack){
			if(isEmpty(stack)) throw new EmptyStackException();
			return base[stack * stacksize[stack]--];
		}

		public boolean isEmpty(int stack) {
			return stacksize[stack] == 0;
		}

		public int peek(int stack){
			if(isEmpty(stack))throw new EmptyStackException();
			return base[stack * stacksize[stack]];
		}
		
		private void doublesize() {
			int[] newbase = new int[THREE*size*2];
			for(int i = 0; i < THREE*size; i++){//copy data to new array
				newbase[i] = base[i];
			}
			base = newbase;
		}
	}
}
