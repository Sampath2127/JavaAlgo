package com.lovecoding.stackArrays;

public class App {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		
		stack.push(7);
		stack.push(8);
		stack.push(9);
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());
	}
	
}
