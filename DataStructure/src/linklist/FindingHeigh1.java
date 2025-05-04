package linklist;


import tree.core.BinaryTree;
import tree.core.BinaryTreeUtils;
import tree.core.Node;

/**
 * @author avinash.a.mishra
 */
public class FindingHeigh1 {

    public static void main(String[] args) {
        BinaryTree binaryTree = BinaryTreeUtils.generateBinaryTree();
        int i = heightOfTree(binaryTree.root);
        System.out.println(i);


    }



    private static int heightOfTree(Node node) {

        if(node ==null){
            return 0;
        }else{
            int heightL = heightOfTree(node.left);
            int heightR = heightOfTree(node.right);
            if(heightL>heightR) {
                return heightL + 1; //
            }else{
                return heightR +1 ;
            }
        }

    }

}
