package HeapImpl;

import Array.ArrayIO;

import java.util.ArrayList;

public class MaxHeap {

    //This is build heap for a max heap
    //node from index 0 to index [arrLength/2]flr will only be internal node so
    //we will start from there and from right to left
    public ArrayList<Integer> BuildHeap(ArrayList<Integer> arr){
        int internalIndex = arr.size()/2;
        for(int i=internalIndex;i>=0;i--){
            maxHeapify(arr,i);
        }
        return arr;
    }

    private void maxHeapify(ArrayList<Integer> arr, int index){
        int l=(2*index)+1;
        int r=l+1;
        int largest=index;
        if(l< arr.size() && arr.get(l)>arr.get(largest))
            largest=l;
        if(r< arr.size() && arr.get(r)> arr.get(largest))
            largest=r;
        if(largest!=index){
            ArrayIO.swapTwoIndexes(arr,largest,index);
            maxHeapify(arr, largest);
        }
    }


    public ArrayList<Integer> HeapPop(ArrayList<Integer> arr){

        ArrayIO.swapTwoIndexes(arr,0,arr.size()-1);
        arr.remove(arr.size()-1);
        maxHeapify(arr,0);
        return arr;
    }

    public ArrayList<Integer> HeapPush(ArrayList<Integer> arr,int val){
        arr.add(val);
        percolateUp(arr,arr.size()-1);
        return arr;
    }

    public ArrayList<Integer> IncreaseKey(ArrayList<Integer> arr, int index, int val){

        if(arr.get(index)>val)
            System.out.println("attempting wrong");
        arr.set(index,val);
        percolateUp(arr,index);
        return arr;
    }

    public ArrayList<Integer> DecreaseKey(ArrayList<Integer> arr, int index, int val){

        if(arr.get(index)<val) {
            System.out.println("attempting wrong");
            return arr;
        }
        arr.set(index,val);
        maxHeapify(arr,index);
        return arr;
    }

    private void percolateUp(ArrayList<Integer> arr, int index){
        int i = index;
        while(i>=0 && arr.get(i/2) < arr.get(i)){
            ArrayIO.swapTwoIndexes(arr,i,i/2);
            i=i/2;
        }
    }

}
