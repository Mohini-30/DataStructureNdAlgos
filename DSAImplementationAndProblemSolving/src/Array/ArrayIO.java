package Array;

public class ArrayIO {

    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    public static void swapTwoIndexes(int[] arr, int i1,int i2){
        int temp = arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
