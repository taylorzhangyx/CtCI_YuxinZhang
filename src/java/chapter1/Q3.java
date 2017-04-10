package java.chapter1;

public class Q3 {
	public char[] URLify(char[] s, int n) {
		boolean space = false;
		int pointer = s.length;
		for (int i = n - 1; i >= 0; i--) {
			if (s[i] == ' ')
				space = true;
			else {
				if (space)
					pointer = fillspace(s, pointer);
				s[pointer--] = s[i];
			}
		}
		return s;
	}

	private int fillspace(char[] s, int p) {
		if (p != s.length - 1) {// check if p points to tail
			s[p--] = '0';
			s[p--] = '2';
			s[p--] = '%';
		}
		return p;
	}
}
