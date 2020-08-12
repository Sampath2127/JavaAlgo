package com.lovecoding.trees.BSTQuestions;

import java.util.Scanner;

import com.lovecoding.trees.BinarySearchTree;
import com.lovecoding.trees.Node;
import com.lovecoding.trees.Traversal;
import com.lovecoding.trees.Tree;

public class KelementinTree {
	static int count=1;
	public static void main(String[] args) {
		
		Tree<Integer> bst=new BinarySearchTree<>();
		bst.insert(12);
		bst.insert(4);
		bst.insert(1);
		bst.insert(5);
		bst.insert(20);
		
		bst.traversal(Traversal.INORDER);
		System.out.println(bst.getKSmallest(bst.getRootNode(), 3));
		
	}


}
