package inJava.chapter0;

public class Node {
	public String name;
	public Node[] children;
	
	int numofchild;
	
	Node(String name, int size){
		this.name = name;
		children = new Node[size];
		numofchild = 0;
	}
	public void addChild(Node node){
		children[numofchild++] = node;
	}
}
