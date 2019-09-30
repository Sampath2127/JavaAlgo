package com.logicalQuestions;

import java.util.Scanner;

public class PrimeNumber {

	public void printPrimes(int n){
		for(int i=2; i<n; i++){
			if(findPrime(i)) System.out.println(i);;
		}
	}
	private boolean findPrime(int i) {
		for(int j=2; j*j<=i; j++){
			if(i%j==0){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		PrimeNumber prime=new PrimeNumber();
		Scanner scr=new Scanner(System.in);
		int number=scr.nextInt();
		prime.printPrimes(number);
		scr.close();
	}

}
