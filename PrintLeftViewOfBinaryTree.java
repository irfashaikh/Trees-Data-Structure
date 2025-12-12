import java.util.*;
class Node {
    int data ;
    Node left, right;

    Node (int data ){
        this.data = data;
    }
}

public class PrintLeftViewOfBinaryTree {
    
    static void LeftView (Node root){            // Iterative Approach.
        if (root == null){
            return ;
        }

        Queue <Node > q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();
            for (int i=0 ; i<count; i++){
                Node temp = q.peek();
                q.remove();

                if (i== 0){
                    System.out.print(temp.data + " ");
                }

                if (temp.left != null){
                    q.add(temp.left);
                }

                if (temp.right != null){
                    q.add(temp.right);
                }
            }
        }
    }

    static int maxLevel = 0;
    static void ApproachTwo (Node root , int level ){
        if (root == null){
            return ;
        }

        if (maxLevel < level){
            System.out.print(root.data + " ");
            maxLevel = level;
        }
        ApproachTwo(root.left , level+1);
        ApproachTwo(root.right , level+1);
        // ApproachTwo(root.left, level+1);     // This is for RIGHT VIEW.
    }

    public static void main(String[] args) {
        
        Node node  = new Node(10); 
        node.left = new Node(80);
        node.right = new Node(3000);
        node.left.left = new Node(60);
        node.right.left = new Node(1000);
        node.right.right = new Node(5000);
        // int level = 1;
        // ApproachTwo(node , 1);              // This declaration of Level Vaariable is also fine.

        LeftView(node);
    }
}
