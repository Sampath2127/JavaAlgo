package com.love2code.Arrays.challengeMinelement;

import java.util.Arrays;
import java.util.Scanner;

public class MinElementInArr {
	private static Scanner scr=new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr=readIntegers(scr.nextInt());
		int minValue=findMin(arr);
		System.out.println(minValue);
	}

	private static int findMin(int[] arr) {
		
		//Arrays.sort(arr);
		//System.out.println(Integer.MAX_VALUE +" Inter min value "+Integer.MIN_VALUE);
		int min=Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		return min;
	}

	private static int[] readIntegers(int count) {
		int[] arr=new int[count];
		
		for(int i=0; i<arr.length; i++){
			arr[i]=scr.nextInt();
		}
		return arr;
	}

}
