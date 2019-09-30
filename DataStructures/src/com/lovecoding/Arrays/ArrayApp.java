package com.lovecoding.Arrays;

public class ArrayApp {

public static void main(String[] args) {
	
	int[] nums=new int[5];
	
	for(int i=0; i<nums.length; i++)
		nums[i]=2*i;
	
	//O(1) complexity
	int num = nums[2];
	System.out.println(num);
	
	//O(N) "Linear Search"
	
	for(int i=0; i<nums.length; i++){
		if(nums[i]==4)
			System.out.println("index found, "+i);
	}
}
}

