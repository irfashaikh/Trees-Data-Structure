import java.util.Scanner;

public class DiameterOfTree {
    
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


    static int Diameter (Node root){

        if (root == null){
            return 0;
        }

        int option1 = Diameter(root.left);           // option 1 : Diameter lies in root.left subtree.
        int option2 = Diameter(root.right);          // option 2 : Diameter lies in root.right subtree.

        int option3 = height(root.left) + height(root.right) + 1;   // option 3 : It is combination of both subtrees.

        int ans = Math.max(option1, Math.max(option2 , option3));
        return ans;

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
        root = DiameterOfTree.buildTree(root);
          
        System.out.println("Diameter id : " + Diameter(root));
    }
}
