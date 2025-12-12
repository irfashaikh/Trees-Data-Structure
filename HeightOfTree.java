
public class HeightOfTree {
    
    static class Node {
        int data ;
        Node left ;
        Node  right;

        Node (int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        Node root ;

        int maxDepth (Node root ){

            if (root == null){
                return 0;
            }

            int ld = maxDepth(root.left);     // This recursion part calculate the height of left subtree.
            int rd = maxDepth(root.right);    // This recursion part calculate the height of right subtree.

            int ans = Math.max(ld, rd);

            return ans+1;                   // Add 1 because of root Node.
        } 

    public static void main(String[] args) {
        

        HeightOfTree tree = new HeightOfTree();
 
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println("Height of tree is "+ tree.maxDepth(tree.root));
    }
}
