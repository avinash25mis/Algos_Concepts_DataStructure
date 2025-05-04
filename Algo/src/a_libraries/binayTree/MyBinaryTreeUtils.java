package a_libraries.binayTree;

/**
 * @author avinash.a.mishra
 */
public class MyBinaryTreeUtils {

    /*        1
           2      3
    *    4   5   6   7
    *                   8
    * */

    public static BinaryTree generateBinaryTree(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
       // tree.root.right.right.right = new Node(8);
        return tree;
    }


}
