package tree.core;

/**
 * @author avinash.a.mishra
 */
public class Node {
    public int key;
    public Node left, right;



    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
