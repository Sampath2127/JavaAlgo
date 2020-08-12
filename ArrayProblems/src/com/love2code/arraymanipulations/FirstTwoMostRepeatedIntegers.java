package com.love2code.arraymanipulations;

import java.util.HashMap;
import java.util.Map;

public class FirstTwoMostRepeatedIntegers {

	private static Map<Integer, Integer> map=new HashMap<>();
	
	public static void main(String[] args) {
		
		int array[]=new int[]{7, 3, 3, 2, 1, 1, 2, 8, 7, 2, 3,  9, 7};
		
		findMostRepeatedInteger(array);
		
		
	}

	private static void findMostRepeatedInteger(int[] array) {

		for(int i=0; i<array.length; i++){
			if(map.containsKey(array[i])){
				map.put(array[i], map.get(array[i])+1);
			}else{
				map.put(array[i], 1);
			}
		}
		
		int Max_value=Integer.MIN_VALUE;
		for(Integer value:map.keySet()){
			if(map.get(value)>Max_value) Max_value=map.get(value);
		}
		
		System.out.println("Maximum repeated value is");

		int count=0;
		for(Integer key:map.keySet()){
			if(map.get(key)==Max_value) {
				System.out.print(key+" ");
				count++;
			}
			
			if(count==2) break;
		}
	}

}
