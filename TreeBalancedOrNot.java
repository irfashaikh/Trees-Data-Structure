
class Node {
    int data ;
    Node left ;
    Node right ;

    Node (int data){
        this.data = data;
    }
}


public class TreeBalancedOrNot {
    
    static int CalculateHeight (Node root){
        if (root == null){
            return 0;
        }

        int left = CalculateHeight(root.left);
        int right = CalculateHeight(root.right);

        return Math.max(left, right)+1;
    }

    static boolean BalancedOrNot(Node root){
        if (root == null){
            return true;
        }
        int left = CalculateHeight(root.left);
        int right = CalculateHeight(root.right);

        if (Math.abs(right - left) < 1){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        // Node node  = new Node(10); 
        // node.left = new Node(8);
        // node.right = new Node(2);
        // node.left.left = new Node(2);
        // node.left.right = new Node(5);
        // node.right.right = new Node(2);
        // node.right.right.left = new Node(5);

        Node node  = new Node(10); 
        node.left = new Node(8);
        node.right = new Node(2);

        System.out.println(BalancedOrNot(node));
    }
}
