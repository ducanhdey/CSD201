package org.example.Tree.UsingLinkedList;

public class TestBST {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
//		bst.root = bst.insert(bst.root, 5);
//		bst.root = bst.insert(bst.root, 6);
//		bst.root = bst.insert(bst.root, 3);
//		bst.root = bst.insert(bst.root, 4);
//		bst.root = bst.insert(bst.root, 2);


		bst.root = bst.insertIntoBST(bst.root,5);
		bst.root = bst.insertIntoBST(bst.root,6);
		bst.root = bst.insertIntoBST(bst.root,7);
		bst.root = bst.insertIntoBST(bst.root,8);
		bst.root = bst.insertIntoBST(bst.root,3);
		bst.root = bst.insertIntoBST(bst.root,2);
		System.out.println("DONE");

	}
}
