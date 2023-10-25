package sortings.algos.all;

public class SelectionSort {
	
	/*
	 * The idea of selection sort is to find the min value in each iteration and
	 * place it at the first index. 
	 * 
	 * In the function below, we iterated over an array from 0 to n-2, because the n-1 element will be at its place by default , and
	 * tried to find the index of min element and swap that index with the first
	 * element. 
	 * 
	 * After every iteration, the min element comes at the initial index
	 */
	
	public static void sort(int[] arr) {
		
		int n = arr.length;
		for(int i=0;i<(n-1);i++) {
			int minIndex=i;
			for(int j =i+1;j<n;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
				}
			}
			if(i!=minIndex) {
				arr[minIndex]= arr[minIndex]^arr[i];
				arr[i]=arr[minIndex]^arr[i];
				arr[minIndex]=arr[minIndex]^arr[i];
			}
		}
	}
	
	//The time complexity for this algorithm is O(n^2)
	//There is no worst case or best case, it is just traversing through all the elements
	//towards right side, so complexity will remain same in all the cases

}
