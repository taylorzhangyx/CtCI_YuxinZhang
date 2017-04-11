package inJava.chapter1;


public class Q5 {
	public boolean oneAway(String s1, String s2) {
		if (s1.equals(s2)) return true;
		else if(s1.length() > s2.length()) return oneAway(s2,s1);//make sure s1 always shorter than s2
		int pointer = 0;
		while (s1.length() > pointer && s1.charAt(pointer) == s2.charAt(pointer)) {//pointer within range
			pointer++;
		}
		if(pointer == s1.length()) return s2.length() - s1.length() == 1;
		else return s1.length() == s2.length() 
				|| s1.substring(pointer).equals(s2.substring(pointer + 1))
				|| s1.substring(pointer + 1).equals(s2.substring(pointer + 1));
	}
}
