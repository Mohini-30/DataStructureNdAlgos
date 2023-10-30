import Array.ArrayIO;
import HeapImpl.MaxHeap;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        int[] arr = {3,6,5,0,8,2,1,9};
        ArrayList<Integer> ele = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            ele.add(arr[i]);
        MaxHeap heap = new MaxHeap();
        heap.BuildHeap(ele);
        ArrayIO.printArray(ele);
        heap.HeapPop(ele);
        ArrayIO.printArray(ele);
        ArrayIO.printArray(heap.HeapPush(ele,10));
        ArrayIO.printArray(heap.HeapPush(ele,7));
        ArrayIO.printArray(heap.IncreaseKey(ele,5,10));
        ArrayIO.printArray(heap.DecreaseKey(ele,2,11));
        ArrayIO.printArray(heap.DecreaseKey(ele,2,4));
    }
}