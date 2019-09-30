package basicSortingAlgos;

public class InsertionSort {

	public void sort(int arr[]){
		for(int i=0; i<arr.length; i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	public void printArray(int arr[]){
		System.out.print("{");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+", ");
		}
		System.out.print("}");
	}
	public static void main(String[] args) {
		int a[]= {35, 25, 12, 10, 7};
		InsertionSort iSort=new InsertionSort();
		iSort.sort(a);
		iSort.printArray(a);
	}

}
