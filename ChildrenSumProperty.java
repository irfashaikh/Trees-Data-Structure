
class Node {
    int data ;
    Node left ;
    Node right ;

    Node (int data ){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class ChildrenSumProperty {
    
    static boolean CalculateSum (Node root){
        if (root == null || root.right == null && root.left == null){
            return true;
        }

        if (root.data == root.left.data + root.right.data){
            return true;
        }

        CalculateSum(root.left);
        CalculateSum(root.right);

        return false;
    }

    public static void main(String[] args) {
        
        Node node  = new Node(10); 
        node.left = new Node(8);
        node.right = new Node(2);
        node.right.left = new Node(2);
        node.left.right = new Node(5);

        System.out.println(CalculateSum(node));
    }

}
