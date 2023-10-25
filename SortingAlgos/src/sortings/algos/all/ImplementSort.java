package sortings.algos.all;
import java.util.Scanner;

import sortings.algos.all.BubbleSort;

public class ImplementSort {
	
	public static int[] inputArray(int n) {
		int[] arr = new int[n];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr =inputArray(n);
		BubbleSort.sort(arr);
		//SelectionSort.sort(arr);
		printArray(arr);
		
	}

}
