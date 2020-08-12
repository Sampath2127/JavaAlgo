package com.lovecoding.trees;

public class Main {

	public static void main(String[] args) {
		Tree<Integer> bst=new BinarySearchTree<>();
		/*bst.insert(30);
		bst.insert(20);
		bst.insert(10);
		bst.insert(40);
		bst.insert(70);
		bst.insert(25);
		bst.insert(35);
		bst.insert(15);
		bst.insert(5);
		bst.insert(45);*/
		
		bst.insert(11);
		bst.insert(22);
		bst.insert(17);
		
		//System.out.println(bst.getMinVal());
		System.out.println(bst.countNodesinTree(bst.getRootNode().getLeftChild()));
		bst.traversal(Traversal.POSTORDER);
		bst.traversalIterative(Traversal.POSTORDER);
		//bst.traversal(Traversal.PREORDER);
		//bst.traversal(Traversal.POSTORDER);
		
		//bst.delete(35);
		//bst.traversal(Traversal.INORDER);
		
		//System.out.println(bst.getMaxVal());
		
		//Custom objects in Tree
		/*
		Tree<Person> bst=new BinarySearchTree<>();
		bst.insert(new Person("Adam", 25));
		bst.insert(new Person("Eve", 27));
		bst.insert(new Person("Sam", 20));
		bst.insert(new Person("Pam", 17));
		bst.insert(new Person("Tony", 35));
		bst.insert(new Person("Gary", 58));
		
		bst.traversal(Traversal.INORDER);*/
		

	}

}
