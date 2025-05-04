package linklist.core;

/**
 * @author avinash.a.mishra
 */
public class DoublyNode {

   public int size;
   public int data;
   public DoublyNode next;
   public DoublyNode prev;

   public DoublyNode(){

   }

  public DoublyNode(int data, DoublyNode next){
      this.data=data;
      this.next=next;
   }
}
