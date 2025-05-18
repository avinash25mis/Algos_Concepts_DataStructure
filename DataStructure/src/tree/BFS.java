package tree;

import tree.core.BinaryTree;
import tree.core.BinaryTreeUtils;
import tree.core.Node;

public class BFS {

/*

      tree
      ----
       2
     /   \
    3     4
   /  \
  5     6

*/


    public static void breathFirstSearch(Node root) {
        int h = Height.heightOfTree(root);
        System.out.println("height :"+h);
        for (int i=1; i<=h; i++) {
            printGivenLevel(root, i);
        }
    }


    /*   tree is traversed from the root till the level provided is reached
    left part of tree is traversed and when we reach provide level  it  printes
    right part of tree is traversed and when  we reach provide level  it  printes

    How we decide that level is reached ??

    every time printGivenLevel() is called for a "level" value, we travel from root
    to reach that level value, by decrementing  the provided "level" value to 1
    ie at "level==1", we print it
   */
    private static void printGivenLevel(Node node, int level) {
        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.key + " ");
        }
        else if (level > 1) {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }

    /*
     * just a way to remember
     * logic consist of 2 "ifs" and one "else if"
     * */





    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeUtils.generateBinaryTree();
        BFS.breathFirstSearch(binaryTree.root);
    }
}




