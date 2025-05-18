package linklist;

/**
 * @author avinash.a.mishra
 */


import linklist.core.MyLinkListUtils;
import linklist.core.SinglyNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
* this was my forst approach which did not worked and did not have carryforward handeling
*
*
* */
class AddTwo1 {

    public static void main(String[] args) {
        int arr1[]={9,9,9,9,};
        int arr2[]={9,9,9};
        SinglyNode l1 = MyLinkListUtils.generateLinkedList(arr1);
        MyLinkListUtils.printTheLinkedList(l1);

        SinglyNode l2 = MyLinkListUtils.generateLinkedList(arr2);
        MyLinkListUtils.printTheLinkedList(l2);
        SinglyNode resultLinkedList = addTwoNumbers(l1, l2);
        MyLinkListUtils.printTheLinkedList(resultLinkedList);
    }

    public static SinglyNode addTwoNumbers(SinglyNode l1, SinglyNode l2) {

        SinglyNode result= new SinglyNode();

        SinglyNode  t1=l1;
        SinglyNode  t2=l2;
        SinglyNode res=result;

        do {
            res.val= t1.val+t2.val;
            t1=t1.next;
            t2=t2.next;
            if(t1!=null && t2!=null) {
                SinglyNode newNode= new SinglyNode();
                res.next=newNode;
                res=res.next;
            }

        }while(t1!=null && t2!=null);

        return result;
    }
}