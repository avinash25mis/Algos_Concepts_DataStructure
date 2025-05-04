package linklist.core;

/**
 * @author avinash.a.mishra
 */
public class SinglyNode {
  public int val;
  public SinglyNode next;
  public SinglyNode() {}
  public SinglyNode(int val) { this.val = val; }
  public SinglyNode(int val, SinglyNode next) { this.val = val; this.next = next; }

}
