package tree.core;

/**
 * @author avinash.a.mishra
 */
public class BinaryTreeUtils {

    /*

      tree
      ----
       2
     /   \
    3     4
   /  \
  5     6

  */

    public static BinaryTree generateBinaryTree(){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(6);

        return tree;
    }


}
