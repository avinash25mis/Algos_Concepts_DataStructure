package linklist;


import linklist.core.MyLinkListUtils;
import linklist.core.SinglyNode;

public class AddTwo2 {


    public static void main(String[] args) {
        int arr1[]={9,9,9,9,9,9,9};
        int arr2[]={9,9,9,9};
        SinglyNode l1 = MyLinkListUtils.generateLinkedList(arr1);
        MyLinkListUtils.printTheLinkedList(l1);

        SinglyNode l2 = MyLinkListUtils.generateLinkedList(arr2);
        MyLinkListUtils.printTheLinkedList(l2);

        SinglyNode result = addTwoNumbers(l1, l2);
        MyLinkListUtils.printTheLinkedList(result);
    }

    public static SinglyNode addTwoNumbers(SinglyNode l1, SinglyNode l2) {
        SinglyNode result= new SinglyNode();

        SinglyNode  t1=l1;
        SinglyNode  t2=l2;
        SinglyNode re=result;
        int carry=0;
        SinglyNode newNode=null;
        do {
            int v1=0;
            int v2=0;

            if(t1!=null){
                v1=t1.val;
            }

            if(t2!=null){
                v2=t2.val;
            }


            int sum = v1+v2+carry;

            carry=sum/10;

            re.val=sum%10;

            if(t1!=null){
                t1=t1.next;
            }
            if(t2!=null){
                t2=t2.next;
            }
            if(t1!=null || t2!=null) {
                newNode= new SinglyNode();
                re.next=newNode;
                re=re.next;
            }

        }while(t1!=null || t2!=null);

        if(carry!=0){
            newNode= new SinglyNode();
            newNode.val=carry;
            re.next=newNode;
        }

        return result;

    }
}
