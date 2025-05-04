package linklist;


import linklist.core.MyLinkListUtils;
import linklist.core.SinglyNode;

public class Reversal {

    public static void main(String[] args) {
        int arr[]={2,4,6,8,0};
        SinglyNode listNode = MyLinkListUtils.generateLinkedList(arr);
        MyLinkListUtils.printTheLinkedList(listNode);
       // ListNode reversed=reverseTwoStartingPointer(listNode);
        SinglyNode reversed=reverseThreeStartingPointer(listNode);
        MyLinkListUtils.printTheLinkedList(reversed);
    }

    private static SinglyNode reverseThreeStartingPointer(SinglyNode listNode) {
        SinglyNode prev=null;
        SinglyNode curr=listNode;
        SinglyNode next=null;

        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        listNode=prev;
        return  listNode;
    }

    private static SinglyNode reverseTwoStartingPointer(SinglyNode listNode) {
        SinglyNode prev = null;
        SinglyNode curr = listNode;

        while (curr!= null) {
            SinglyNode next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        listNode=prev; //this is make new head

        return listNode;
    }
}
