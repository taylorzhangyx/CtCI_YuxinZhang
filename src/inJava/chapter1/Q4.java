package inJava.chapter1;

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
}
