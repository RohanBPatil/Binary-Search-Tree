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
	
	@Test
	void whenAllNodesAdded_shouldReturn_itsSize() {
		MyBST<Integer> bst = new MyBST<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(22);
		bst.add(40);
		bst.add(11);
		bst.add(3);
		bst.add(16);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		assertEquals(13, bst.size());
	}
}
