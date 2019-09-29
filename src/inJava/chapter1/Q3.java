package inJava.chapter1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Q3 {
	public char[] URLify(char[] s, int n) {
		boolean space = false;
		int pointer = s.length - 1;
		for (int i = n - 1; i >= 0; i--) {
			if (s[i] == ' ')
				space = true;
			else {
				if (space) {
					pointer = fillspace(s, pointer);
					space = false;
				}
				s[pointer--] = s[i];
			}
		}
		return shift(s, pointer);
	}

	private int fillspace(char[] s, int p) {
		if (p != s.length - 1) {// check if p points to tail
			s[p--] = '0';
			s[p--] = '2';
			s[p--] = '%';
		}
		return p;
	}

	private char[] shift(char[] s, int p) {
		if (p == -1)
			return s;
		int i;
		for (i = 0; i < s.length && p < s.length - 1; i++) {
			s[i] = s[++p];
		}
		for (; i < s.length; i++)
			s[i] = ' ';
		return s;
	}

	@Test
	public void test1() {
		assertTrue(new String(URLify("  A B  C      ".toCharArray(), 8)),
				new String(URLify("  A B  C      ".toCharArray(), 8)).equals("A%20B%20C     "));
	}
}
