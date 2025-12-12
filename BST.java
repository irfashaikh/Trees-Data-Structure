


// class BST {

//     static class Node {
//         int data ;
//         Node left ;
//         Node right;

//         Node (int data ){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }


//     static Node insert(Node root , int val){
//         if (root == null){
//             root = new Node(val);
//             return root;
//         }

//         if (root.data > val){       //left subtree
//             root.left = insert(root.left, val);         // root.left hold the node of right subtree
//         }

//         if (root.data < val ){    // right subtree
//             root.right= insert(root.right, val);           // root.right hold the node of right subtree
//         }

//         return root;

//     }


//     static void inorder (Node root ){
//         if (root == null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static void main(String[] args) {
//         int [] arr = {5,6,3,28,1};
//         Node root = null;

//         for (int i=0 ; i< arr.length ; i++){
//             root = insert(root, arr[i]);
//         }

//         inorder(root);
//     }
// }