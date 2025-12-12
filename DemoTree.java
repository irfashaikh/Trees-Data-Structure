// import java.util.Scanner;

// class DemoTree {
    
//     class Node {
//     int data ;
//     Node left ; 
//     Node right ;

//     Node (int data ){
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }


//     static Node create(){
//         Scanner sc = new Scanner(System.in);
//         // Node root = null ;
//         System.out.println("Enter data : ");
//         int data = sc.nextInt();
//         sc.close();
//         if (data == -1){
//             return null;
//         }

//         Node  root = new Node(data);
//         System.out.println("Enter Left Node of " + root.data);
//         root.left = create();
//         System.out.println("Enter Right Node of "+ root.data);
//         root.right = create();
//         return root;
//     }
    
//     static void Inorder (Node root){
//         if (root.data == -1){
//             return;
//         }
//         Inorder(root.left);
//         System.out.println(root.data);
//         Inorder(root.right);
//     }

//     static void PreOrder(Node root){
//         if (root.data == -1){
//             return;
//         }
//         System.out.println(root.data);
//         PreOrder(root.left);
//         PreOrder(root.right);
//     }

//     static void PostOrder(Node root){
//         if (root.data == -1){
//             return;
//         }
//         PostOrder(root.left);
//         PostOrder(root.right);
//         System.out.println(root.data + " ");
//     }

//     public static void main(String[] args) {
//         Node root = create ();
//         Inorder(root);
//         System.out.println();
//         PreOrder(root);
//         System.out.println();
//         PostOrder(root);
//     }
// }


// }