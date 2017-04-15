package inJava.chapter4;

import java.util.LinkedList;
import java.util.Queue;

import inJava.chapter0.TreeNode;

public class Q5 {
	public boolean validateBST(TreeNode tree) {
		Queue<Integer> base = new LinkedList<>();
		inordervisit(tree, base);
		while (!base.isEmpty()) {
			int cur = base.poll();
			if (!base.isEmpty() && cur > base.peek()) {
				return false;
			}
		}
		return true;
	}

	private void inordervisit(TreeNode tree, Queue<Integer> base) {
		if (tree == null)
			return;
		inordervisit(tree.left, base);
		base.offer(tree.val);
		inordervisit(tree.right, base);
	}
}
