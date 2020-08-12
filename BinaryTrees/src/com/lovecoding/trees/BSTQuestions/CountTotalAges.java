package com.lovecoding.trees.BSTQuestions;

import com.lovecoding.trees.BinarySearchTree;
import com.lovecoding.trees.Person;
import com.lovecoding.trees.Traversal;
import com.lovecoding.trees.Tree;

public class CountTotalAges {

	public static void main(String[] args) {
	
		Tree<Person> bst=new BinarySearchTree<>();
		bst.insert(new Person("Adam", 25));
		bst.insert(new Person("Eve", 27));
		bst.insert(new Person("Sam", 20));
		bst.insert(new Person("Pam", 17));
		bst.insert(new Person("Tony", 35));
		bst.insert(new Person("Gary", 58));
		
		bst.traversal(Traversal.INORDER);
		System.out.println(bst.countTotalAge(bst.getRootNode()));
	}

}
