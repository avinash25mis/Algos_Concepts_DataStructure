package queue;

import common.MyException;


import java.util.Arrays;

/**
 * @author avinash.a.mishra
 */
public class MyQueue {
    private int front;
    private int rear;
    private int capacity;  //we need to apply formula during increment [ front=(front+1) % capacity ]
    private int size; // queue can be  circular , arr.length  will not give correct value

    int arr[];

    MyQueue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        size=rear=front=0;
    }

    MyQueue(){

        this(4);
        //passing a default capacity when user doesn't provide it
    }


    //method to check if queue is empty
    boolean isEmpty(MyQueue queue)
    {
        return (queue.size == 0);
    }


    //method to return first element of queue
    private int front() {
    if(isEmpty(this)){
        return -1;   //considerd as  -1/0/Integer.MIN_VALUE/ throw Exception
    }
        int value=arr[front];
        return value;
    }

    //method to return last element of queue
    private int rear(){
        if(isEmpty(this)){
            return -1;
        }
        int value=arr[rear];
        return  value;
    }



    public void enqueue(int value) throws MyException {
        if(size==capacity){
            throw new MyException("Queue Full");
        }
        arr[rear]=value;
        rear=(rear + 1) % capacity;
        size++;
    }



    public int dequeue() throws MyException {
       if(isEmpty(this)){
           throw new MyException("Queue is Empty");
       }
        int value= front();
        front = (front+1) % capacity; //intresting  that the fornmula remains the same (toggling fornt/rear)
        size--;
       return value;

    }


    /*
     * Q1 if we are putting a check if size==capacity  then how can it  be circular ?
     * Q2 how we will add more element?
     *
     * Ans 1 the queue is circular due to  "% capacity"
     * Ans 2 we can add more element after dequeue operation
     *
     * */


    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr) ;

    }

    /*
    * it is not easy to show the content of
    * a circular queue ,kindly observe below
    *
    * */

    public void show(){
       int frontIndex=front;
        System.out.print("Actual Queue :");
        for(int i=0;i<size;i++){
            System.out.print(arr[frontIndex]+" , ");
            frontIndex=(frontIndex+1)%capacity;
        }

        System.out.println();
    }
    /*
    * Always remember in stack & queue donot change the pointers (i.e variable like rear/front/top ) just to show content of
    *  the array,Hence we wrote  int frontIndex=front;  in the begning of show
    *
    * */
}
