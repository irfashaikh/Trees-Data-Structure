import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data ;
    Node left, right;

    Node (int data ){
        this.data = data;
    }
}

public class PrintKElementFromTree {
    
    static void traverse (Node root , int k){  // the function print all the element on the k-level on Tree.
        if (root == null){
            return;
        }
        if (k == 0 ){
            System.out.print(root.data + " ");
        }
        k = k-1;
        traverse(root.left, k);
        traverse(root.right, k);
    }

    static int ans = 0;
    static int height (Node root){
        if (root == null){
            return 0;
        }
        ans = Math.max(height(root.left) , height(root.right) )+1;
        return ans;
    }

    static void levelOrderTraversal (Node root ){
        
        Queue <Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.peek();
            System.out.print(temp.data + " ");
            q.remove();
            if (temp.left != null){
                q.add(temp.left);
            }
            if (temp.right != null){
                q.add(temp.right);
            }
        }
    }

    static void levelOrderTraversalWithSpace (Node root){

        Queue <Node > q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while ( q.size()>1) {
            Node temp = q.peek();
            q.remove();

            if (temp == null){
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(temp.data + " ");

            if (temp.left != null){
                q.add(temp.left);
            }
            if (temp.right != null){
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        Node node  = new Node(10); 
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(60);
        node.right.left = new Node(40);
        node.right.right = new Node(50);

        // int k = 2 ;
        // PrintKElementFromTree.traverse(node, k);
        // System.out.println();

        PrintKElementFromTree.levelOrderTraversalWithSpace(node);
    }
}
