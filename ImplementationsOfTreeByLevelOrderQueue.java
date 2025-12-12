import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class ImplementationsOfTreeByLevelOrderQueue {
    
    static class Node {
        int data ;
        Node left ;
        Node right ;

        Node (int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static void BuildFrommlevelOrder (Node root){

        Queue <Node> q = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Node :- ");
        int data = sc.nextInt();

        root = new Node(data);
        q.add(root);

        while (!q.isEmpty()){
            Node temp  = q.peek();
            q.remove();

            System.out.println("Enter left Node for:- "+ temp.data);
            int leftdata = sc.nextInt();

            if (leftdata != -1){
                temp.left = new Node(leftdata);
                q.add(temp.left);
            }

            System.out.println("Enter right Node for:- "+ temp.data);
            int rightdata = sc.nextInt();

            if (rightdata != -1){
                temp.right = new Node(rightdata);
                q.add(temp.right);
            }
        }  
        sc.close();
    }

    // We can only print this tree with the levelOrderTraversal.
    // we can't print with inorder , preorder , postorder because we are removing the element from the queue.

    public static void main(String[] args) {
        
        Node root = null;
        BuildFrommlevelOrder(root);
    }
}
