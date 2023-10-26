package HeapImpl;

import Array.ArrayIO;

public class MaxHeap {

    //This is build heap for a max heap
    //node from index 0 to index [arrLength/2]flr will only be internal node so
    //we will start from there and from right to left
    public int[] BuildHeap(int[] arr){
        int internalIndex = arr.length/2;

        for(int i=internalIndex;i>=0;i--){
            maxHeapify(arr,i);
        }
        return arr;
    }

    public static void maxHeapify(int[] arr, int index){

        int l=(2*index)+1;
        int r=l+1;
        int largest=index;
        if(l< arr.length && arr[l]>arr[largest])
            largest=l;
        if(r< arr.length && arr[r]> arr[largest])
            largest=r;
        if(largest!=index){
            ArrayIO.swapTwoIndexes(arr,largest,index);
            maxHeapify(arr, largest);
        }
    }
}
