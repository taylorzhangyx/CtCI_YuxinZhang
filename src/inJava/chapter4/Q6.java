package inJava.chapter4;

public class Q6 {
	class TreeNodeParent {
		int val;
		TreeNodeParent left, right, parent;

		TreeNodeParent(int val) {
			this.val = val;
		}
	}

	public TreeNodeParent successor(TreeNodeParent node) {
		if (node.right != null) {
			return findleft(node.right);
		}
		if (node.parent == null) {
			return null;
		} else if (node.parent.left == node) {
			return node.parent;
		} else {
			while (node.parent != null && node.parent.right == node) {
				node = node.parent;
			}
			return node.parent;
		}
	}

	public TreeNodeParent findleft(TreeNodeParent node) {
		while (node != null && node.left != null) {
			node = node.left;
		}
		return node;
	}
}
