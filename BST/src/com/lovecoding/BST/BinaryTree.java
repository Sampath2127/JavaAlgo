package com.lovecoding.BST;

public class BinaryTree<T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;

	@Override
	public void traverseal() {
		// TODO Auto-generated method stub
		
	}

	
	private void insert(T data, Node<T> node) {
		
		if(data.compareTo(node.getData())<0 ){
			if(node.getLeftChild()==null) node.setLeftChild(new Node<>(data));
			else insert(data, node.getLeftChild());
		}else {
			if(node.getRightChild()==null) node.setRightChild(new Node<>(data));
			else insert(data, node.getRightChild());
		}
	}

	@Override
	public void delete(T data) {
		
		if(root==null) 
		{
			System.out.println("Root is null");
		}
		else delete(root, data);
	}

	
	private Node<T> delete(Node<T> node, T data) {
		
		if(node ==null) return node;
		
		if(data.compareTo(node.getData())<0){
			node.setLeftChild(delete(node.getLeftChild(), data));
		}else if(data.compareTo(node.getData())>0){
			node.setRightChild(delete(node.getRightChild(), data));
		}else{
			if(node.getLeftChild()==null && node.getRightChild()==null){
				System.out.println("Removing the leaf Node");
				return null;
			}
			else if(node.getLeftChild()==null){
				System.out.println("Removing the right child and reassigning to parent node");
				 Node<T> tempNode=node.getRightChild();
				 node=null;
				 return tempNode;
			}else if(node.getRightChild()==null){
				System.out.println("Removing the left child and reassigning to parent node");
				 Node<T> tempNode=node.getLeftChild();
				 node=null;
				 return tempNode;
			}else{
				System.out.println("Removing item with two children");
				Node<T> tempNode=getPredecessor(node.getLeftChild());
				
				node.setData(tempNode.getData());
				node.setLeftChild(delete(node.getLeftChild(), tempNode.getData()));
			}
		}
		
		
		
		return node;
		
		//another way to perform delete
		/*Node<T> current=node;
		Node<T> parent=node;
		boolean isLeftChild=false;
		if(current==null) return;
		
		while(current.getData()!=null && current.getData().compareTo(data)!=0){
			parent=current;
			
			if(data.compareTo(current.getData())<0){
				current=current.getLeftChild();
				isLeftChild=true;
			}else{
				current=current.getRightChild();
				isLeftChild=false;
			}
		}
		if(current==null)
			return;
		
		
		 * Node to be deleted has no children
		 
		if(current.getLeftChild()==null && current.getRightChild()==null){
			if(current==node) node=null;
			else{
			if(isLeftChild) parent.setLeftChild(null);
			else parent.setRightChild(null);
		}
			
			 * Node to be deleted has single children
			 
		}else if(current.getRightChild()==null){
			
			if(current==root) root=root.getLeftChild();
			else if(isLeftChild)
			parent.setLeftChild(current.getLeftChild()); 
		}else if(current.getLeftChild()==null){
			
			if(current==root) root=root.getRightChild();
			else if(!isLeftChild)
			parent.setRightChild(current.getRightChild());
		}
		
		 * Node to be deleted has two children
		 
		else{
			  
		}
		*/
		
		
	}


	private Node<T> getPredecessor(Node<T> node) {
		if(node.getRightChild()!=null) return getPredecessor(node.getRightChild());
		System.out.println(node);
		return node;
	}


	public T getMax(Node<T> node) {
		if(node.getRightChild()==null) return node.getData();
		else return getMax(node.getRightChild());
	}

	
	public T getMin(Node<T> node) {
		if(node.getLeftChild()==null) return node.getData();
		else return getMin(node.getLeftChild());
	}
	
	@Override
	public void insertData(T data){
		if(root==null) root=new Node<>(data);
		else insert(data, root);
	}


	@Override
	public T getMax() {
	
		if(root==null) return null;
		return getMax(root);
	}


	@Override
	public T getMin() {
		
		if(root==null) return null;
		return getMin(root);
	}


	@Override
	public void inOrderTraversal() {
		if(root!=null) inOrderTraversal(root);
		
	}


	private void inOrderTraversal(Node<T> node) {
		if(node.getLeftChild()!=null) inOrderTraversal(node.getLeftChild());
		System.out.print(node+" --> ");
		if(node.getRightChild()!=null) inOrderTraversal(node.getRightChild());
	}
}
