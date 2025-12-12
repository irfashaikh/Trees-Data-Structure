import java.util.Scanner;

public class CountLeafNodes {
    
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

    static int count = 0;

    static void getLeafCount (Node root ){
        
        if (root == null){
            return;
        }

        getLeafCount (root.left);
        if (root.left == null && root.right == null){
            count++;
        }
        getLeafCount(root.right);

    }

    public static void main(String args[])  {
        
        Node root = null ;
        root = CountLeafNodes.buildTree(root);
          
        CountLeafNodes.getLeafCount(root);
        System.out.println("The Leaf Nodes are : "+ count);
    }
}

