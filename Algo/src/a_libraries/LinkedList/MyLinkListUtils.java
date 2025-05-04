package a_libraries.LinkedList;



public class MyLinkListUtils {

    public  static SinglyNode generateLinkedList(int arr[]){
        SinglyNode topParent= new SinglyNode();
        SinglyNode adder=topParent;
        adder.val=arr[0];
        for(int i=1;i<arr.length;i++){
            SinglyNode newNode=new SinglyNode();
            newNode.val=arr[i];
            adder.next=newNode;
            adder=adder.next;
        }

        return topParent;

    }

    public static void printTheLinkedList(SinglyNode listNode){
        SinglyNode traversal=listNode;
        while (traversal!=null){
            System.out.print(traversal.val+",");
            traversal=traversal.next;
        }
        System.out.println();
    }
}
