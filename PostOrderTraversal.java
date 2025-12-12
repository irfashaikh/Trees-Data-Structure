
import java.util.Scanner;

public class PostOrderTraversal {
    

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

    static void  postorder (Node root){
        // Base Condition
        if (root == null){              // Inorder works on :- left - root - right.
            return;
        }

        postorder(root.left);                    // For left subtree.          
        postorder(root.right);                   // For right subtree.
        System.out.print(root.data + " ");
    }

    
    public static void main(String[] args) {
        Node root = null ;
        root = PostOrderTraversal.buildTree(root);
        postorder(root);
    }   
}
