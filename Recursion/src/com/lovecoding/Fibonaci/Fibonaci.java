package com.lovecoding.Fibonaci;

public class Fibonaci {

	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		long[] arr=new long[101];
		System.out.println(findFibonaci(100, arr));
		long end=System.currentTimeMillis();
		System.out.println("Time taken : "+(end-start));

	}

	private static long findFibonaci(int i, long[] arr) {
		if(i==1 || i==0) return i;
		if(arr[i]==0){
		arr[i]=findFibonaci(i-1, arr)+findFibonaci(i-2, arr);
		}
		return arr[i];
	}

}
