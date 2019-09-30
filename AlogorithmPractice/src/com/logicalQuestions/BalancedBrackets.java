package com.logicalQuestions;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	public static boolean isBalanced(String expression) {
        Stack<Character> stack=new Stack<>();
        if(expression.length()%2!=0) return false;
        for(char c:expression.toCharArray()){
           if(c=='(' || c=='[' || c=='{') stack.push(c);
            if(c==')'){
                if(stack.empty()) return false;
               else if(stack.peek()=='(') stack.pop();
            }
            if(c=='}'){
                if(stack.empty()) return false;
               else if(stack.peek()=='{') stack.pop();
            }
            if(c==']'){
                if(stack.empty()) return false;
               else if(stack.peek()=='[') stack.pop();
            }
        }
        if(stack.empty()) return true;
    return false;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
        in.close();
    }
    
}
