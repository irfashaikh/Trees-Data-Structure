import java.util.Stack;

class Node
{
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
// Class to print the inorder traversal
class InorderTraversalWithoutRecursion
{
    Node root;

    void inorder(){
        if (root == null)    // Base Condition.
            return;

        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        while (curr != null || s.size() > 0){    // Traverse the current pointer till it will be NULL and stack is not empty.
            while (curr !=  null){                // if current is not null then push the element into the stack.
                s.push(curr);                     
                curr = curr.left;
            }

            curr = s.pop();       // that means current at the bottom of left subtrees.the pop the last element (s.pop()).
 
            System.out.print(curr.data + " ");  // print the data.

            curr = curr.right;            // After printing the data make the current for right suntree.

            // In this way we can achieve the inorder traversal 

            // leftTree -> root -> rightTree 
        }
    }
 
    public static void main(String args[])
    {
        // Creating a binary tree and entering
        // the nodes
        InorderTraversalWithoutRecursion tree = new InorderTraversalWithoutRecursion();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inorder();
    }
}
