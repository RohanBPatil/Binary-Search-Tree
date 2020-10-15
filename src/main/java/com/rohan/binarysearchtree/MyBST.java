package com.rohan.binarysearchtree;

public class MyBST<k extends Comparable<k>> {
	private MyBinaryNode<k> root;

	public boolean add(k key) {
		this.root = addToBST(root, key);
		return true;
	}

	/**
	 * Recursively adds node to BST
	 */
	private MyBinaryNode<k> addToBST(MyBinaryNode<k> current, k key) {
		if (current == null) {
			return new MyBinaryNode<>(key);
		}
		int compareResult = key.compareTo(current.key);
		if (compareResult < 0)
			current.leftNode = addToBST(current.leftNode, key);
		else
			current.rightNode = addToBST(current.rightNode, key);
		return current;

	}

	public int size() {
		return getSize(root);
	}

	/**
	 * Recursively gets size of BST
	 */
	public int getSize(MyBinaryNode<k> current) {
		return (current == null) ? 0 : 1 + getSize(current.leftNode) + getSize(current.rightNode);
	}

}
