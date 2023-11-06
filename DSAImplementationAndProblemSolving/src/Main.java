import Array.ArrayIO;
import HeapImpl.MaxHeap;
import Tree.TreeNode;
import Tree.TreeTraversals;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        int[] arr = {3,6,5,0,8,2,1,9};
        ArrayList<Integer> ele = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
            ele.add(arr[i]);
        /*

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

         */

        TreeNode root = TreeTraversals.inputTree();
        TreeTraversals.preOrderTraversal(root);
        System.out.println();
        TreeTraversals.postOrderTraversal(root);
        System.out.println();
        TreeTraversals.inOrderTraversal(root);
        System.out.println();
        TreeTraversals.inOrderTraversalWithLoop(root);
        System.out.println();
        TreeTraversals.preOrderTraversalWithLoop(root);
        System.out.println();
        TreeTraversals.postorderTraversalWithLoop(root);
        System.out.println();
        TreeTraversals.postOrderTraversalWithLoop2(root);

    }
}