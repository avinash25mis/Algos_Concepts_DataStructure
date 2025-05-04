package a_libraries.LinkedList;

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

   DoublyNode(int data, DoublyNode next){
      this.data=data;
      this.next=next;
   }
}
