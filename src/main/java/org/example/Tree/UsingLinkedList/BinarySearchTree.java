package org.example.Tree.UsingLinkedList;

public class BinarySearchTree {
	public TreeNode root;

	public BinarySearchTree() {

	}

	public TreeNode insert(TreeNode root, int value) {
		//using iterator
		//Case 1 : root = null
		if (root == null) {
			root = new TreeNode(value);
			return root;
		} else {
			TreeNode temp = root;
			while (true) {
				if (temp.val < value) {
					if (temp.right == null) {
						temp.right = new TreeNode(value);
						break;
					} else
						temp = temp.right;
				} else {
					if (temp.left == null) {
						temp.left = new TreeNode(value);
						break;
					} else
						temp = temp.left;
				}
			}
			return root;
		}

	}

	//using recursion
	public TreeNode insertIntoBST(TreeNode root, int value) {
		if (root == null) {
			return new TreeNode(value);
		}
		if (value < root.val) {
			if (root.left == null) {
				root.left = new TreeNode(value);
			} else {
				insertIntoBST(root.left, value);
			}
		} else {
			if (root.right == null) {
				root.right = new TreeNode(value);
			} else {
				insertIntoBST(root.right, value);
			}
		}
		return root;
	}

}
