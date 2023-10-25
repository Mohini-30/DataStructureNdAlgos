package sortings.algos.all;

public class BubbleSort {
	
	/*
	 * The idea of bubble sort is doing consecutive comparison and  placing the highest 
	 * element at the end
	 * After each iteration , the highest element will reach at the end position of the array
	 * This algorithm is input dependent algorithm because its time complexity depends upon input
	 */
	
	public static void sort(int[] arr) {
		
		int n = arr.length;
		for(int i=0;i<n;i++) {
			boolean swap = false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap=true;
					arr[j]=arr[j+1]^arr[j];
					arr[j+1]=arr[j+1]^arr[j];
					arr[j]=arr[j+1]^arr[j];
				}
			}
			if(!swap)
				return;
		}
	}
	/*
	 * Time complexity of this algo ranges from O(n) to O(n^2)
	 * As the best case is when sorted array given so because of swap variable 
	 * there will be no swap and only after first it will break
	 * 
	 *   The worst case condition is when reverse sorted array is given then all the iterations will 
	 *   take place and highest time will be taken
	 */
}
