package com.lovecoding.trees;

public interface Tree<T> {

	public void traversal(Traversal traversal);
	public void traversalIterative(Traversal traversal);
	public void insert(T data);
	public Node<T> delete(T data);
	public T getMaxVal();
	public T getMinVal();
	public Node<T> getRootNode();
	public int countNodesinTree(Node<T> root);
	public Node<T> getKSmallest(Node<T> node, int k);
	public int countTotalAge(Node<T> root);
}
