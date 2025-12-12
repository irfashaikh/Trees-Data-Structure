import java.util.*;

class Node  {
    int data ;
    Node left ;
    Node right ;

    Node (int data ){
        this.data = data;
    }
}

public class MaxWidthOfBinaryTree {
    
    static void calculateMaxWIdth (Node root){

        if (root == null){
            return;
        }

        Queue <Node > q = new LinkedList<>();
        q.add(root);
        int max = 0;

        while (!q.isEmpty()){
            int count = q.size();
            max = Math.max(max, count);

            for (int i=0 ; i<count ; i++){
                Node temp = q.poll();

                if (temp.left != null){
                    q.add(temp.left);
                }

                if (root.right != null){
                    q.add(temp.right);
                }
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Node node  = new Node(10); 
        node.left = new Node(8000);
        node.right = new Node(3000);
        node.left.left = new Node(60);
        node.left.right = new Node(70);
        node.right.left = new Node(1000);
        node.right.right = new Node(5000);
        
        calculateMaxWIdth(node);
    }
}
