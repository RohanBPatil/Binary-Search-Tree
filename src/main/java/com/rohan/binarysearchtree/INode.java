package com.rohan.binarysearchtree;

public interface INode<k extends Comparable<k>> {
	public void setKey(k key);

	public k getKey();
}
