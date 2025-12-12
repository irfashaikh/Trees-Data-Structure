import java.util.Scanner;

public class InsertTreeImplementatiion {
    
    
    class Node  {
        int data ;
        Node left ;
        Node right ;

        Node (int data ){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }
    }

    static Scanner sc = new Scanner(System.in);
    
    static Node buildTree (Node root){
        System.out.println("Enter the Node : ");
        int data = sc.nextInt();
        root = new Node(data);

        if (data == -1){
            return null;
        }

        System.out.println("Enter the data to the left of ");
        root.left = buildTree(root.left);
        System.out.println("Enter of the data to the right of the tree : ");
        root.right = buildTree(root.right);
        return root;
    }

    static void rotate (Node root){
        if (root == null){
            return ;
        }
        rotate (root.left);
        System.out.print(root.data + " ");
        rotate (root.right);
    }

