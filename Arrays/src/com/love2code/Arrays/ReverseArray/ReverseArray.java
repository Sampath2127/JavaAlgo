package com.love2code.Arrays.ReverseArray;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr=new int[]{1,2,3,4,5};
		for(int val:arr)
		System.out.print(val+" ");
		System.out.println();
		reverse(arr);
		for(int val:arr)
		System.out.print(val+" ");
	}

	private static void reverse(int[] arr) {
	
		int maxIndex=arr.length-1;
		int halfLength=arr.length/2;
		for(int i=0; i<halfLength; i++){
			int temp=arr[i];
			arr[i]=arr[maxIndex-i];
			arr[maxIndex-i]=temp;
			
		}
		
		//one way to do it
	/*int[] copyArr=new int[arr.length];
	int j=arr.length-1;
	for(int i=0; i<arr.length; i++){
		copyArr[i]=arr[j];
		j--;
	}
	for(int i=0; i<arr.length; i++)
	arr[i]=copyArr[i];
	}*/
	}
}
