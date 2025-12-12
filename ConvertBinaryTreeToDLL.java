
class Node{
    int data;
    Node left ;
    Node right;

    Node (int data){
        this.data = data;
    }
}


public class ConvertBinaryTreeToDLL {
    
    static Node prev = null ;
    static Node convert (Node root){
        if (root == null){
            return root;
        }

        Node head = convert(root.left);    // Left Recursive Call.

        if (prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;

        convert(root.right);                // Right Recursive Call.

        return head;
    }

    static void printDLL(Node root){
        while (root != null){
            System.out.print(root.data + " ");
            root = root.left;
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

        convert(node);
        printDLL (node);
    }
}
