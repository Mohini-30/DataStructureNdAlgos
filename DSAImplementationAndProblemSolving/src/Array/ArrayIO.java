package Array;

import java.util.ArrayList;

public class ArrayIO {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }
    public static void printArray(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+ " ");
        System.out.println();
    }

    public static void swapTwoIndexes(ArrayList<Integer> arr, int i1, int i2){
        int temp = arr.get(i1);
        arr.set(i1, arr.get(i2));
        arr.set(i2,temp);
    }
}
