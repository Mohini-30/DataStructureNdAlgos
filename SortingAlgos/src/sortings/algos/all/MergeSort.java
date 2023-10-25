package sortings.algos.all;

public class MergeSort {
	
	
	public static void sort(int[] arr) {
		sort(arr,0,arr.length-1);
	}
	
	private static void sort(int[] arr, int l, int h) {
		
		if(h==l)
			return;
		int mid = l+((h-l)/2);
		sort(arr,l,mid);
		sort(arr,mid+1,h);
		merge2SortedArray(arr,l,mid,h);
	}

	private static void merge2SortedArray(int[] arr, int l, int mid, int h) {
		// TODO Auto-generated method stub
		
		int i=l;
		int j=mid+1;
		while(i<mid) {
			if(arr[i]<arr[j]) {
				
			}
		}
	}

}
