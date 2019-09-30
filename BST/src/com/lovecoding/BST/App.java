package com.lovecoding.BST;

public class App {

	public static void main(String[] args) {
		/* Tree<String> bst=new BinaryTree<>();
		
		
		bst.insertData("Thota");
		bst.insertData("Karin");
		bst.insertData("Srini");
		bst.insertData("Julie");
		bst.insertData("Jennifer");
		bst.insertData("Adam");
		bst.insertData("Elie");
		bst.insertData("Zack");
		System.out.println(bst.getMax());
		System.out.println(bst.getMin());
		*/
		
		/*Tree<Integer> bst=new BinaryTree<>();
		bst.insertData(10);
		bst.insertData(6);
		bst.insertData(12);
		bst.insertData(11);
		bst.insertData(13);
		bst.insertData(9);
		bst.insertData(7);
		bst.insertData(5);
		bst.insertData(15);
		bst.inOrderTraversal();
		
		bst.delete(10);*/
		
		Tree<Person> bst=new BinaryTree<>();
		bst.insertData(new Person("Adam", 27));
		bst.insertData(new Person("Sam", 27));
		bst.insertData(new Person("Zen", 35));
		bst.insertData(new Person("Yoni",22));
		bst.insertData(new Person("Thomas", 99));
		bst.insertData(new Person("Pamela", 38));
		
		bst.inOrderTraversal();
	}
}
