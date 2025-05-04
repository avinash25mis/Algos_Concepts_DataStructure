package tree.interview;

import tree.DFS;
import tree.core.BinaryTree;
import tree.core.Node;

public class CreateBTreeFromArray {


    /*
    * 1 2 3 4 5 6
    *
    * if node is i
    *
    * left child  2*i + 1
    * right child 2*i + 2
    *
    *     1
    *   /   \
    *  2     3
    * /  \   /
    * 4   5  6
    *
    * */


    public static void main(String[] args) {
       CreateBTreeFromArray cbt=new CreateBTreeFromArray();
        int arr[]={1,2,3,4,5,6};
        BinaryTree tree= new BinaryTree();
        tree.root=cbt.insertLevelOrder(arr,0);

        DFS.inOrder(tree.root);
    }

    private Node insertLevelOrder(int[] arr, int i) {
        Node node= null;

        if(i<arr.length){
          node=new Node(arr[i]);
            node.left = insertLevelOrder(arr,2*i+1);
            node.right = insertLevelOrder(arr,2*i+2);
        }
        return node;
    }

}
