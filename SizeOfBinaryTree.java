
class Node {
    int data ;
    Node left, right;

    Node (int data ){
        this.data = data;
    }
}

public class SizeOfBinaryTree {
    static int count = 0;
    static int calculateSize (Node root){
        if (root == null){
            return 0;
        }
        count++;
        calculateSize(root.left);
        calculateSize(root.right);


        return count;
    }


    public static void main(String[] args) {
        
        Node node  = new Node(10); 
        node.left = new Node(20);
        node.right = new Node(30);
        node.left.left = new Node(60);
        node.right.left = new Node(40);
        node.right.right = new Node(50);


        int ans = calculateSize(node);
        System.out.println(ans);
    }
}
