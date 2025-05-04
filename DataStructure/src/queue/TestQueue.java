package queue;

import common.MyException;

/**
 * @author avinash.a.mishra
 */
public class TestQueue {

    public static void main(String[] args) throws MyException {
       // testEnqueue();
        testEnqueueAndDequeue();
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
