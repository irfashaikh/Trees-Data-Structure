import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeImplementation {
    
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
    
    static void LevelOrderTraversal (Node root){
        Queue <Node> q = new LinkedList<>();
        q.add(root);

        System.out.println("Tree Nodes are : ");
        
        while (!q.isEmpty()){
            Node temp = q.peek();
            System.out.print( temp.data + " ");
            q.remove();

            if (temp.left.data != -1){
                q.add(temp.left);
            }
        
            if (temp.right.data != -1){
                q.add(temp.right);
            }
        }
    }

    // 1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1

    public static void main(String[] args) {
        Node root = null ;
        root = TreeImplementation.buildTree(root);
        LevelOrderTraversal(root);
    }
}
