import Array.ArrayIO;
import HeapImpl.MaxHeap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] arr = {3,6,5,0,8,2,1,9};
        ArrayIO.printArray(arr);
        //arr[1]=1;
        //MaxHeap.maxHeapify(arr,1);
        //ArrayIO.printArray(arr);
        //arr = {3,6,5,0,8,2,1,9};
        MaxHeap heap = new MaxHeap();
        heap.BuildHeap(arr);
        ArrayIO.printArray(arr);

    }
}