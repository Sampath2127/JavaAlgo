package com.lovecoding.complexityN;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
	 
		int arr[]={5, 17, 7, 18, 8, 19, 9};
		
		MergeSort mergeSort=new MergeSort();
		mergeSort.sortArray(arr);
		System.out.println(Arrays.toString(arr));
	}

	private void sortArray(int[] arr) {
		mergeSort(arr, 0, arr.length-1);
	}

	private void mergeSort(int[] arr, int start, int end) {
	
		if(start<end){
			int mid=(start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}

	private void merge(int[] arr, int start, int mid, int end) {
		
		int left=mid-start+1;
		int right=end-mid;
		int[] leftArray=new int[left];
		int[] rightArray=new int[right];
		
		for(int i=0; i<left; i++){
			leftArray[i]=arr[start+i];
		}
		for(int j=0; j<right; j++){
			rightArray[j]=arr[mid+1+j];
		}
		int i=0, j=0;
		for(int k=start; k<=end; k++){
			if(j>=right || (i<left && leftArray[i]<=rightArray[j])){
				arr[k]=leftArray[i];
				i++;
			}else{
				arr[k]=rightArray[j];
				j++;
			}
			
		}
		
	}

}
