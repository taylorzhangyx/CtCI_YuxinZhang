package inJava.chapter0;

public class Main {

	public static void main(String[] args) {
		char[] table = new char[10];
		table[0] = 'a';
		for(int i = 1; i < 10 ; i ++) table[i] = '\0';
		System.out.println(new String(table));
		System.out.println(new String(table).equals("a"));
	}
}
