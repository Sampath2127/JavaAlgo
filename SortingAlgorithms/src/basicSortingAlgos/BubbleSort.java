package basicSortingAlgos;

import java.util.Scanner;

public class BubbleSort {
	
	public int[] sort(int[] arr){
		int temp;
		for(int i=0; i<arr.length-1; i++){
			for(int j=0; j<arr.length-1-i; j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
						}
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=scr.nextInt();
		}
		new BubbleSort().sort(arr);
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}

}
