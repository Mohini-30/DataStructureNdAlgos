package Tree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class TreeTraversals {

        public static void preOrderTraversal(TreeNode root){
            if(root == null)
                return;
            System.out.print(root.val+ " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }


        public static TreeNode inputTree(){
            Queue<TreeNode> temp = new ArrayDeque<>();
            System.out.println("Enter the root value(-1 represents null)");
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            TreeNode root = new TreeNode(n);
            if(root.val!=-1)temp.add(root);
            while(!temp.isEmpty()){

                TreeNode tempRoot = temp.poll();
                TreeNode tempLeft = new TreeNode();
                TreeNode tempRight = new TreeNode();
                System.out.println("Enter left value of "+tempRoot.val);
                tempLeft.val=s.nextInt();
                System.out.println("Enter left value of "+tempRoot.val);
                tempRight.val = s.nextInt();
                tempRoot.left=tempLeft;
                tempRoot.right=tempRight;
                if(tempLeft.val!=-1)temp.add(tempLeft);
                if(tempRight.val!=-1)temp.add(tempRight);

            }
            return root;
        }

}
