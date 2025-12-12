
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data ;
    Node left, right;

    Node (int data ){
        this.data = data;
    }
}

public class levelOrderTraversal {
    
    static void LevelOrderTraversal (Node root ){
        
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


    static void AnotherApproach (Node root){

        if (root == null){
            return;
        }

        Queue <Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();

            for (int i=0 ; i<count ; i++){
                Node temp = q.poll();
                System.out.print(temp.data + " ");

                if (temp.left != null){
                    q.add(temp.left);
                }

                if (temp.right != null){
                    q.add(temp.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Node node  = new Node(10); 
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(60);
        node.right.left = new Node(40);
        node.right.right = new Node(50);


        levelOrderTraversal.AnotherApproach(node);
    }
}
