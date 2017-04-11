package inJava.chapter1;

public class Q6 {
	public String stringCompression(String s){
		  if(s == null || s.length() == 0) return s;
		  String compressed = compress(s);
		  if(compressed.length() < s.length()) return compressed;
		  else return s;
		}
		private String compress(String s){
		  int count = 1;
		  char ch = s.charAt(0);
		  StringBuilder sb = new StringBuilder();
		  for(int i = 1; i < s.length(); i++){
		    if(ch == s.charAt(i)) count++;
		    else{
		      sb.append(ch);
		      sb.append(count);
		      count = 1;
		      ch = s.charAt(i);
		    }
		  }
		  sb.append(ch);
		  sb.append(count);
		  return sb.toString();
		}
}
