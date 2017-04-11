package inJava.chapter1;

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
	
	//optimal int table
	//This table will handle 256 char
	public boolean isUniqueOptimal(String s){
		int[] table = new int[8];
		for(char c : s.toCharArray()){
			int m = c/32, n = c%32;
			if((table[m] & (1 << n)) != 0) return false;
			else table[m] = table[m] | (1 << n); 
		}
		return true;
	}
}