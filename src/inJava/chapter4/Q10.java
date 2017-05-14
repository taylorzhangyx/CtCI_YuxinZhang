package inJava.chapter4;

import inJava.chapter0.TreeNode;

public class Q10 {
	class A1{
		boolean containsTree(TreeNode t1, TreeNode t2){
			StringBuilder s1 = new StringBuilder(), s2 = new StringBuilder();
			
			getOrderString(s1, t1);
			getOrderString(s2, t2);
			
			return s1.indexOf(s2.toString()) != -1;
		}

		private void getOrderString(StringBuilder sb, TreeNode node) {
			if(node == null){
				sb.append("X");
				return;
			}
			sb.append(node.val + " ");
			getOrderString(sb, node.left);
			getOrderString(sb, node.right);
			
		}
	}
	
	class A2{
		boolean containsTree(TreeNode t1, TreeNode t2){
			if(t2 == null) return true;
			return subTree(t1,t2);
		}
		boolean subTree(TreeNode t1, TreeNode t2){
			if(t1 == null) return false;
			else if(t1.val == t2.val && matchTree(t1,t2)) return true;
			return subTree(t1.left, t2) || subTree(t1.right, t2);
		}
		private boolean matchTree(TreeNode t1, TreeNode t2) {
			if(t1 == null && t2 == null) return  true;
			else if(t1 == null || t2 == null) return false;
			else if(t1.val != t2.val) return false;
			else return matchTree(t1.left, t2.left) && matchTree(t1.right, t2.right);
		}
	}
}
