package inJava.chapter4;

import java.util.HashSet;

import inJava.chapter0.Node;

public class Q1 {
	public boolean routeBetweenNodes(Node node1, Node node2){
		HashSet<Node> set1 = new HashSet<Node>(), set2 = new HashSet<Node>() , visited = new HashSet<Node>();
		set1.add(node1);
		set2.add(node2);
		while(!set1.isEmpty()){
			HashSet<Node> newset = new HashSet<Node>();
			for(Node n : set1){
				for(Node child : n.children){
					if(!visited.contains(child)){//not visited before
						if(set2.contains(child)) return true;
						else newset.add(child);
					}
				}
			}
			set1 = set2;
			set2 = newset;
		}
		return false;
	}
}
