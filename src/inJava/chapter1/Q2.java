package inJava.chapter1;

public class Q2 {
	public boolean checkPermutation(String s1, String s2){
		  int[] table = new int[256];
		  for(char c : s1.toCharArray()){
		    table[c]++;
		  }
		  for(char c : s2.toCharArray()){
		    table[c]--;
		  }
		  for(int i = 0; i < 256; i++){
		    if(table[i] != 0) return false;
		  }
		  return true;
		}
}
