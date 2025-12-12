// import java.util.Scanner;

// public class deletion {
    
    
//     class Node {
//         int data ;
//         Node left ;
//         Node right ;

//         Node (int data ){
//             this.data = data ;
//             this.left = null ;
//             this.right = null;
//         }
//     }

//     static void insert(Node root , int data){
//         if (root == null){
//             root = new Node(data);
            
//         }
//         if (root.data > data){
//             insert(root.left, data);
//         }
//         else{
//             insert(root.right , data);
//         }
//     }

//     static void insertInto( Node root ){
//         Scanner sc = new Scanner(System.in);
//         int data = sc.nextInt();

//         while (root.data == -1){
//             insert(root, data);
//             data = sc.nextInt();
//         }
//     }


//     static Node delete ( Node root , int data){
//         if (root == null){
//             return root ;
//         }

//         if (root.data == data){
//             // 0 child 
//             if (root.right == null && root.left == null){
//                 return null ;
//             }

//             //  1 child 
//             // Left child 
//             if (root.right == null && root.left != null){
//                 Node temp = root.left ;
//                 return temp ;
//             }  
//             // Right child 
//             if (root.right != null && root.left == null){
//                 Node temp = root.right ;
//                 return temp;
//             }


//             // 2 child
//             if (root.left != null && root.right != null){
//                 int mini = minval(root.right).data;  // calculate min value from root.right OR calculate max value from root.left.
//                 root.data = mini ;                   // replace the mini value with root.data. 
//                 root.right = delete(root.right , mini); // delete the value from mini variable.
//                 return root;
//             }

//         }
//         else if (root.data >data){
//             root.left = delete(root.left, data);
//             return root ;
//         }
//         else{
//             root.right = delete(root.right, data);
//             return root ;
//         }
//     }


//     public static void main(String[] args) {
//         Node root = null ;

//         insertInto (root );
//     }
// }
