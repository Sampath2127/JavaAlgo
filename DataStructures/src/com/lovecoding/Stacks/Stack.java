package com.lovecoding.Stacks;

public class Stack<T extends Comparable<T>> {

	 private Node<T> root;
	 private int size;
	 Stack<Integer> stack=new Stack<>();
	 public void push(T newData){
		 this.size++;
		 
		 if(root==null){
			 this.root=new Node<>(newData);
		 }else{
			 Node<T> newNode=new Node<T>(newData);
			 newNode.setNextNode(root);
			 this.root=newNode;
		 }
	 }
	 
	 public T pop(){
		 T itemToPop; 
		 if(root==null) return null;
		 else{
			 itemToPop=this.root.getData();
			 this.root=root.getNextNode();  
			 this.size--;
		 }
		 return itemToPop;
	 }
	 
	 public int size(){
		 return this.size;
	 }
	 
	 public boolean isEmpty(){
		 return this.root==null;
	 }
	 
	 public T peek(){
		 if(root==null) return null;
		 return root.getData();
	 }
	
}
