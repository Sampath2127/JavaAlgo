package com.logicalQuestions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int number=scr.nextInt();
		scr.close();
		System.out.println(findFibonacci(number, new int[number+1]));
	}

	private static int findFibonacci(int number, int[] memo) {
		if(number==0 || number ==1) return number;
		System.out.println(number);
		if(memo[number]==0)
		memo[number]= findFibonacci(number-1, memo)+findFibonacci(number-2, memo);
	return memo[number];
	}

	
}
