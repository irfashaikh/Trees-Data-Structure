// import java.util.Scanner;

// public class creation {
    

//     class Node {
//         int data ;
//         Node left ;
//         Node right ;

//         Node (int data ){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     static Node insertIntoBST(Node root , int data ){

//         if ( root == null){
//             root = new Node(data);
//             return root ;
//         }

//         if (data < root.data ){
//             root.left = insertIntoBST(root.left, data);
//         }
//         else{
//             root.right = insertIntoBST(root.right , data);
//         }

//         return root;
//     }


//     static void takeInput (Node root){
//         Scanner sc = new Scanner(System.in);
//         int data ;
//         data = sc.nextInt();

//         while (data != -1){
//             root = insertIntoBST(root , data);
//             data = sc.nextInt();
//         }


//     }

//     static void traversal (Node root ){
//         if (root == null){
//             return;
//         }

//         traversal(root.left);
//         System.out.print(root.left + " ");
//         traversal(root.right);
//     }



//     public static void main(String[] args) {
//         Node root = null;
        
//         System.out.println("Enter data in BST : ");

//         takeInput(root);
//         traversal(root);
//     }
// }
