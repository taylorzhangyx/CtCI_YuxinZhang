package inJava.chapter4;

import java.util.LinkedList;
import java.util.List;

import inJava.chapter0.TreeNode;

public class Q3 {
	public List<List<Integer>> listOfDepth(TreeNode tree) {
		List<List<Integer>> res = new LinkedList<List<Integer>>();
		buildList(res, tree, 0);
		return res;
	}

	public void buildList(List<List<Integer>> res, 
		TreeNode tree, int level){
		  if(tree == null) return;
		  if(res.size() == level){
		    res.add(new LinkedList<Integer>());
		  }
		  buildList(res, tree.left, level+1);
		  buildList(res, tree.right, level+1);
		  res.get(level).add(tree.val);
		}
}
