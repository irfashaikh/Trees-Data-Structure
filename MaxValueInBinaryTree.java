import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data ;
    Node left, right;

    Node (int data ){
        this.data = data;
    }
}


public class MaxValueInBinaryTree {

    static int max = 0 , count= 0;
    static int calculateMaxValue (Node root){
        if (root == null){
            return 0;
        }

        count = root.data;
        max = Math.max (max , count);

        calculateMaxValue(root.left);
        calculateMaxValue(root.right);
        // count = root.data;
        // max = Math.max (max , count);

        return max;
    }

    static int ApproachTwo (Node root){
        if (root == null){
            return 0;
        }

        return Math.max(root.data , Math.max(ApproachTwo(root.left), ApproachTwo(root.right)));
    }

    // Iterative Approach.

    static int ApproachThree (Node root){         
        if (root == null){
            return 0;
        }
        int max = 0 ;
        Queue <Node > q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();
            max = Math.max(max, temp.data);
            if (temp.left != null){
                q.add(temp.left);
            }

            if (temp.right != null){
                q.add(temp.right);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        Node node  = new Node(10); 
        node.left = new Node(8000);
        node.right = new Node(3000);
        node.left.left = new Node(60);
        node.right.left = new Node(1000);
        node.right.right = new Node(5000);

        int ans = ApproachThree(node);
        System.out.println(ans);
    }
}
