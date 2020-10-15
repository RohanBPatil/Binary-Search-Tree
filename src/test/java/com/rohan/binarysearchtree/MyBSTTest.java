package com.rohan.binarysearchtree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBSTTest {

	@Test
	void whenNoNodeAdded_shouldReturn_zeroSize() {
		MyBST<Integer> bst = new MyBST<>();
		assertEquals(0, bst.size());
	}

	@Test
	void whenOneNodeAdded_shouldReturn_oneSize() {
		MyBST<Integer> bst = new MyBST<>();
		bst.add(56);
		assertEquals(1, bst.size());
	}

	@Test
	void whenTwoNodesAdded_shouldReturn_twoSize() {
		MyBST<Integer> bst = new MyBST<>();
		bst.add(56);
		bst.add(30);
		assertEquals(2, bst.size());
	}

	@Test
	void whenThreeNodesAdded_shouldReturn_threeSize() {
		MyBST<Integer> bst = new MyBST<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		assertEquals(3, bst.size());
	}

}
