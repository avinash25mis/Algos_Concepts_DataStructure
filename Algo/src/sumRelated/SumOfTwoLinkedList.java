package sumRelated;

import a_libraries.LinkedList.MyLinkListUtils;
import a_libraries.LinkedList.SinglyNode;

public class SumOfTwoLinkedList {

    public static void main(String[] args) {
        SinglyNode l1 = MyLinkListUtils.generateLinkedList(new int[]{});
        SinglyNode l2 = MyLinkListUtils.generateLinkedList(new int[]{});
    }


    public SinglyNode addTwoNumbers(SinglyNode l1, SinglyNode l2) {
        SinglyNode dummyHead = new SinglyNode(0);
        SinglyNode p = l1, q = l2;
        SinglyNode curr = dummyHead;// we need it so that the initial logic of initilizing the head is catered
                                      // and all logic start from "curr.next = new SinglyNode(sum % 10)";
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y; //imp
            carry = sum / 10;   //imp
            curr.next = new SinglyNode(sum % 10);
            curr = curr.next; //moving pointer to next
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) { // final carry over
            curr.next = new SinglyNode(carry);
        }
        return dummyHead.next;
    }
}
