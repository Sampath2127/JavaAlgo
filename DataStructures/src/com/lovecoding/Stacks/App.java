package com.lovecoding.Stacks;

public class App {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		
		stack.push(777);
		stack.push(888);
		stack.push(999);
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.size());
		
	}
}
