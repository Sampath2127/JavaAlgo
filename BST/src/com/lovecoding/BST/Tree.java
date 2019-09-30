package com.lovecoding.BST;

public interface Tree<T> {

	public void traverseal();
	public void delete(T data);
	public T getMax();
	public T getMin();
	public void insertData(T data);
	public void inOrderTraversal();
}
