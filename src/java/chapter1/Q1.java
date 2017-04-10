package java.chapter1;

import java.util.HashSet;

public class Q1 {
	public boolean isUnique(String s) {
		HashSet<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			if (set.contains(c))
				return false;
			else
				set.add(c);
		}
		return true;
	}

	public boolean isUniqueFollowUp(String s) {
		int[] table = new int[256];// 256 characters in ASCII table
		for (char c : s.toCharArray()) {
			if (table[c] == 0)
				table[c]++;
			else
				return false;
		}
		return true;
	}
}