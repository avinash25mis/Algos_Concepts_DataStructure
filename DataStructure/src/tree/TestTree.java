package tree;

import com.tree.core.*;
import tree.core.BinaryTree;
import tree.core.BinaryTreeUtils;

/**
 * @author avinash.a.mishra
 */
public class TestTree {

    /*

      tree
      ----
       2
     /   \
    3     4
   /  \
  5     6

  */

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeUtils.generateBinaryTree();
       // BFS.breathFirstSearch(binaryTree.root);
       // DFS.inOrder(binaryTree.root);
     // DFS.preOrder(binaryTree.root);
       DFS.postOrder(binaryTree.root);
    }









}
