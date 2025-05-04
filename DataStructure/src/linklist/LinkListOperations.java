package linklist;

import linklist.core.DoublyNode;

/**
 * @author avinash.a.mishra
 */
public class LinkListOperations {

private DoublyNode head;

    LinkListOperations(int data){
        DoublyNode node = new DoublyNode();
        node.next=null;
        node.data=data;
        head= node;
    }


    LinkListOperations(){

    }

  public void  addFirst(int data){
      DoublyNode node =new DoublyNode();
      node.data=data;
      if(head==null){
          node.next=null;
          head=node;
        }else{
            node.next=head;
            head=node;
        }
  }


    public void  addLast(int data){
        DoublyNode node =new DoublyNode();
        node.data=data;

        if(head==null){
            node.next=null;
            head=node;
        }else{
            DoublyNode traverser =head;
          while(traverser.next!=null){

              traverser=traverser.next;
          }
            traverser.next=node;

        }
    }

    public void  removeFirst(){
      if(head==null){
          System.out.println("LinkList Empty");
      }else{
          DoublyNode removed=head;
          head= head.next;

          removed=null; //eligible for garbage collection
      }
    }

    public void  removeLast(){
      if(head==null){
          System.out.println("LinkList Empty");
      }else{
          DoublyNode traverser=head;
          while (traverser.next!=null){
               if(traverser.next.next==null){
                   traverser.next=null;
                   //break;  //   this break is imp   or   you can go for including else
               }else {
                   traverser = traverser.next;
               }
          }
      }
    }



   public void  addAtIndex(int index,int data){
        if(index==0){
            addFirst(data);  // very imp condition :-)
        }else{
            DoublyNode newNode=new DoublyNode();
            newNode.data=data;
            newNode.next=null;
            DoublyNode traverser=head;
            for(int i=0;i<index-1;i++)  {   // 1. array start with 0,
               if(traverser!=null) {
                   traverser = traverser.next;
               }
            }

            if(traverser!=null){

                newNode.next=traverser.next;  //always do first for the later link which will disappear
                traverser.next=newNode;
            }
        }
    }



    public void  removeAtIndex(int index){
        if(index==0){
            removeFirst();  // very imp condition :-)
        }else{
            DoublyNode traverser=head;
            for(int i=0;i<index-1;i++)  {   // 1. array start with 0,
                if(traverser!=null) {
                    traverser = traverser.next;
                }
            }

            if(traverser!=null){
                if(traverser.next!=null) {
                    traverser.next = traverser.next.next;
                  /*  MyNode temp = traverser.next;
                    traverser.next=temp.next;*/
                    //Hashtable

                }
            }
        }
    }




    public void show(){
        System.out.println();
        if(head!=null) {
            DoublyNode traverser=head;
            while (traverser.next!=null){
                System.out.print(traverser.data+",");
                traverser=traverser.next;
            }
            System.out.print(traverser.data); //as the last node will also have data

            System.out.println();
            System.out.print("Head is at "+head.data);
        }

    }

}
