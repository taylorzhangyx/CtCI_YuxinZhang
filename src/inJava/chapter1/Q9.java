package inJava.chapter1;

public class Q9 {
	public boolean stringRotation(String s1, String s2){
		  if(s1.length() != s2.length()) return false;
		  return isSubstring(s1+s1, s2);
		}

	/**
	 * checkes if s2 is the substring of s1
	 * @param string
	 * @param s2
	 * @return
	 */
	private boolean isSubstring(String s1, String s2) {
		// TODO Auto-generated method stub
		return false;
	}
}
