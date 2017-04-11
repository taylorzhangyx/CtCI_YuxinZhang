package inJava.chapter1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q4 {
	public boolean palindromePermutation(String s) {
		int table[] = new int[94];
		for (char c : s.toCharArray()) {
			table[c - '!']++;
		}
		boolean single = false;
		for (int i = 0; i < 94; i++) {
			if ((table[i] & 1) == 1) {
				if (single)
					return false;// single char appear twice
				else
					single = true;// single char appear once, mark
			}
		}
		return true;
	}

	public boolean palindromePermutation2(String s) {
		s = s.toLowerCase();
		int marker = 0;
		for (char c : s.toCharArray()) {
			if (c > 'a' && c < 'z') {// valid char
				// get the mark, reverse and store
				marker ^= (1 << (c - 'a'));
			}
		}
		return  marker == 0 || ((marker - 1 ) & marker)== 0;
	}
	@Test
	public void test1(){
		assertTrue(palindromePermutation2("aavvccdde"));
	}
	@Test
	public void test2(){
		assertTrue(palindromePermutation2("aavvccdd"));
	}
	@Test
	public void test3(){
		assertTrue(palindromePermutation2(""));
	}
}
