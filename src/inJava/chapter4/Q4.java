package inJava.chapter4;

import inJava.chapter0.TreeNode;

public class Q4 {
	class Q44 {
		int max = 0, min = Integer.MAX_VALUE;

		public boolean checkBalanced(TreeNode tree) {
			findHeight(tree, 0);
			if (max - min <= 1)
				return true;
			return false;
		}

		public void findHeight(TreeNode tree, int level) {
			if (tree.left == null && tree.right == null) {
				if (level > max)
					max = level;
				if (level < min)
					min = level;
				return;
			}
			if (tree.left != null) {
				findHeight(tree.left, level + 1);
			}
			if (tree.right != null) {
				findHeight(tree.right, level + 1);
			}
		}
	}
}
