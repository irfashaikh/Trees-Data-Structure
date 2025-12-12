// import java.util.Scanner;

// class Node {
//     int data ;
//     Node left ;
//     Node right;

//     Node (int data){
//         this.data = data ;
//         this.left = null ;
//         this.right = null ;
//     }
// }

// public class Sum {
    
//     static int count=0;
//     static Node create(){

//         Scanner sc = new Scanner(System.in);
//         Node root = null;

//         System.out.println("Enter data: ");
//         int data = sc.nextInt();

//         if (data == -1){
//             return null;
//         }

//         root = new Node(data);
//         System.out.println("Enter left Node of " + root.data);
//         root.left = create();
//         System.out.println("Enter right Node of " + root.data);
//         root.right = create();
//         return root;
//     }

//     static int PostOrder(Node root){
//         if (root.data == -1){
//             return -1;
//         }

//         PostOrder(root.left);
//         PostOrder(root.right);
        
//         if (root.left.data + root.right.data != root.data){
//             count = 1;
//         }
//         return count;
//     }



//     public static void main(String[] args) {
//         Node root = create();
//         // PostOrder(root);
//         int p = PostOrder(root);
//         if (p == 0){
//             System.out.println("The Given Binary tree is true");
//         }
//         else{
//             System.out.println(" It is wrong !!!");
//         }
//     }
// }
