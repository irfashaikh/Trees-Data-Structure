import java.util.LinkedList;
import java.util.Queue;

public class CalculateHeightLevelOrder {
    
    static class Node {
        int key;
        Node left;
        Node right;
    }
 
    // Utility function to create
    // a new node
    static Node newNode(int key)
    {
        Node temp = new Node();
        temp.key = key;
        temp.left = temp.right = null;
        return temp;
    }

    public static int height (Node root){

        int depth = 0;
        Queue <Node> q = new LinkedList<>();
        q.add(root);                             // Add root to the queue.
        q.add(null);
        
        while (!q.isEmpty()){
            Node temp = q.peek();               // Add front Node to the queue and store it in temp variable.
            q.remove();                         // Remove from the queue.

            if (temp == null){
                depth++;                       // If temp got the null value then increase the depth.
            }

            if (temp != null){                  // Adding the left and the right element to the queue.
                if (temp.left != null){
                    q.add(temp.left);
                }
                else if (temp.right != null){
                    q.add(temp.right);
                }
            }
            else if (!q.isEmpty()){               
                q.add(null);
            }
        }
        return depth ;
    }


    public static void main(String args[])
    {
        Node root = newNode(1);
        root.left = newNode(2);
        root.right = newNode(3);
 
        root.left.left = newNode(4);
        root.left.right = newNode(5);
 
        System.out.println("Height(Depth) of tree is: " + height(root));
    }
}
