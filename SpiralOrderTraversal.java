import java.util.*;

class Node {
    int data ;
    Node left ;
    Node right ;

    Node  (int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}



public class SpiralOrderTraversal {

    static void printElement (Node root){
        if (root == null){
            return;
        }

        Queue <Node> q = new LinkedList<>();
        Stack <Integer> s = new Stack<>();

        boolean reverse = false;
        q.add(root);

        while (!q.isEmpty()) {
            int count = q.size();

            for (int i= 0; i<count ; i++){
                Node temp = q.poll();

                if (reverse){
                    s.add(temp.data);
                }
                else{
                    System.out.print(temp.data + " ");
                }

                if (temp.left != null){
                    q.add(temp.left);
                }
                if (temp.right != null){
                    q.add(temp.right);
                }
            }
            if (reverse){
            while(!s.isEmpty()){
                System.out.print(s.pop() + " ");
            }
        }
            reverse = !reverse;
            System.out.println();
        }   
    }
     public static void main(String[] args) {
        
        Node node  = new Node(10); 
        node.left = new Node(8000);
        node.right = new Node(3000);
        node.left.left = new Node(60);
        node.left.right = new Node(70);
        node.right.left = new Node(1000);
        node.right.right = new Node(5000);

        printElement(node);
     }
}