package com.love2code.arraymanipulations;

public class RevereseAnArrayInplace {

	private static int[] intarray=new int[10000];
	
	public static void main(String[] args) {
		for(int j=0; j<10000; j++){
			intarray[j]=j;
		}
		int[] reversedarray=reverseArray(intarray);
		for(int i:intarray) System.out.print(i+", ");
	}

	private static int[] reverseArray(int[] intarray2) {
		int start=0;
		int end=intarray2.length-1;
		
		while(start<end){
			swap(start,end,intarray2);
			start++;
			end--;
		}
		return intarray2;
	}

	private static void swap(int start, int end, int[] intarray2) {
		int temp=intarray2[end];
		intarray2[end]=intarray2[start];
		intarray2[start]=temp;
	}

}
