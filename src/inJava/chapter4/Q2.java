package inJava.chapter4;

import inJava.chapter0.TreeNode;

public class Q2 {
	public TreeNode minimalTree(int[] arr) {
		if (arr == null || arr.length == 0)
			return null;
		return buildBST(arr, 0, arr.length - 1);
	}

	public TreeNode buildBST(int[] arr, int start, int end) {
		if (end < start)
			return null;
		int mid = start + (end - start) / 2;
		TreeNode root = new TreeNode(arr[mid]);
		root.left = buildBST(arr, start, mid - 1);
		root.right = buildBST(arr, mid + 1, end);
		return root;
	}
}
