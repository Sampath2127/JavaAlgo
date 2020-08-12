package com.lovecoding.trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
	private Node<T> root;
	private static int totalAge=0;
	
	public void insert(T data) {
	
		if(root==null) root=new Node<T>(data);
		else{
			insertNode(data, root);
			}
		}
	

	public void insertNode(T data, Node<T> node) {

		
		if (data.compareTo(node.getData()) < 0) {
			if (node.getLeftChild() != null) {
				insertNode(data, node.getLeftChild());
			} else {
				Node<T> newNode = new Node<>(data);
				node.setLeftChild(newNode);
			}
		} else {
			if (node.getRightChild() != null) {
				insertNode(data, node.getRightChild());
			} else {
				Node<T> newNode = new Node<>(data);
				node.setRightChild(newNode);
			}
		}

	}

	@Override
	public Node<T> delete(T data) {
		
		if(root==null){
			return root;
		}
		else{
			return deleteNode(data, root);
		}
	}

	private Node<T> deleteNode(T data, Node<T> node) {
		if(node.getData().compareTo(data)>0){
			node.setLeftChild(deleteNode(data, node.getLeftChild()));
		}else if(node.getData().compareTo(data)<0){
			node.setRightChild(deleteNode(data, node.getRightChild()));
		}else{
			if(node.getLeftChild()==null && node.getRightChild()==null){
				node=null;
				return node; 
			}else if(node.getLeftChild()==null){
				Node<T> tempNode=node.getRightChild();
				node=null;
				return tempNode;
			
			}else if(node.getRightChild()==null){
				Node<T> tempNode=node.getLeftChild();
				node=null;
				return tempNode;
			}else{
				Node<T> tempNode=findRightMostNode(node.getLeftChild());
				node.setData(tempNode.getData());
				deleteNode(tempNode.getData(), node.getLeftChild());
			}
		}
		return node;
	}


	@Override
	public T getMaxVal() {
		Node<T> rightMostNode=null;
		if(root==null) return null;
		else if(root.getRightChild()==null) return root.getData();
		else{
			rightMostNode=findRightMostNode(root);
		}
		return rightMostNode.getData();
	}

	private Node<T> findRightMostNode(Node<T> node) {
		if(node.getRightChild()!=null){
			return findRightMostNode(node.getRightChild());
		}
		return node;
	}


	@Override
	public T getMinVal() {
		if(root==null) return null;
		while(root.getLeftChild()!=null) root=root.getLeftChild();
		return root.getData();
	}


	@Override
	public void traversal(Traversal traversal) {
		switch(traversal){
		
		case INORDER:
			System.out.println("Printing in order..!");
			printInOrder(root);
			System.out.println();
			break;
		case PREORDER:
			System.out.println("Printing pre order..!");
			printPreOrder(root);
			System.out.println();
			break;
		case POSTORDER:
			System.out.println("Printing post order..!");
			printPostOrder(root);
			System.out.println();
			break;
		default:
			System.out.println("Please mention the order to print..!");
			break;
		}
	}

	private void printInOrder(Node<T> node) {
		
		if(node==null) return;
		if(node.getLeftChild()!=null) printInOrder(node.getLeftChild());
		System.out.print(node.getData()+" ");
		if(node.getRightChild()!=null) printInOrder(node.getRightChild());
	}


	private void printPreOrder(Node<T> node) {
		if(node==null) return;
		System.out.print(node.getData()+" ");
		if(node.getLeftChild()!=null) printPreOrder(node.getLeftChild());
		if(node.getRightChild()!=null) printPreOrder(node.getRightChild());
		
	}
	
	private void printPostOrder(Node<T> node) {
		if(node==null) return;
		if(node.getLeftChild()!=null) printPostOrder(node.getLeftChild());
		if(node.getRightChild()!=null) printPostOrder(node.getRightChild());
		System.out.print(node.getData()+" ");
	}


	@Override
	public Node<T> getRootNode() {
		
		return root;
	}


	@Override
	public int countNodesinTree(Node<T> node) {
		
		if(node==null) return 0;
		return countNodesinTree(node.getLeftChild())+countNodesinTree(node.getRightChild())+1;
	}


	@Override
	public Node<T> getKSmallest(Node<T> node, int k) {

		int n=countNodesinTree(node.getLeftChild())+1;
		
		if(n==k) return node;
		
		if(n>k) return getKSmallest(node.getLeftChild(), k);
		
		if(n<k) return getKSmallest(node.getRightChild(), k-n);
		return null;
	}


	@Override
	public int countTotalAge(Node<T> node) {
		if(node==null) return 0;
		
		if(node.getLeftChild()!=null) countTotalAge(node.getLeftChild());
		totalAge+= ((Person)node.getData()).getAge();
		if(node.getRightChild()!=null) countTotalAge(node.getRightChild());
		
		return totalAge;
	}


	@Override
	public void traversalIterative(Traversal traversal) {
		
		switch(traversal){
		
		case INORDER:
			System.out.println("Printing in order iteratively..!");
			printInOrderIterative(root);
			System.out.println();
			break;
		case PREORDER:
			System.out.println("Printing pre order iteratively..!");
			printPreOrderIterative(root);
			System.out.println();
			break;
		case POSTORDER:
			System.out.println("Printing post order iteratively..!");
			printPostOrderIterative(root);
			System.out.println();
			break;
		default:
			System.out.println("Please mention the order to print..!");
			break;
		}
		
	}


	private void printPostOrderIterative(Node<T> root) {
		List<T> postOrderList = new ArrayList<>();

		Stack<Node<T>> nodeStack = new Stack<>();
		
		Map<Node<T>,Integer> nodeMap=new HashMap<>();
		
		while(true){
			
			while (root != null) {
				nodeStack.push(root);
				root = root.getLeftChild();
			}
			
			if(nodeStack.empty()){
				break;
			}
			
			Node<T> currentNode=nodeStack.peek();
			if(nodeMap.containsKey(currentNode)){
				nodeMap.put(currentNode, nodeMap.get(currentNode)+1);
			}else{
				nodeMap.put(currentNode, 1);
			}
			if(currentNode.getRightChild()!=null && !(nodeMap.get(currentNode)>1)){
				root=currentNode.getRightChild();
				continue;
			}else{
				nodeStack.pop();
			}
			postOrderList.add(currentNode.getData());
		}
		
		for(T data:postOrderList)
			System.out.print(data+" ");
		
	}


	private void printPreOrderIterative(Node<T> root) {
		List<T> preorderList = new LinkedList<T>();

		Stack<Node<T>> nodeStack = new Stack<>();

		nodeStack.push(root);

		while (!nodeStack.empty()) {
			Node<T> visitedNode = nodeStack.pop();
			preorderList.add(visitedNode.getData());
			if (visitedNode.getRightChild() != null)
				nodeStack.push(visitedNode.getRightChild());
			if (visitedNode.getLeftChild() != null)
				nodeStack.push(visitedNode.getLeftChild());

		}
		for (T data : preorderList)
			System.out.print(data + " ");

	}


	private void printInOrderIterative(Node<T> root) {
		List<T> inorderList = new ArrayList<>();

		Stack<Node<T>> nodeStack = new Stack<>();
		Node<T> current=root;
		while(true){
			while(current!=null){
				nodeStack.push(current);
				current=current.getLeftChild();
			}
			if(nodeStack.empty()) break;
			Node<T> visitedNode=nodeStack.pop();
			inorderList.add(visitedNode.getData());
			current=visitedNode.getRightChild();
			
		}
		
		for (T data : inorderList)
			System.out.print(data + " ");

	}
		
	}


