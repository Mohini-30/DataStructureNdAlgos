package Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TreeTraversals {

        public static void preOrderTraversal(TreeNode root){
            if(root == null)
                return;
            System.out.print(root.val+ " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        public static void postOrderTraversal(TreeNode root){
            if(root ==null)
                return;
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.val+" ");
        }

        public static void inOrderTraversal(TreeNode root){
            if(root == null)
                return;
            inOrderTraversal(root.left);
            System.out.println(root.val+" ");
            inOrderTraversal(root.right);
        }

        public static void inOrderTraversalWithLoop(TreeNode root){
            //Inorder is interested in left mode , reach to left most node and then can be processed orderly
            // so the internal while loop is for reaching to the leftmost node , and keep on processing afterwards
            Stack<TreeNode> stk = new Stack<>();
            TreeNode curr = root;
            while (curr!=null || !stk.isEmpty()){
                while(curr!= null){
                    stk.add(curr);
                    curr=curr.left;
                }
                curr = stk.pop();
                System.out.print(curr.val +" ");
                curr = curr.right;
            }
        }

        public static void preOrderTraversalWithLoop(TreeNode root){
            Stack<TreeNode> stk = new Stack<>();
            TreeNode curr = root;
            while (curr!=null || !stk.isEmpty()){

                while(curr!=null){
                    System.out.print(curr.val+" ");
                    stk.add(curr);
                    curr=curr.left;
                }
                curr =stk.pop();
                curr=curr.right;
            }
        }

        public static void postorderTraversalWithLoop(TreeNode root){
            Stack<TreeNode> stk = new Stack<>();
            TreeNode curr = root;
            while (curr!=null || !stk.isEmpty()){

                while(curr!=null){
                    stk.add(curr);
                    curr=curr.left;
                }

            }
        }

        public static TreeNode inputTree(){
            Queue<TreeNode> temp = new ArrayDeque<>();
            System.out.println("Enter the root value(-1 represents null)");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            TreeNode root = new TreeNode(n);
            if(root.val!=-1) temp.add(root);

            while(!temp.isEmpty()){
                TreeNode tempRoot = temp.poll();
                TreeNode tempLeft = new TreeNode();
                TreeNode tempRight = new TreeNode();
                System.out.println("Enter left value of "+tempRoot.val);
                tempLeft.val=s.nextInt();
                System.out.println("Enter right value of "+tempRoot.val);
                tempRight.val = s.nextInt();
                if(tempLeft.val!=-1){
                    temp.add(tempLeft);
                    tempRoot.left=tempLeft;
                }
                if(tempRight.val!=-1){
                    temp.add(tempRight);
                    tempRoot.right=tempRight;
                }

            }
            return root;
        }

}
