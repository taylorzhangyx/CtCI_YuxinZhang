package inJava.chapter0;

public class Main {

	public static void main(String[] args) {
		char[] table = new char[10];
		table[0] = 'a';
		System.out.println(table[111]);
		System.out.println(new String(table).equals("a"));
	}
}
