package com.lovecoding.quicksort;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
		int arr[]=new int[]{1,1,2,3,3,3,5,4};
		Map<Integer, Boolean> map=new HashMap<>();
		for(int i=0; i<arr.length; i++){
			if(map.containsKey(arr[i])) map.put(arr[i], true);
			else map.put(arr[i], false);
		}
		int count=0;
		for(int i: map.keySet()){
			
			if(map.get(i)==true) count++;
		}
		System.out.println(count);
	*/	
		int arr1[]=new int[]{1,2,3};
		int arr2[]=new int[]{2,4};
		
		int arr[]=findvalues(arr1, arr2);
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}

	private static int[] findvalues(int[] arr1, int[] arr2) {
		
		int arr[]=new int[arr2.length];
		for(int i=0; i<arr2.length; i++){
			int count=0;
			for(int j=0;j<arr1.length; j++){
				if(arr1[j]<=arr2[i]) count++;
			}
			arr[i]=count;
		}
		return arr;
	}

}
