package tree;


/*
* DFS is divided into 3 categories
* 1.Inorder    -parent/root is printed after left child before right child
* 2.Pre Order  -parent/root is printed first
* 3.Post Order -parent/root is printed last
*
* */

/*

      tree
      ----
       2
     /   \
    3     4
   /  \
  5     6

(a) Inorder (Left, Root, Right) : 5 3 6 2 4
(b) Preorder (Root, Left, Right) : 2 3 5 6 4
(c) Postorder (Left, Right, Root) : 5 6 3 4 2

*/





import tree.core.BinaryTree;
import tree.core.BinaryTreeUtils;
import tree.core.Node;

public class DFS {



    public static void inOrder(Node node){
        if(node==null){
            return;
        }

            inOrder(node.left);
            System.out.print(node.key+" ");
            inOrder(node.right);

    }

    public static void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key+" ");
            preOrder(node.left);
            preOrder(node.right);

    }


    public static void postOrder(Node node){
        if(node==null) {
           return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+" ");

    }


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
        DFS.preOrder(binaryTree.root);
       // DFS.postOrder(binaryTree.root);
    }


}
