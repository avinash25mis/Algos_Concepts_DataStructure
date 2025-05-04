package tree;

import tree.core.Node;

public class Height {

/*
* for each individual parent root it takes out the left-height and right height
* example the lowest leaf node  left-height=0 && right-height =0  hence it returns 0+1
* similary at each level above it it keeps on adding last-left-height+1
*
*
* */

    public static int heightOfTree(Node node) {

        if(node ==null){
            return 0;
        }else{
            int heightL = heightOfTree(node.left);
            int heightR = heightOfTree(node.right);
            if(heightL>heightR) {
                return heightL + 1;
            }else{
                return heightR +1 ;
            }
        }

    }
}
