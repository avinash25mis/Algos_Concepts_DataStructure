package queue;

import common.MyException;

/**
 * @author avinash.a.mishra
 */
public class TestQueue {

    public static void main(String[] args) throws MyException {
       // testEnqueue();
        //testEnqueueAndDequeue();
        reminderOperatorIncrementLogic();
    }

    /*
    *
    *  when we increment a pointer in a circular queue
    *  pointer = (pointer + 1) % capacity;
    * */
    private static void reminderOperatorIncrementLogic() {
       int capacity = 4;
       int  pointer = -1;
       for(int i=1;i<10;i++){
           pointer=(pointer + 1) % capacity;
           System.out.println("Pointer: "+pointer);
       }
       //since capacity is 4 hence after 3 still again points to 0 (circular case)

    }

    private static void testEnqueueAndDequeue() throws MyException {
        MyQueue queue= new MyQueue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);


        queue.dequeue();      //comment this and test


        System.out.println(queue);
        queue.show();


        queue.enqueue(4);

        System.out.println(queue);
        queue.show();
    }

    private static void testEnqueue() throws MyException {
     MyQueue queue= new MyQueue(4);
     queue.enqueue(1);
     queue.enqueue(2);
     queue.enqueue(3);
     queue.enqueue(4);
     //queue.enqueue(5);
        System.out.println(queue);
        queue.show();
     }
}
