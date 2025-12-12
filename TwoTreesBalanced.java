
import java.util.Scanner;

public class TwoTreesBalanced {
    
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


    static boolean isbalance (Node root){

        if (root == null){
            return true;
        }

        boolean option1 = isbalance(root.left);           // option 1 : Diameter lies in root.left subtree.
        boolean option2 = isbalance(root.right);          // option 2 : Diameter lies in root.right subtree.

        boolean diff = Math.abs(height(root.left) - height(root.right) ) <= 1;   // option 3 : It is combination of both subtrees.

        if (option1 && option2 && diff){
            return true;
        }
        else{
            return false;
        }

    }

    static int height (Node root){
        if (root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int ans = Math.max(left , right);
        return ans +1;
    }


    public static void main(String args[])  {
        
        Node root = null ;
        root = TwoTreesBalanced.buildTree(root);
          
        System.out.println("Is Tree Balanced : " + isbalance(root));
    }
}

