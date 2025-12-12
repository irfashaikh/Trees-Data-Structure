
import java.util.Scanner;

public class MaxNumberInTree {
    
    static class Node {
        int data ;
        Node left;
        Node right;

        Node(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Scanner sc = new Scanner(System.in);

    static Node buildTree (Node root){
        
        System.out.println("Enter Node : ");
        int data = sc.nextInt();
        root  = new Node(data);

        if(data == -1){
            return null;
        }

        System.out.println("Enter data for inserting left of " + data);
        root.left = buildTree(root.left);
        System.out.println("Enter data for inserting right of " + data);
        root.right = buildTree(root.right);

        return root;
    }

    static int sum = 0 , sum2 = 0;
    static int maxSum (Node root){
        if (root == null){
            return 0;
        }

        maxSum(root.left);
        maxSum(root.right);

        sum2 = root.data;
        sum = Math.max(sum, sum2);
        return sum;
    }
    public static void main(String args[])  {
        
        Node root = null ;
        root = MaxNumberInTree.buildTree(root);
        System.out.println(maxSum(root));
    }
}



// 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1