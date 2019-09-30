package com.love2code.Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int arr[]=getIntegers();
		sortIntegers(arr);
		printarray(arr);
	}

	private static void printarray(int[] arr) {
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}

	private static int[] sortIntegers(int[] arr) {
		
		for(int i=1; i<arr.length; i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]<temp){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=temp;
		}
		return arr;
	}

	private static int[] getIntegers() {
		System.out.println("Enter the size for array");
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values for array");
		for(int i=0; i<arr.length; i++){
			arr[i]=scr.nextInt();
		}
		return arr;
	}

}
