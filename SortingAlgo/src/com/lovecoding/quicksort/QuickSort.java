package com.lovecoding.quicksort;



public class QuickSort {

	
	public static void main(String[] args) {
		QuickSort sort=new QuickSort();
		int[] arr=new int[]{5,12,9,7,8,6};
		int start=0;
		int end=arr.length-1;
		sort.sortArray(arr, start, end);
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i]+" ");
	}

	private void sortArray(int[] arr, int start, int end) {
		if(start<end){
			int index=partition(arr, start, end);
			sortArray(arr, start, index-1);
			sortArray(arr, index+1, end);
		}
	}

	private int partition(int[] arr, int start, int end) {
		int pivot=arr[end];
		int i=start;
		for(int j=start; j<end; j++){
			if(arr[j]<=pivot){
				exchange(arr, i, j);
				i++;
			}
		}
		exchange(arr, i, end);
		return i;
	}

	private void exchange(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
