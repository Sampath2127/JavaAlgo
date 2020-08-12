package com.love2code.arraymanipulations;

public class ReverseAnArray {

	private static int[] intarray=new int[10000];
	private static int[] tempArray=new int[intarray.length];
	public static void main(String[] args) {
	
	for(int j=0; j<10000; j++){
		intarray[j]=j;
	}
	int counter=intarray.length-1;
	for(int i:intarray){
		tempArray[counter]=i;
		counter--;
	}
	intarray=tempArray;
	for(int i:intarray)
	System.out.print(i+", ");
	}
}
