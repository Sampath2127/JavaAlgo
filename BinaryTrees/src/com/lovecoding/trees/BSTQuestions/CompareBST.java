package com.lovecoding.trees.BSTQuestions;

import com.lovecoding.trees.BinarySearchTree;
import com.lovecoding.trees.Node;
import com.lovecoding.trees.Person;
import com.lovecoding.trees.Traversal;
import com.lovecoding.trees.Tree;

public class CompareBST {


	
	public static void main(String[] args) {
		Tree<Integer> bst1=new BinarySearchTree<>();
		bst1.insert(30);
		bst1.insert(20);
		bst1.insert(10);
		bst1.insert(40);
		bst1.insert(70);
		bst1.insert(25);
		bst1.insert(35);
		bst1.insert(15);
		bst1.insert(5);
		bst1.insert(45);
		bst1.traversal(Traversal.INORDER);
		
		Tree<Integer> bst2=new BinarySearchTree<>();
		bst2.insert(30);
		bst2.insert(20);
		bst2.insert(10);
		bst2.insert(40);
		bst2.insert(70);
		bst2.insert(25);
		bst2.insert(35);
		bst2.insert(15);
		bst2.insert(5);
		bst2.insert(45);
		bst2.insert(75);
		bst2.traversal(Traversal.INORDER);
		System.out.println(compareBSTs(bst1.getRootNode(), bst2.getRootNode()));
	}

	private static boolean compareBSTs(Node<Integer> node1, Node<Integer> node2) {
		
		if((node1==null && node2==null) || (node1==null && node2!=null) || (node1!=null && node2==null)) return node1==node2;
		
		if(node1.getData().compareTo(node2.getData())!=0) return false;
		
		return compareBSTs(node1.getLeftChild(), node2.getLeftChild()) && compareBSTs(node1.getRightChild(), node2.getRightChild());
	} 

	
}
